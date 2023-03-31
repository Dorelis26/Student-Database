import java.util.Scanner;

public class student {

    private String  name;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance =0;
    private static int courseCost =600;
    private static int id=1000;

    //constructor prompt user to enter students name and year
public student(){
    Scanner scan = new Scanner(System.in);
    System.out.println("\n enter student first name");
    this.name =scan.nextLine();

    System.out.println("enter student first last name");
    this.lastName =scan.nextLine();

    System.out.println("1.freshman\n2.softmore\n3.junior\n4.senior\nenter student grade year : ");
    this.gradeYear =scan.nextInt();

    setStudentId();
    
}

    // generate an id

private void setStudentId(){
    id++;
//grade level + ID
 this.studentId= gradeYear + ""+ id;
}
    //enroll in corses
public void enroll(){
    //git inside a loop and user hits 0 when they are finish enrolling
        do{
        System.out.println("\nEnter a course to enroll: (Q to quit) \n");
        Scanner scan = new Scanner(System.in);
        String course = scan.nextLine();
        if (!course.toLowerCase().equals("q") ){
            courses = courses + "\n" + course;
            //everytime we add a course we will increase the tuition balance 
            tuitionBalance= tuitionBalance +courseCost;
        }
        else{break;}
        System.out.println("\nenroll in "+ course+ "\n");
        
    }while(1!=0);
   
    }


     //view balance 

     public void viewBalace(){
      System.out.println("You have a total balance od $"+tuitionBalance); 

        
     }
    
     //pay tuition
    //request user how much they would like to pay 

    public void payTuition(){
        viewBalace();
        System.out.println("\nEneter your payent\n");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = (tuitionBalance - payment);
        System.out.println("\nthank you for your payment of $" + payment+"\n");
        viewBalace();
    }
    
    //show info

    public String showInfo(){
        return "Name: "+name + " "+ lastName +"\nStudent ID"+studentId+ "\nCourses Enrolled: "+ courses + "\nBalance: "+tuitionBalance;
    }
 
}

   
   

