import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Özel karakter içermeyen bir kelime giriniz :");
        String word = inp.nextLine();
        if(isPalindrome(word)){
            System.out.println(word + " bir palindromik kelimedir.");
        }else {
            System.out.println(word + " bir palindromik kelime değildir.");
        }
    }

    static boolean isPalindrome(String checkWord) {
        for (int i = 0; i < checkWord.length() / 2; i++) {
            if (checkWord.charAt(i) != checkWord.charAt(checkWord.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}