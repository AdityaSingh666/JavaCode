import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
       System.out.println("Enter Alphabet");
       Scanner sc = new Scanner(System.in);
       char s = (sc.nextLine()).charAt(0);
       if(s == 'a'|| s == 'e' || s == 'i' || s == 'o' || s == 'u'){
        System.out.println("It is Vowel");
       }else if(s == 'A'|| s == 'E' || s == 'I' || s == 'O' || s == 'U'){
        System.out.println("It is Vowel");
    }else{
        System.out.println("It is Consonant");
    }
    sc.close();
}

}
