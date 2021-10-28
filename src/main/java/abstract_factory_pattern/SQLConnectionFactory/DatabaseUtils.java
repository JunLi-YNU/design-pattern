package abstract_factory_pattern.SQLConnectionFactory;

/**
 * 定义一系列的接口或者抽象方法
 */
public interface DatabaseUtils {
    Connection getConnection();
    SqlCommand getSqlCommand();
}
