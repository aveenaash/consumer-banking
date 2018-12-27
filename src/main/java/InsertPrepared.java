

import java.sql.*; 
public class InsertPrepared {
	
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "4923578160Sq");  
	  
	PreparedStatement stmt = con.prepareStatement("insert into user values(?,?,?,?)");  
	stmt.setInt(1,111); 
	stmt.setString(2,"Raani");  
	stmt.setString(3,"f");
	stmt.setInt(4,16);  
	
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	} 
    
