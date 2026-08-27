package CompositeDesignPattern.fileManagementSystem;

public class Main {

    public static void main(String[] args) {
           Folder root = new Folder("root");
           File file = new File("Hello");
           File file2 = new File("There");
           root.saveFile(file);root.saveFile(file2);

           Folder folder = new Folder("Book");
           root.saveFolder(folder);
           File f3 = new File("Rich");
           File f4 = new File("Dad");
           folder.saveFile(f3);
           folder.saveFile(f4);
           Folder folder1 = new Folder("Chapters");
           folder.saveFolder(folder1);
           File f5 = new File("Chapter 1");
           File f6 = new File("Chapter 2");
           folder1.saveFile(f5);
           folder1.saveFile(f6);
           root.opnenAll(1);


    }
}
