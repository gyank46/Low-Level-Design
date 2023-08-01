package FileWriter;

public class EncodeFileWriter implements FileWriter{
    public FileWriter fileWriter;
    @Override
    public void writeFile(File file) {
        fileWriter.writeFile(encodeFile(file));
    }

    public EncodeFileWriter(FileWriter fileWriter){
        this.fileWriter=fileWriter;
    }

    public File encodeFile(File file){
        System.out.println("Encoding File: "+file.fileName);
        return file;
    }
}
