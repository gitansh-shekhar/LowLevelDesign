package CompositeDesignPattern.fileManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileSystemItem{
    private String name;
    private List<IFileSystemItem> list;
    Folder(String name){
        list = new ArrayList<>();
        this.name = name;
    }
    @Override
    public void ls(int indent) {
        for(IFileSystemItem item : list){
            printindent(indent);
            System.out.println("+"+item.getName());
        }
    }

    @Override
    public void opnenAll(int indent) {
         for(IFileSystemItem item : list){
             if(item.isFolder()){
                 printindent(indent);
                 System.out.println(item.getName());
                 item.opnenAll(indent+1);
             }
             else{
                 item.opnenAll(indent+1);
             }
         }
    }


    @Override
    public IFileSystemItem cd(String name) {
        for(IFileSystemItem item : list) {
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
    void printindent(int x){
        for(int i=0;i<x;i++) System.out.print(" ");
    }
    void saveFile(File f){
        list.add(f);
    }
    void saveFolder(Folder f){
       list.add(f);
    }
}
