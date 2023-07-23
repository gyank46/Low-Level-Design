public class PostgresSqlConnection implements Connection{
    @Override
    public void getConnection() {
        System.out.println("Started Postgre SQL Connection");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closed Postgres SQL Connection");
    }
}
