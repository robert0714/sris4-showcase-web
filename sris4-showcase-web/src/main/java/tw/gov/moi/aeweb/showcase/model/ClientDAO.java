package tw.gov.moi.aeweb.showcase.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tw.gov.moi.aeweb.showcase.common.H2DataSourceTools;

public class ClientDAO {
	
	private static final String INSERT_STMT = "insert into client values (,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public void insert(ClientVO clientVO){
		try {
			Connection conn=H2DataSourceTools.getH2Connection();
			PreparedStatement pstmt = conn.prepareStatement(INSERT_STMT);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		
	}
}
