import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("Enter Cost Price");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Enter Selling Price");
        
        Scanner sc2 = new Scanner(System.in);
        
        int b = sc2.nextInt();
        int C = b-a;
        if(C>0){
           
            System.out.println("Profit is "+C);

        }
        else{
            
            System.out.println("Los is "+C);
        }
        sc1.close();
        sc2.close();
    }

}
