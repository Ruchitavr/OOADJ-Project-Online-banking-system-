/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;
import java.sql.*;

/**
 *
 * @author rajeshwari
 */

public class model {
    private Connection con;
    public model()
    {
        
        try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bank?autoReconnect=true&useSSL=false","root","raji!@#$");  
	}catch(Exception e){ System.out.println(e);}  
    }
    public boolean createAccount(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        Account acct = new AccountFactory().getAccount(s2);
        return acct.createAccount(con, s1,s2,s3,s4,s5,s6);
    }
    public void closeAccount(String s1, String s2)
    {
        Account acct = new AccountFactory().getAccount(s2);
        acct.closeAccount(con, s1);
    }
    public void closeCon()
    {
        try {
		con.close();
	}catch(Exception e){ System.out.println(e);}
    }
    
}
