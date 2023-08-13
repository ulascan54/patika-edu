package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut hoca", "+9055995999", "TRH");
        System.out.println(t1);
        Teacher t2 = new Teacher("Graham Bell", "0000", "FZK");
        Teacher t3 = new Teacher("Kül Yutmaz", "111", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH",0.20);
        Course fizik = new Course("Fizik", "102", "FZK",0.10);
        Course biyo = new Course("Biyoloji", "103", "BIO",0.15);
        tarih.setTeacher(t1);
        tarih.setTeacher(t2);
        System.out.println(tarih.teacher.toString());

        Student s1 = new Student("İnek Şaban", "123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,100,50,30,100,20);
        s1.calcAverage();
        s1.isPass();


        System.out.println(s1);
    }


}
