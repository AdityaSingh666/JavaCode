import java.util.Scanner;

public class MonthsDays {
    public static void main(String[] args) {
        System.out.println("Press 1 for Jan");
        System.out.println("Press 2 for Feb");
        System.out.println("Press 3 for Mar");
        System.out.println("Press 4 for Apr");
        System.out.println("Press 5 for May");
        System.out.println("Press 6 for Jun");
        System.out.println("Press 7 for July");
        System.out.println("Press 8 for Aug");
        System.out.println("Press 9 for Sep");
        System.out.println("Press 10 for Oct");
        System.out.println("Press 11 for Nov");
        System.out.println("Press 12 for Dec");
        System.out.println("Select Month, and see no. of days in a Month");
        Scanner sc = new Scanner(System.in);
        int Select = sc.nextInt();
        if(Select == 1){
            System.out.println("Days in Jan is 31");
        }else if(Select == 2){
            System.out.println("Days in Feb is 28");
            System.out.println("Days in Feb is 29 in case of leap Year");
        }else if(Select == 3){
            System.out.println("Days in Mar is 31");
        }else if(Select == 4){
            System.out.println("Days in Apr is 30");
        }else if(Select == 5){
            System.out.println("Days in May is 31");
        }else if(Select == 6){
            System.out.println("Days in Jun is 30");
        }else if(Select == 7){
            System.out.println("Days in July  is 31");
        }else if(Select == 8){
            System.out.println("Days in Aug is 31");
        }else if(Select == 9){
            System.out.println("Days in Sep is 30");
        }else if(Select == 10){
            System.out.println("Days in Oct is 31");
        }else if(Select == 11){
            System.out.println("Days in Nov is 30");
        }else{
            System.out.println("Days in Dec is 31");
        }
        sc.close();

    }
}
