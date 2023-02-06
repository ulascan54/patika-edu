var body = document.getElementById("body")
var text=""
fetch("https://jsonplaceholder.typicode.com/users").then(response => response.json()
).then(responseJS => {
    for (let i = 0; i < responseJS.length; i++) {
        text+=`
        <div class='container' style='width:300px'>

          <div class='card'>
            <img class='card-img-top' src='https://www.w3schools.com/bootstrap4/img_avatar1.png' alt='Card image' style='width:100%'>
            <div class='card-body'>
            <h2>#${responseJS[i].id} ${responseJS[i].name} <br> ${responseJS[i].username}</h2>
              <pclass='card-text'>Website:<br>${responseJS[i].website}</p>
              <pclass='card-text'>Mail:<br>${responseJS[i].email}</p>
              <pclass='card-text'>Phone:<br>${responseJS[i].phone}</p>
              <a href='https://${responseJS[i].website}' class='btn btn-primary' target="_blank">See Profile</a>
              </div>
        </div>
        </div>
        `
    }
    body.innerHTML=text
    console.log(responseJS);

})