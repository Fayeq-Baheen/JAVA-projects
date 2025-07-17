import java.util.*;
public class CourseProjectTest {
    public static void studentOpt(CourseProject cp){
        Scanner input = new Scanner(System.in);
//        CHOICE SELECTION
        System.out.println("Enter 1 to print students names\nEnter 2 to get number of students\nEnter 3 to add student" +
                "\nEnter 4 to drop student\nEnter 5 to print course name");
        int choose = input.nextInt();
//        CHECKING THE CHOICE
        switch (choose) {
            //        PRINTING THE NAME OF STUDENTS OF THE COURSE
            case 1:
                String[] courseStudents = cp.getStudents();
                System.out.println("This course students count is: " + cp.getNumberOfStudents());
                for (int i = 0; i < cp.getNumberOfStudents(); i++) {
                    System.out.println((i+1) + ". " + courseStudents[i]);
                }
                break;
            //        PRINT THE NUMBER OF STUDENTS OF THE COURSE
            case 2:
                System.out.println("This course students count is: " + cp.getNumberOfStudents());
                break;
            //        ADDING STUDENTS
            case 3:
                System.out.println("Enter number of students you want to add in course: ");
                int inp = input.nextInt();
                System.out.println("Enter name of students you want to add in course: ");
                for (int i = 1; i <= inp; i++) {
                    System.out.print(i + " : ");
                    String name = input.next();
                    cp.addStudent(name);
                }
                break;
//                DROPPING STUDENT
            case 4:
                if(cp.getNumberOfStudents() > 0){
                    System.out.println("Enter name of the student you want to drop: ");
                    String name = input.next();
                    cp.dropStudent(name);
                }else
                    System.out.println("No student in this course.");
                break;
//                GET THE COURSE NAME
            case 5:
                System.out.println("The course name is: " + cp.getCourseName());
                break;
//                INVALID INPUT
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

//        MAKING OBJECTS
        CourseProject english = new CourseProject("English");
        CourseProject math = new CourseProject("Math");
        CourseProject java = new CourseProject("JAVA");

//        SELECTING THE COURSE
        System.out.println("Enter 1 for English course\nEnter 2 for Math course\nEnter 3 for JAVA course\nEnter 0 to end the program:");
        int choice = input.nextInt();
        do{
//            CHECKING THE COURSE SELECTION
            switch (choice){
                case 1:
                    studentOpt(english);
                    break;
                case 2:
                    studentOpt(math);
                    break;
                case 3:
                    studentOpt(java);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
//        SELECTING THE COURSE
            System.out.println("Enter 1 for English course\nEnter 2 for Math course\nEnter 3 for JAVA course\nEnter 0 to end the program:");
            choice = input.nextInt();
        }while (choice != 0);
    }
}