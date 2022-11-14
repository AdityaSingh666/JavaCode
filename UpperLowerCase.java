import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        System.out.println("Enter any Character");
        Scanner sc = new Scanner(System.in);
        char s = (sc.next()).charAt(0);
        if(s>='A' && s<='Z'){
            System.out.println("It is UpperCase");
        }else {
            System.out.println("It is LowerCase");
        }
        sc.close();
    }
}
