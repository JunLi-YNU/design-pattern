package abstract_factory_pattern.SQLConnectionFactory;

public class MySqlSqlCommand implements SqlCommand{
    @Override
    public boolean SqlCommand() {
        System.out.println("MySql开始执行Sql命令");
        return false;
    }
}
