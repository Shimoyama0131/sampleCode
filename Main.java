package practice;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		
		// STEP0�F���O����(JAR�z�u���܂�)
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			// STEP1�F�f�[�^�x�[�X�̐ڑ�
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
			// STEP2�FSQL���M����
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			// STEP3�F�f�[�^�x�[�X�ڑ��̐ؒf
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
