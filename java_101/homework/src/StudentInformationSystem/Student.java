package StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addBulkExamNote(int not1, int s1, int not2, int s2, int not3, int s3) {
        if (not1 >= 0 && not1 <= 100 && s1 >= 0 && s1 <= 100) {
            c1.note = not1;
            c1.sNote = s1;
            c1.calcGno(c1.note, c1.sNote);
        }
        if (not2 >= 0 && not2 <= 100 && s2 >= 0 && s2 <= 100) {
            c2.note = not2;
            c2.sNote = s2;
            c2.calcGno(c2.note, c2.sNote);
        }
        if (not3 >= 0 && not3 <= 100 && s3 >= 0 && s3 <= 100) {
            c3.note = not3;
            c3.sNote = s3;
            c3.calcGno(c3.note, c3.sNote);
        }
    }

    void isPass() {
        if (this.average > 55)
            System.out.println("Sınıfı geçtiniz");
        else
            System.out.println("Sınıfta kaldınız");
    }


    void calcAverage() {
        this.average = (c1.gno + c2.gno + c3.gno) / 3;
    }


    @Override
    public String toString() {
        return "Student{" +
                "c1=" + c1 + "\n" +
                ", c2=" + c2 + "\n" +
                ", c3=" + c3 + "\n" +
                ", name='" + name + '\'' + "\n" +
                ", studentNo='" + studentNo + '\'' + "\n" +
                ", classes='" + classes + '\'' + "\n" +
                ", average=" + average + "\n" +
                ", isPass=" + isPass + "\n" +
                '}' + average;
    }
}
