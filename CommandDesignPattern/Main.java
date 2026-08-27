package CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        VideoPipeline videoPipeline = new VideoPipeline();

        VideoCommand thumbnailTask  = new ThumbnailTaskCommand();
        VideoCommand watermarkTask = new WatermarkTaskCommand();
        VideoCommand encodingTask  = new EncodingTaskCommand();
        videoPipeline.addTask(thumbnailTask);
        videoPipeline.addTask(watermarkTask);
        videoPipeline.addTask(encodingTask);
        videoPipeline.processTasks();
    }
}
