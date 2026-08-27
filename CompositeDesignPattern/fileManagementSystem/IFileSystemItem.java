package CompositeDesignPattern.fileManagementSystem;

public interface IFileSystemItem {
    void ls(int indent);
    void opnenAll(int indent);
    IFileSystemItem cd(String name);
    String getName();
    boolean isFolder();
}
