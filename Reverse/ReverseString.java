public class ReverseString {

    public String Reverse(String word){
        String Reverse = new StringBuilder(word).reverse().toString();
        return Reverse;
    }

    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        String word = "HelloWorld";
        System.out.println(rs.Reverse(word));
    }
}
