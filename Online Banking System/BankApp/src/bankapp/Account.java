/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bankapp;

import java.sql.Connection;

/**
 *
 * @author rajeshwari
 */
public interface Account {
     boolean createAccount(Connection cobj, String anum, String atype, String balance, String branch, String name, String eId);
     void closeAccount(Connection cobj, String anum);
}
