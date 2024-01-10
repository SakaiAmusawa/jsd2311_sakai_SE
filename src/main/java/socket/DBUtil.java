package socket;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 使用当前类管理数据库的连接
 */
public class DBUtil {
    private static final String url = "jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true";
    private static final String user = "root";
    private static final String password = "root";

    private static DruidDataSource ds;

    static {
        ds = new DruidDataSource();
        ds.setUrl(url);
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setInitialSize(5);//初始连接数
        ds.setMaxActive(20);//最大连接数
    }

    public static Connection getConnection() throws SQLException {
        //将连接池中的空闲连接返回，外面用完后调用它的close方法即代表将连接还给连接池
        return ds.getConnection();
    }
}
