package tw.gov.moi.aeweb.showcase.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.tools.Server;

public class H2DataSourceTools {
	private static Server server;
	private static JdbcConnectionPool cp;
	private static boolean firstTime = true;

	public static Connection getH2Connection() {
		String url = "jdbc:h2:mem:sirs4TestDB;INIT=runscript from \'classpath:scripts/jamari.sql\'";
		String user = "sa";
		String password = "sa";
		String args[] = { "-tcpAllowOthers" };
		Connection conn =null;
		if (firstTime) {
//			try {
//				server = Server.createTcpServer(args);
//				server.start();
//			} catch (SQLException e) {
//				System.out.println("can't start H2 DB ");
//				e.printStackTrace();
//			}
			cp = JdbcConnectionPool.create(url, user, password);
			firstTime=false;
		}
		try {
			 conn = cp.getConnection();
		} catch (SQLException e) {
			System.out.println("can't get conn from cp ");
			e.printStackTrace();
		}
		return conn;
	}
}
