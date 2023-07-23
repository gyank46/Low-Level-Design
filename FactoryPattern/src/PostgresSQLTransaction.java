public class PostgresSQLTransaction implements Transaction{
    @Override
    public void commitTransaction() {
        System.out.println("Commit Transaction for Postgres SQL");
    }

    @Override
    public void rollBackTransaction() {
        System.out.println("roll back Transaction for Postgres SQL");
    }
}
