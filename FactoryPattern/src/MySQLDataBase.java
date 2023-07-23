public class MySQLDataBase implements DataBase{
    @Override
    public String getUrl() {
        return "MySQL URL";
    }

    @Override
    public int getConnectionLimit() {
        return 1;
    }

    @Override
    public DatabaseElements getDataBaseElements() {
        return new MySQLDataBaseElements();
    }
}
