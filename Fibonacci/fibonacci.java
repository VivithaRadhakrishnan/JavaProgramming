package Fibonacci;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
                
        System.out.println("Enter the count of digits to be generated");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        System.out.print("The number generated: "+first +" "+ second);
        for (int i=2;i<count;i++ ){
        int temp = first+second;
        first = second;
        second = temp;
        System.out.print(" " +temp);
    }
    }
}
