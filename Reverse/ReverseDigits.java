package JavaProgramming.Reverse;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseDigits{

    public ArrayList<Integer> reverse(int num) {
        // int number = num;
        ArrayList<Integer> arr = new ArrayList<>();
        while (num>0) {
            
            int remainder = num %10;
            arr.add(remainder);
            num /=10;
            System.out.println("The result: "+num);
        }
        
        return arr;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to reverse it :");
        int num = scan.nextInt();
        ReverseDigits rev = new ReverseDigits();
        ArrayList<Integer> result =  rev.reverse(num);
        System.out.println("The result: "+result);
    }
}
