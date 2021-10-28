package abstract_factory_pattern.SQLConnectionFactory;

public class OracleSqlCommand implements SqlCommand{
    @Override
    public boolean SqlCommand() {
        System.out.println("Oracle Sql命令开始执行");
        return false;
    }
}
