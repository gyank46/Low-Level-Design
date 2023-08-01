package FileWriter;

public class NormalFileWriter implements FileWriter {

    public NormalFileWriter() {
    }

    @Override
    public void writeFile(File file) {
        System.out.println("Write file normally " + file.fileName);
    }
}
