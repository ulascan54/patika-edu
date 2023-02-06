let taskList = []
if(localStorage.getItem("taskList") !== null) {
    taskList = JSON.parse(localStorage.getItem("taskList"));
}

displayTasks();

function displayTasks() {
    ul = document.getElementById("list");
    ul.innerHTML = "";
    

    for (let task of taskList) {

      let li = `
      <li onclick="checkListItem(${task.id})" id="${task.id}">
          ${task.taskName}<button
          class="btn btn-link"
          type="button"
          onclick="deleteTask(${task.id})"
        >
          <i class="fa-solid fa-xmark"></i>
        </button>
        </li>  
`;
        

      ul.insertAdjacentHTML("beforeend", li);
    }
  }


function checkListItem(id) {
    let checkedID;
    for(let item in taskList){
        if(taskList[item].id == id){
            checkedID = item;
        }
    }
    let classList = document.getElementById(`${checkedID}`).classList;
    if (classList.contains("checked")){
        classList.remove("checked")
    }else{
        classList.add("checked");
    }
}
document.querySelector("#task").addEventListener("keypress", function(e) {
    if ((e.key==="Enter")) {
        e.preventDefault()
        newElement()
    }
  });
document.querySelector("#liveToastBtn").addEventListener("onclick", newElement);
document.querySelector("#liveToastBtn").addEventListener("click", showToast);
function newElement() {
    let task = document.querySelector("#task");
    if(task.value == "") {
        var toast2DOM = document.querySelector("#liveToast2")
        var toast2 = new bootstrap.Toast(toast2DOM)
        toast2.show()
    }else{
        taskList.push({
            id: taskList.length,
            taskName: task.value
        })
        displayTasks();
        showToast();
        task.value = "";
        localStorage.setItem("taskList", JSON.stringify(taskList))
    }
}

function showToast() {
    let task = document.querySelector("#task")
    if(!task.value == ""){
        var toastDOM = document.querySelector("#liveToast")
        var toast = new bootstrap.Toast(toastDOM)
        toast.show()
    }
}


function deleteTask(id) {
    let deletedID;
    for (let index in taskList) {
        if(taskList[index].id == id) {
            deletedID = index;
        }
    }
    
    taskList.splice(deletedID, 1);
    displayTasks();
    localStorage.setItem("taskList", JSON.stringify(taskList))
}