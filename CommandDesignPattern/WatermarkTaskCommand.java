package CommandDesignPattern;

public class WatermarkTaskCommand implements VideoCommand{
    @Override
    public void excute() {
        System.out.println("Adding Company watermark to Video");
    }
}
