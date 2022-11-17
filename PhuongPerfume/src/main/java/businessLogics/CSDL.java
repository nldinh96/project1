package businessLogics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection ketNoi;
	public static Connection getKetNoi() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/phuong_perfume?useUnicode=true&characterEncoding=UTF-8";
			ketNoi = DriverManager.getConnection(url,"root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketNoi;
	}
//	public static void main(String[] args) {
//		Connection kn = getKetNoi();	
//	}
}
