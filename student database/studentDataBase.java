import java.util.Scanner;

public class studentDataBase {
    public static void main(String[] args) {
        //ask how many new students we want to add

        Scanner scan =new Scanner(System.in);
        System.out.println("enter number of new students to enroll: ");
        int numOfStudents =scan.nextInt();
        student[] students=new student[numOfStudents];
    

   
    
    //create number of new students
    for(int i =0;i<numOfStudents;i++){
        students[i]= new student();
        students[i].enroll();
        students[i].payTuition();
        
    }
    for(int i=0;i<numOfStudents;i++){
        System.out.println(students[i].toString());
    }
}
}
