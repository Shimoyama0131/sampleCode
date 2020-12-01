package practice;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		
		// STEP0：事前準備(JAR配置を含む)
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			// STEP1：データベースの接続
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
			// STEP2：SQL送信処理
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			// STEP3：データベース接続の切断
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
