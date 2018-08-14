import java.util.Scanner;
public class Conditional_Op_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long x = in.nextInt();
        long y = x < 10 ? (x*x - 2*x + 4) : x*x*x + 5*x;
        System.out.println(y);
    }
}