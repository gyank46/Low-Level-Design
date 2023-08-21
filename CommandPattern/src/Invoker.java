import java.util.Queue;
import java.util.Stack;

public class Invoker {
    TextFileOperation textFileOperation;

    private Stack<TextFileOperation> textFileOperations = new Stack<>();

    public void setTextFileOperation(TextFileOperation textFileOperation) {
        this.textFileOperation = textFileOperation;
    }

    public void executeCommand(){
        textFileOperation.execute();
        textFileOperations.add(textFileOperation);
    }

    public void undoCommand(){
    }
}
