public class Candle
{
    protected String color;
    protected int height;
    protected double price;

    public String getColor(){
        return color;
    }
    public int getHeight(){
        return height;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setHeight(int height){
        this.height = height;
        price = height * 2;
    }
}
