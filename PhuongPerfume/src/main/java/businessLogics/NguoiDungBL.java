package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javaBeans.NguoiDung;

public class NguoiDungBL {
	public static NguoiDung docTheoEmailPassword(String email, String password) {
		NguoiDung nd = null;
		try (Connection kn = CSDL.getKetNoi()) {
			Statement stm = kn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM nguoidung WHERE email = '"+email+"' AND password ='"+password+"'");
			while(rs.next()) {
				nd = new NguoiDung();
				nd.setId(rs.getInt("id"));
				nd.setEmail(rs.getString("email"));
				nd.setPassword(rs.getString("password"));
				nd.setHoTen(rs.getString("hoten"));
				nd.setDiaChi(rs.getString("diachi"));
				nd.setDtdd(rs.getString("dtdd"));
				nd.setIdVaitro(rs.getInt("id_vaitro"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nd;
	}
//	public static void main(String[] args) {
//		NguoiDung nd = docTheoEmailPassword("miendongthao@gmail.com", "123456789");
//		System.out.println(nd.getHoTen());
//	}
}
