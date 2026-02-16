/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import hospitalsystem.patterns1.DatabaseConnection;

public class HospitalSystem {

    public static void main(String[] args) {

        DatabaseConnection.getInstance();

        
        Login L = new Login();
        L.setVisible(true);
        L.setLocation(100,100);
        L.setResizable(false);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    

