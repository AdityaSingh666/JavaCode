import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        System.out.println("Enter Employee Id");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        System.out.println("Enter Employee Name");
        Scanner sc1 = new Scanner(System.in);
        sc1.next();
        System.out.println("Enter Employee Basic Salary");
        Scanner sc2 = new Scanner(System.in);
        float Salary = sc2.nextFloat();
        float HRA = (Salary*50)/100;
        float DA = (Salary*10)/100;
        float TA = (Salary*40)/100;
        float MA = (Salary*30)/100;
        float PF  = (Salary*5)/100;
        float GS = Salary + HRA + DA + TA + MA ;
        float TAX = (GS*10)/100;
        float NS = GS - PF - TAX;
        System.out.println("HRA is "+HRA);
        System.out.println("DA is "+DA);
        System.out.println("TA is "+TA);
        System.out.println("MA is "+MA);
        System.out.println("PF is "+PF);
        System.out.println("GS is "+GS);
        System.out.println("TAX is "+TAX);
        System.out.println("NS is "+NS);
        sc.close();
        sc1.close();
        sc2.close();
        
    }
}
