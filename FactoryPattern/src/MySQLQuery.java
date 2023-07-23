public class MySQLQuery implements Query{
    @Override
    public void getQuery() {
        System.out.println("Get Query for MY SQL");
    }

    @Override
    public void postQuery() {
        System.out.println("Post Query for My SQL");
    }
}
