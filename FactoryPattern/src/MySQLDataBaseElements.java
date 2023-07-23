public class MySQLDataBaseElements implements DatabaseElements{
    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public Transaction getTransaction() {
        return new MySQLTransaction();
    }

    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }
}
