public class DLL {
    public int key;
    public int value;
    public DLL next;
    public DLL prev;

    public DLL(int key,int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
