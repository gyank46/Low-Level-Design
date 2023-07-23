public class PostgreSQLQuery implements Query{
    @Override
    public void getQuery() {
        System.out.println("Get Query for Postgres SQL");
    }

    @Override
    public void postQuery() {
        System.out.println("Post Query for Postgres SQL");
    }
}
