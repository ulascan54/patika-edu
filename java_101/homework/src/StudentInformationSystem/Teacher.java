package StudentInformationSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", mpno='" + mpno + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
