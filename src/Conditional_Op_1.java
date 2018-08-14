import java.util.Scanner;
public class Conditional_Op_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = x < 5 ? (x*x - 3*x + 4) : x + 7;
        System.out.println(y);
    }
}
