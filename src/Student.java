public class Student extends Person{

    int studentId;
    public Student(){
        super();
    }

    public String getStudentName() {
        return super.name;
    }
    public void setStudentName(String studentName) {
        super.name = studentName;
    }

    public int getStudentage() {
        return super.age;
    }
    public void setStudentage(int studentAge) {
        super.age = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
