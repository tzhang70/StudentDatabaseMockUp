import java.util.Scanner;

public class StudentDatabase
{
    public static void main(String[] args) 
    {
        //ask how many new users we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];
        
        
        for(int i = 0; i < numOfStudents; i++)
        {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
        for(int i = 0; i < numOfStudents; i++)
        {
            System.out.println(students[i].toString());
        }
        scan.close();
    }
}
