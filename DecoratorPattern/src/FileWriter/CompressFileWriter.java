package FileWriter;

public class CompressFileWriter implements FileWriter{
    FileWriter fileWriter;
    File file;
    @Override
    public void writeFile(File file) {
        fileWriter.writeFile(compressFile(file));
    }

    public CompressFileWriter(FileWriter fileWriter){
        this.fileWriter = fileWriter;
    }

    public File compressFile(File file){
        System.out.println("Compressing File: "+file.fileName);
        return file;
    }
}
