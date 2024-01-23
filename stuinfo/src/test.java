package stuinfo.src;

import java.sql.Connection;
 
import java.sql.DriverManager;
 
import java.sql.ResultSet;
 
import java.sql.Statement;
 
 
 
public class test {
 
    public static final String url = "jdbc:mysql://127.0.0.1/test1"; // 本地student数据库地址
 
    private final static String username = "root";// MySQL数据库登录用户名
 
    private final static String password = "root";// MySQL数据库登录密码
 
 
 
    public static void main(String args[]) {
 
 
 
        try {
 
            Class.forName("com.mysql.cj.jdbc.Driver");// 加载MySQL数据库驱动
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
            System.out.println("未能成功加载数据库驱动程序！");
 
        }
 
        try {
 
 
 
            Connection connect = DriverManager.getConnection(url, username, password);
 
 
 
            Statement stmt = connect.createStatement();
 
            // 增加字段
 
           stmt.executeUpdate("insert into students(`student_id`,`student_name`,`student_hometown`,`student_gender`,`student_age`,`student_java_score`) values(2022,'王五','四川南充','男',21,85)");
 
            // 删除字段
 
            // int ok = stmt.executeUpdate(
 
            // "delete from students where `学号`=152");
 
            // int ok = stmt.executeUpdate(
 
            // "update students set `姓名`='黄欢',`籍贯`='四川南充',`性别`='女',`年龄`=20,`JAVA成绩`=92 where
 
            // `学号`=152");
 
            // 查找
 
            // int ok = stmt.executeUpdate(
 
            // "select * from students where `学号`=152");
 
            ResultSet rs = stmt.executeQuery("select * from students");
 
            while (rs.next()) {
 
                System.out.print("学号:" + rs.getInt("student_id") + "\t");
 
                System.out.print("姓名:" + rs.getString("student_name") + "\t");
 
                System.out.print("籍贯:" + rs.getString("student_hometown") + "\t");
 
                System.out.print("性别:" + rs.getString("student_gender") + "\t");
 
                System.out.print("年龄:" + rs.getString("student_age") + "\t");
 
                System.out.print("JAVA成绩:" + rs.getString("student_java_score") + "\n");
 
            }
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
        }
 
 
 
    }
 
}