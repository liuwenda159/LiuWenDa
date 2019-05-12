import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TianJia {
	public void tianjia(String yhm, String mm) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/studb", "root", "admin");
			Statement sta = (Statement) con.createStatement();
			int n = sta.executeUpdate("insert zcxx values ('" + yhm + "','"
					+ mm + "') ");
			if (n > 0) {
				System.out.print("添加成功");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.print("没找到");
		} catch (SQLException sqle) {
			System.out.print("连接异常");
		}

	}
}
