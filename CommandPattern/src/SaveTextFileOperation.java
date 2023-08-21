public class SaveTextFileOperation implements TextFileOperation{
    TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }

    @Override
    public void undo() {

    }
}
