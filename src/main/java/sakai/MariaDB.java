package sakai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDB {


    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/"; // MariaDB连接URL
        String username = "root"; // 替换为你的数据库用户名
        String password = "root"; // 替换为你的数据库密码
        String databaseName = "Test1"; // 新数据库名称

        Connection connection = null;
        Statement statement = null;

        try {
            // 注册 JDBC 驱动器
            Class.forName("org.mariadb.jdbc.Driver");

            // 建立数据库连接
            connection = DriverManager.getConnection(url, username, password);

            // 创建数据库
            statement = connection.createStatement();
            String sql = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(sql);
            System.out.println("数据库创建成功");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
