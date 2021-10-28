package abstract_factory_pattern.SQLConnectionFactory;

public class OracleUtil implements DatabaseUtils{
    @Override
    public Connection getConnection() {
        return new OracleConnection();
    }

    @Override
    public SqlCommand getSqlCommand() {
        return new OracleSqlCommand();
    }
}
