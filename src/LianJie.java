import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LianJie {
	public boolean lianjie(String yhm, String mm) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("�ɹ�1");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/studb", "root", "admin");
//			System.out.println("�ɹ�2");
			Statement sta = (Statement) con.createStatement();
			ResultSet rs = (ResultSet) sta
					.executeQuery("select * from zcxx where yhm='" + yhm
							+ "' and mm= '" + mm +"';");
//			System.out.println("�ɹ�3");
			if(rs.next()){
				
			}else{
				return false;
			}
			 while(rs.next()){
			 String yhm1=rs.getString(2);
			 System.out.println("�û�����"+yhm1);
			 String mm1=rs.getString(3);
			 System.out.println("���룺"+mm1);
			 }
			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.print("û�ҵ�");
		} catch (SQLException sqle) {
			System.out.print("�����쳣");
		}

		return true;
	}

	
	
}
