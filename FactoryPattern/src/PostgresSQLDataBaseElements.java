public class PostgresSQLDataBaseElements implements DatabaseElements{
    @Override
    public Connection getConnection() {
        return new PostgresSqlConnection();
    }

    @Override
    public Transaction getTransaction() {
        return new PostgresSQLTransaction();
    }

    @Override
    public Query getQuery() {
        return new PostgreSQLQuery();
    }
}
