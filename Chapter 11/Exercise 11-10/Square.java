public class Square extends GeometricFigure
{
    private double area;
    public Square(int w, int h, String f)
    {
        super(h, w, f);
    }

    public double figureArea(int w, int h)
    {
        return w * h;
    }
}
