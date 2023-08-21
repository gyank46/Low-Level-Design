public class RenameAndSaveTextFileOperation implements TextFileOperation{
    TextFile textFile;

    public RenameAndSaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        new RenameTextFileOperation(textFile).execute();
        new SaveTextFileOperation(textFile).execute();
    }

    @Override
    public void undo() {

    }
}
