public class MySQLTransaction implements Transaction{
    @Override
    public void commitTransaction() {
        System.out.println("Commit Transaction for My SQL");
    }

    @Override
    public void rollBackTransaction() {
        System.out.println("roll back Transaction for My SQL");
    }
}
