/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapp;



/**
 *
 * @author rajeshwari
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    private static model mObj;
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mObj = new model();
                new employeeForm(mObj).setVisible(true);
            }
        });
    }
    
}
