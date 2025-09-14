import java.util.Scanner;

public class ReverseString1 {
    
    public String Reverse(String word){
        String reversed = "";

        for(int i =word.length()-1;i>=0;i--){
            reversed += word.charAt(i);
        }
        return reversed;
        }
        
    
    public static void main(String[] args) {
        ReverseString1 revs = new ReverseString1();
        System.out.println("Enter the String: ");
        Scanner input = new Scanner(System.in);
        System.out.println(revs.Reverse(input.next()));
    }
}

// ------------1ST METHOD(MANUAL SWAPPING)----------
// String original = "hello";
// char[] chars = original.toCharArray();

// for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
//     char temp = chars[i];
//     chars[i] = chars[j];
//     chars[j] = temp;
// }

// String reversed = new String(chars);
// System.out.println("Reversed: " + reversed);

//------------- 2ND METHOD--------------------------
// String original = "hello";
// String reversed = "";

// for (int i = original.length() - 1; i >= 0; i--) {
//     reversed += original.charAt(i);
// }

// System.out.println("Reversed: " + reversed);
