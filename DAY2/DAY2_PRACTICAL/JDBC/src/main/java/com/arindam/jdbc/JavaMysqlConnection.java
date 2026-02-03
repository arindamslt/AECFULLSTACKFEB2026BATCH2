package com.arindam.jdbc;
import java.sql.*;
class TestConnection{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from event";
	private String insert_sql="insert into event values(?,?,?)";
	private String delete_sql="delete from event where eventid=?";
	private String update_sql="update event set eventnm=?,loc=? where eventid=?";
	public void updateData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstackdbs","root","arindam");//ESTABLISH THE CONNECTION
		 ps=cn.prepareStatement(update_sql);
		 ps.setString(3,"EV2");
		 ps.setString(1,"CRICKET MATCH");
		 ps.setString(2,"MUMBAI");
		 ps.executeUpdate();//DATA SAVED
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstackdbs","root","arindam");//ESTABLISH THE CONNECTION
		 ps=cn.prepareStatement(delete_sql);
		 ps.setString(1,"EV3");
		 ps.executeUpdate();//DATA SAVED
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstackdbs","root","arindam");//ESTABLISH THE CONNECTION
		 ps=cn.prepareStatement(insert_sql);
		 ps.setString(1,"EV3");
		 ps.setString(2,"FOOTBALL MATCH");
		 ps.setString(3,"KOLKATA");
		 ps.executeUpdate();//DATA SAVED
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void getData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstackdbs","root","arindam");//ESTABLISH THE CONNECTION
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
	    st=cn.createStatement();//CREATE THE STATEMENT
		 rs=st.executeQuery(select_sql);//execute query and the store data into resultset
		 while(rs.next())
		 {
			 //System.out.println(rs.getString(1));
			// System.out.println(rs.getString(2));
			// System.out.println(rs.getString(3));
			 System.out.println(rs.getString(1)+"==<"+rs.getString(2)+"===>"+rs.getString(3));
		 }
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class JavaMysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestConnection ts=new TestConnection();
  //ts.insertData();
  //ts.deleteData();
  //ts.updateData();
  ts.getData();
  
	}

}
