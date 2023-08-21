public class TextFile {

    private String fileName;
    private String content;

    TextFile(String name, String content){
        this.content = content;
        this.fileName = name;
    }
    public void save(){
        System.out.println("Saving the file.");
    }

    public void open(){
        System.out.println("Opening the file.");
    }
    public void rename(){
        System.out.println("Renaming the file.");
    }

}
