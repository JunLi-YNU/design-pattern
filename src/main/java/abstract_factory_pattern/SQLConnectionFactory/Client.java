package abstract_factory_pattern.SQLConnectionFactory;

/**
 * 设计思路:
 * 目的：连接数据库（可能是MySQL、
 */
public class Client {
    public static void main(String[] args){
        DatabaseUtils databaseUtils = new MySqlUtil();
        //当添加或者修改数据的实现时,只需要对该出代码进行更替即可
        // DatabaseUtils databaseUtilsOne = new OracleUtil();
        Connection connection = databaseUtils.getConnection();
        connection.connection();
        SqlCommand sqlCommand = databaseUtils.getSqlCommand();
        sqlCommand.SqlCommand();
    }
}
