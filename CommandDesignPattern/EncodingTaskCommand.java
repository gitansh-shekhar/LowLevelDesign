package CommandDesignPattern;

public class EncodingTaskCommand implements VideoCommand{
    @Override
    public void excute() {
        System.out.println("Changing video formate from mp4 to WebM");
    }
}
