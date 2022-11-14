import java.util.Scanner;

public class CheckLatter {
    public static void main(String[] args) {
        System.out.println("Enter any Key.");
        Scanner sc = new Scanner(System.in);
        char s = (sc.nextLine()).charAt(0);
        if(s>='0' && s<='9'){
            System.out.println("it is a Digit");
        }else if(s == '@' || s == '$' || s == '%' || s == '*' || s == '~' || s == '#'){
          System.out.println("it is a Special Character");
        }else{
            System.out.println("it is a Charactor");
        }
        sc.close();

    }
}
