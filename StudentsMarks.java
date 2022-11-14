import java.util.Scanner;

public class StudentsMarks {
    public static void main(String[] args) {
        System.out.println("Enter Roll NO.");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        System.out.println("Enter Name");
        sc.next();
        System.out.println("Enter marks in First Subject");
        // Scanner sc2 = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.println("Enter marks in Second Subject");
        // Scanner sc3 = new Scanner(System.in);
        float d = sc.nextFloat();
        System.out.println("Enter marks in Third Subject");
        //Scanner sc4 = new Scanner(System.in);
        float e = sc.nextFloat();
        float total = c + d + e;
        System.out.println("Total Marks is "+total);
        float percentage = (c + d + e)/3;
        System.out.println("Percentage is "+percentage);
        if(percentage >= 90){
            System.out.println("Grade A");
        }else if(percentage >= 70){
            System.out.println("Grade B");
        }else if(percentage >= 60){
            System.out.println("Grade C");
        }else if(percentage >= 50){
            System.out.println("Grade D");
        }else{
            System.out.println("Gread F");
        }
        sc.close();
        sc.close();
        sc.close();
        sc.close();
        sc.close();
    }
}
