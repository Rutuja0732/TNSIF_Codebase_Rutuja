package tnsif.dyp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {

	



	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
				//step1:Load or register driver
				
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver is Loaded successfully");
				
				//step2:create connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil","root", "root");
				
				//step3:create a statement
				Statement stmt=con.createStatement();
				System.out.println("Statement created successfully");
				
				//step4:write a query
				String q="create table student(stdid int,name varchar(20),subject varchar(20),duration double)";
				boolean s=stmt.execute(q);
				
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}

}
