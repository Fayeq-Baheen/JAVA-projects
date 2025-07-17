public class CourseProject {
//    DATAFIELDS
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;
//    CONSTRUCTOR
    public CourseProject(String courseName){
        this.courseName = courseName;
    }
//    GET COURSE NAME METHOD
    public String getCourseName(){
        return courseName;
    }
//    ADD STUDENT METHOD
    public void addStudent(String student){
            students[numberOfStudents] = student;
            numberOfStudents++;
    }
//    DROP STUDENT METHOD
    public void dropStudent(String student){
            boolean bb = false;
            int x = 0;
            for(int j = 0; j < numberOfStudents; j++){
                for(int z = 0; z < student.length() && z < students[j].length(); z++){
                    if(student.charAt(z) == students[j].charAt(z)) {
                        bb = true;
                        x = j;
                    }
                    else {
                        bb = false;
                        break;
                    }

                }
                if(bb){
                    for(int a = x; a < numberOfStudents; a++){
                        String temp = students[a];
                        students[a] = students[a+1];
                        students[a+1] = temp;
                    }
                    System.out.println("Student "+students[numberOfStudents]+" dropped successfully.");
                    students[numberOfStudents] = "";
                    numberOfStudents--;
                    break;
                }
            }
            if(!bb)
                System.out.println("Student not found.");
    }
//    GET STUDENTS NAMES
    public String[] getStudents(){
        return students;
    }
//    GET NUMBER OF STUDENTS
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}