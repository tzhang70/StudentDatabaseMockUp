import java.util.Scanner;

public class Student 
{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 100000000;
    private boolean upperDiv = false;
    //constructor: prompt user to enter student's name and year 
    public Student() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scan.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = scan.nextLine();
        
        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n");
        this.gradeYear = scan.nextInt();
        if(this.gradeYear == 3 || this.gradeYear == 4)
        {
            setUpperDiv();
        }
        setStudentID();
        scan.close();
    }
    //generate an id
    private void setUpperDiv()
    {
        this.upperDiv = true;
    }
    private void setStudentID()
    {
        id++;
        //Grade Level + static id (1000)
        this.studentID = "" + id;
    }
    //enroll in courses
    public void enroll()
    {
        //get inside a loop, user hits Q
        do
        {
            System.out.print("Enter a course to enroll (Q to quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if(!course.equals("Q"))
            {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else 
            {
                break;
            }
        }
        while(1 != 0);
        
    }
    //view balance
    public void viewBalance()
    {
        System.out.println("Your balance is $" + tuitionBalance);
    }
    
    //pay tuition
    public void payTuition()
    {
        viewBalance();
        System.out.print("Enter your payment $:");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    
    //show status
    public String toString()
    {    
        String upperDivision = "false";
        if(this.upperDiv == true)
        {
            upperDivision = "true";
        }
        return "Name: " + firstName + " " + lastName + 
                "\nGrade Level: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled: " + courses + 
                "\nBalance: $" + tuitionBalance +
                "\nUpper division status: " + upperDivision;
        
    }
}
