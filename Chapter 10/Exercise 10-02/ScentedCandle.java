public class ScentedCandle extends Candle
{
    protected String scent;
    public String getScent(){
        return scent;
    }
    public void setScent(String scent){
        this.scent = scent;
    }

    @Override
    public void setHeight(int height){
        this.height = height;
        price = height * 3;
    }
}
