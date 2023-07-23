public class MySQLConnection implements Connection{
    @Override
    public void getConnection() {
        System.out.println("Opened My SQL DB Connection");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closed MY SQL DB Connection");
    }
}
