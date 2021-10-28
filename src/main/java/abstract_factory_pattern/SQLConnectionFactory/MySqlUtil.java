package abstract_factory_pattern.SQLConnectionFactory;

public class MySqlUtil implements DatabaseUtils{
    @Override
    public Connection getConnection() {
        return new MySqlConnection();
    }

    @Override
    public SqlCommand getSqlCommand() {
        return new MySqlSqlCommand();
    }
}
