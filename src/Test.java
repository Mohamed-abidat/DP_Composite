import comp.File;
import comp.Folder;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Design Patterns");
        Folder folder1 = (Folder) root.addComponent(new Folder("Behavioral"));
        Folder folder2 = (Folder) root.addComponent(new Folder("Creational"));
        Folder folder3 = (Folder) root.addComponent(new Folder("Structural"));
        folder1.addComponent(new File("Strategy"));
        folder1.addComponent(new File("Observer"));
        folder2.addComponent(new File("Decorator"));
        folder2.addComponent(new File("Adapter"));
        folder3.addComponent(new File("Singleton"));
        folder3.addComponent(new File("AbstractFactory"));
        root.show();
    }
}
