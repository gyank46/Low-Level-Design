public class RenameTextFileOperation implements TextFileOperation{
    TextFile textFile;

    public RenameTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.rename();
    }

    @Override
    public void undo() {

    }
}
