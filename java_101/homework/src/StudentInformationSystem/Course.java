package StudentInformationSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

    double sNotePrc;
    double gno;

    public Course(String name, String code, String prefix, double sNotePrc) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sNote = 0.0;
        this.sNotePrc = sNotePrc;
        this.gno = 0.0;
    }

    public void setTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor...");
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", prefix='" + prefix + '\'' +
                ", note=" + note +
                '}';
    }

    public double calcGno(double n, double s) {
        this.note = n * (1 - this.sNotePrc);
        this.sNote = s * this.sNotePrc;
        this.gno = this.note + this.sNote;
        return this.gno;
    }
}
