public class Client {

    public static void main(String[] args) {
        DataBase mysqldb = DataBaseFactory.getDatabase("MYSQL");
        Query query = mysqldb.getDataBaseElements().getQuery();
        query.getQuery();
        query.postQuery();

        Transaction mysqlTran = mysqldb.getDataBaseElements().getTransaction();
        mysqlTran.commitTransaction();
        mysqlTran.rollBackTransaction();

        DataBase postgresSqldb = DataBaseFactory.getDatabase("POSTGRES");
        Query postgresQuery = postgresSqldb.getDataBaseElements().getQuery();
        postgresQuery.getQuery();
        postgresQuery.postQuery();

        Transaction postgresTran = postgresSqldb.getDataBaseElements().getTransaction();
        postgresTran.commitTransaction();
        postgresTran.rollBackTransaction();
    }
}
