package  JavaProgramming.Reverse;

public class ReverseDigits1 {
  
    public int ReverseNum(int num){
    int result = 0;

        while(num>0){
            int remainder = num%10;
            num /=10;
            result = result * 10 +remainder;
        }
        return result;
    }
    public static void main(String[] args){
        ReverseDigits1 rev = new ReverseDigits1();
        int num = 12345;
        System.out.println(rev.ReverseNum(num));

    }
}
