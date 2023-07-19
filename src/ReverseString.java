import java.util.Scanner;

public class ReverseString {
    static void reverse(String str)
    {
        char ch[]=str.toCharArray();
        int n=str.length();
        for (int i=n-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        reverse(str);
    }
}
