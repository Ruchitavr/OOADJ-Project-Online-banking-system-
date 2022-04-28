package bankapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajeshwari
 */

import java.sql.*;
import javax.swing.JOptionPane;
class currentAccount implements Account{
    
    public boolean createAccount(Connection cobj, String anum, String atype, String balance, String branch, String name, String eId){
        String INSERT_SQL="INSERT INTO customer "
      + "(actnum, acttype, balance, branch, name, emailId, loginid, password, status) VALUES (?,?,?,?,?,?,?,?,?)";
      
        try {
		PreparedStatement stmt = cobj.prepareStatement(INSERT_SQL);

      		// Insert record
                int n = Integer.parseInt(balance);
      		stmt.setString(1, anum);
      		stmt.setString(2, "CA");
      		stmt.setInt(3, n); // balance
      		stmt.setString(4, branch);
                stmt.setString(5, name);
                stmt.setString(6, eId);
                
                String status = "Open";
                String loginId = name + "1234";
                String passwrd = "123456";
                stmt.setString(7, loginId);
                stmt.setString(8, passwrd);
                stmt.setString(9, status);
                
                
      		stmt.executeUpdate();
		}catch(Exception e){ System.out.println(e); return false;}
                return true;
        
    }
    
    public void closeAccount(Connection cobj, String anum){  try {
		PreparedStatement stmt = cobj.prepareStatement("UPDATE customer SET status= \"closed\" WHERE EMPNO=?"); 

      		// update record
               
      		stmt.setString(1, anum);
                
      		stmt.executeUpdate();
		}catch(Exception e){ System.out.println(e);}
        
        
        
    }
}
class savingsAccount implements Account{
    
    public boolean createAccount(Connection cobj, String anum, String atype, String balance, String branch, String name, String eId){
        String INSERT_SQL="INSERT INTO customer "
      + "(actnum, acttype, balance, branch, name, emailId, loginid, password, status) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
		PreparedStatement stmt = cobj.prepareStatement(INSERT_SQL);

      		// Insert record
                int n = Integer.parseInt(balance);
      		stmt.setString(1, anum);
      		stmt.setString(2, "SA");
      		stmt.setInt(3, n); // balance
      		stmt.setString(4, branch);
                stmt.setString(5, name);
                stmt.setString(6, eId);
                
                String status = "Open";
                String loginId = name + "1234";
                String passwrd = "123456";
                stmt.setString(7, loginId);
                stmt.setString(8, passwrd);
                stmt.setString(9, status);
                
                
                // message displaying loginID and password created

      		stmt.executeUpdate();
		}catch(Exception e){ System.out.println(e);return false;}
        return true;
        
    }
    
    public void closeAccount(Connection cobj, String anum){
          try {
		PreparedStatement stmt = cobj.prepareStatement("UPDATE customer SET status= \"closed\" WHERE actnum=?"); 

      		// Insert record
               
      		stmt.setString(1, anum);
                
      		stmt.executeUpdate();
		}catch(Exception e){ System.out.println(e);}
        
    }
}

class RDAccount implements Account{
     public boolean createAccount(Connection cobj, String anum, String atype, String balance, String branch, String name, String eId){
         String INSERT_SQL="INSERT INTO customer "
      + "(actnum, acttype, balance, branch, name, emailId, loginid, password, status) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
		PreparedStatement stmt = cobj.prepareStatement(INSERT_SQL);

      		// Insert record
                int n = Integer.parseInt(balance);
      		stmt.setString(1, anum);
      		stmt.setString(2, "RD");
      		stmt.setInt(3, n); // balance
      		stmt.setString(4, branch);
                stmt.setString(5, name);
                stmt.setString(6, eId);
                
                String status = "Open";
                String loginId = name + "1234";
                String passwrd = "123456";
                stmt.setString(7, loginId);
                stmt.setString(8, passwrd);
                stmt.setString(9, status);
                
                
                // message displaying loginID and password created

      		stmt.executeUpdate();
		}catch(Exception e){ System.out.println(e);return false;}
        return true;
        
    }
    
    public void closeAccount(Connection cobj, String anum){
        
       
        
        try {
		PreparedStatement stmt = cobj.prepareStatement("UPDATE customer SET status= \"closed\" WHERE actnum=?"); 

      		// Insert record
               
      		stmt.setString(1, anum);
               
      		stmt.executeUpdate();
		}catch(Exception e){ System.out.println(e);}
        
    }
    
    
}


public class AccountFactory {
    
    public AccountFactory()
    {
        
    }
    public Account getAccount(String s1)
    {
        if (s1.equals("CurrentAccount"))
            return new currentAccount();
        else if(s1.equals("Savings Account"))
            return new savingsAccount();
        else
            return new RDAccount();
    }
    
}
