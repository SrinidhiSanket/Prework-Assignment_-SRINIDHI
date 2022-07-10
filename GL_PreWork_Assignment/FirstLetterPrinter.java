import java.util.Scanner;

public class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
       System.out.println(firstLetterPrinter(input));
       in.close();
       }
       
       static String firstLetterPrinter(String str) {
        // write your code here
        char c[] = str.toCharArray();      
        for (int i=0; i < c.length; i++) {
         // Logic to implement first character of each word in a string
         if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) {
            System.out.println(c[i]);
         }
        }
        return str;
       
        } 
}
