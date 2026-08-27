package CompositeDesignPattern.fileManagementSystem;

public class File implements IFileSystemItem{
    private String name;
    File(String name){
        this.name = name;
    }
    @Override
    public void ls(int indent) {
        for(int i=0;i<indent;i++){
            System.out.print(" ");
        }
        System.out.println(name);
    }

    @Override
    public void opnenAll(int indent) {
        for(int i=0;i<indent;i++){
            System.out.print(" ");
        }
        System.out.println(this.name+" Opened.");
    }

    @Override
    public IFileSystemItem cd(String name) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}
