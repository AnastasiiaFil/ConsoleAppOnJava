public class Circle extends Figures
{
    private double radius;

    public void SetRadius (double Radius)
    {
        this.radius = Radius;
    }

    public double Perimeter ()
    {
        return 2 * Math.PI * radius;
    }

    public double Square ()
    {
        return Math.PI * radius * radius;
    }

    public double Diagonal ()
    {
        return 2 * radius;
    }
}
