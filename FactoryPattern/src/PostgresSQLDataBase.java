public class PostgresSQLDataBase implements DataBase{
    @Override
    public String getUrl() {
        return "Postgres URL";
    }

    @Override
    public int getConnectionLimit() {
        return 10;
    }

    @Override
    public DatabaseElements getDataBaseElements() {
        return new PostgresSQLDataBaseElements();
    }
}
