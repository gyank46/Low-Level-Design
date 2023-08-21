public class OpenTextFileOperation implements TextFileOperation{
    TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }

    @Override
    public void undo() {

    }
}
