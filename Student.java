import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance=0;
    private static int costOfCourse= 600;
    private static int id =1000;

    public Student(){
        Scanner input = new Scanner(System.in);

        System.out.print("enter student first name: ");
        this.firstName = input.nextLine();

        System.out.print("enter student last name: ");
        this.lastName = input.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level: ");
        this.gradeYear = input.nextInt();
        setStudentID();
        // System.out.println(firstName + " " + lastName + " "+ gradeYear+ " "+ studentID);
        
    }

    private void  setStudentID(){
        id++;
        this.studentID = gradeYear +"" + id;
        
    }

    public void enroll(){
        do{
            System.out.println("hit q to quit");
            Scanner input =new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("q")){
                courses = courses + "\n " + course;
                tuitionBalance =tuitionBalance+costOfCourse;
            }
            else{break;}
        }while (true);
        // System.out.println("enrolled in: " + courses);
        // System.out.println("tuition balance: " + tuitionBalance);
    }

    public void viewBalance(){
        System.out.println("your balance is: $"+tuitionBalance);
    }

    public void payTuition(){
        System.out.print("enter your payment $");
        Scanner input= new Scanner(System.in);
        int payment=input.nextInt();
        tuitionBalance= tuitionBalance - payment;
        System.out.println("thank you for your payment of $" + payment);
        viewBalance();
    }

    public String showInfo(){
        return "name: " + firstName+ " "+ lastName+
                "\nGrade  Level: "+ gradeYear+
                "\nStudent ID: "+ studentID+
                "\nCourses Enrolled: "+ courses+
                "\nBalance: "+ tuitionBalance;
    }
}