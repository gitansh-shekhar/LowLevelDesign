package CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class VideoPipeline {
    private List<VideoCommand> tasks;
    VideoPipeline(){
        tasks = new ArrayList<>();
    }

    void addTask(VideoCommand vc){
        tasks.add(vc);
    }

    void processTasks(){
        for(VideoCommand vc : tasks){
            vc.excute();
        }
        tasks = new ArrayList<>();
    }
}
