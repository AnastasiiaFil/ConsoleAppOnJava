import java.util.Scanner;
public class Odd_Even
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number % 2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}
