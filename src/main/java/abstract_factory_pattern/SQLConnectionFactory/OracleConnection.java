package abstract_factory_pattern.SQLConnectionFactory;

public class OracleConnection implements  Connection{
    @Override
    public boolean connection() {
        System.out.println("Oracle 数据库开始连接");
        return false;
    }
}
