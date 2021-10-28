package abstract_factory_pattern.SQLConnectionFactory;

/**
 * 具体产品去实现一系列的抽象接口或者抽象方法
 */
public class MySqlConnection implements Connection{
    @Override
    public boolean connection() {
        System.out.println("MySql数据开始连接");
        return false;
    }
}
