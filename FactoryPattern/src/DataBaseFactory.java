public class DataBaseFactory {
    public static DataBase getDatabase(String type){
        if(type == Type.MYSQL.toString())
            return new MySQLDataBase();

        return new PostgresSQLDataBase();

    }
}
