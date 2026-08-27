package CommandDesignPattern;

public class ThumbnailTaskCommand implements VideoCommand{

    @Override
    public void excute() {
        System.out.println("Generating Thumbnail for the video");
    }
}
