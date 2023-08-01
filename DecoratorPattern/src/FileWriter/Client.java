package FileWriter;

public class Client {
    public static void main(String[] args) {
        File file = new File();
        file.fileName = "Test File";

        FileWriter fileWriter = new EncodeFileWriter(new CompressFileWriter(new NormalFileWriter()));
        fileWriter.writeFile(file);

        fileWriter = new EncodeFileWriter(new NormalFileWriter());
        fileWriter.writeFile(file);
    }
}
