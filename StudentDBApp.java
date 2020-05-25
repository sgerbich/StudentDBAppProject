import java.util.Scanner;

public class StudentDBApp {
    public static void main(String[] args) {
        


        System.out.print("enter number of students to enroll:  ");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];
        for(int n=0;n<numOfStudents;n++){
        students[n]= new Student();
        students[n].enroll();
        students[n].payTuition();
        
        }
        for(int i=0; i< numOfStudents;i++){
        System.out.println(students[i].showInfo());
        }
    }
}