package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class TestDB2 {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver=new OracleDriver();
		DriverManager.registerDriver(driver);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("connected");
		/*String qry="update employee set empname=?,salary=? where empid=?";
		PreparedStatement pst=conn.prepareStatement(qry);
		pst.setString(1,"Newyear");
		pst.setDouble(2,9000);
		pst.setInt(3,3);
		int rows=pst.executeUpdate();*/
		String qry1="delete from employee where empid=?";
		PreparedStatement pst1=conn.prepareStatement(qry1);
		pst1.setInt(1,101);
		pst1.executeUpdate();
		System.out.println("inserted ");
		conn.close();
	}

}
