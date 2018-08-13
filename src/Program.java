import java.util.Scanner;
public class Program
{
 /*
    public static void main(String[] args)
    {
        test();
    }


    public static void test()
    {
        Animals animals = new Animals();

        animals.SetName("Nastya");
        animals.SetAge(20);

        System.out.println(animals.GetName() + " " + animals.GetAge());
    }
*/
    public static void main(String[] args)
    {
    /*
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("Enter the number, corresponding to the figure, information about which you would like to find: ");

        Scanner in = new Scanner(System.in);
        int fig = in.nextInt();
        if ( fig == 1 || fig == 2)
        {
            System.out.println("1. Perimeter");
            System.out.println("2. Square");
            System.out.println("3. Diagonal");
            System.out.println("Enter the number, corresponding to the information, that you would like to find: ");
            int option = in.nextInt();
            if (fig == 1)
            {
                System.out.println("Введите радиус окружности: ");
                double r = in.nextDouble();

                Circle circle = new Circle();
                circle.SetRadius(r);

                if (option == 1)
                    System.out.println("Circle Perimeter: " + circle.Perimeter());
                else if (option == 2)
                    System.out.println("Circle Square: " + circle.Square());
                else
                    System.out.println("Circle Diagonal: " + circle.Diagonal());
            }
            else
            {
                Rectangle rectangle = new Rectangle();

                System.out.println("Введите сторону a: ");
                double a = in.nextDouble();

                rectangle.SetA(a);

                System.out.println("Введите сторону b: ");
                double b = in.nextDouble();

                rectangle.SetB(b);

                if (option == 1)
                    System.out.println("Rectangle Perimeter: " + rectangle.Perimeter());
                else if (option == 2)
                    System.out.println("Rectangle Square: " + rectangle.Square());
                else
                    System.out.println("Rectangle Diagonal: " + rectangle.Diagonal());
            }
        }

        else
        {
            Triangle triangle = new Triangle();

            System.out.println("Введите сторону a: ");
            double a = in.nextDouble();
            triangle.SetA(a);

            System.out.println("Введите сторону b: ");
            double b = in.nextDouble();
            triangle.SetB(b);

            System.out.println("Введите сторону c: ");
            double c = in.nextDouble();
            triangle.SetC(c);

            System.out.println("1. Perimeter");
            System.out.println("2. Square");
            System.out.println("Enter the number, corresponding to the information, that you would like to find: ");
            int option = in.nextInt();

            if (option == 1)
                System.out.println("Rectangle Perimeter: " + triangle.Perimeter());
            else
                System.out.println("Rectangle Square: " + triangle.Square());
        }
    */
        MyString str = new MyString("A ta ta");
        System.out.println(str.GetMyString());
        System.out.println(str.MyConcat(". I like apples."));
    }
}
