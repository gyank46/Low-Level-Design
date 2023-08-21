public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        TextFile textFile = new TextFile("NewFile","Hello World!");
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(textFile);
        invoker.setTextFileOperation(openTextFileOperation);
        invoker.executeCommand();
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(textFile);
        invoker.setTextFileOperation(saveTextFileOperation);
        invoker.executeCommand();

        TextFileOperation  renameAndSaveTextFileOperation = new RenameAndSaveTextFileOperation(textFile);
        invoker.setTextFileOperation(renameAndSaveTextFileOperation);
        invoker.executeCommand();

    }
}