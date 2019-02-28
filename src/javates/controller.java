/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javates;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */

public class controller {
    DefaultTableModel model;
    public void LoadData(String table) throws SQLException{
        int row = table.getRowCount();
        for(int s=0; s<row;s++){
            model.removeRow(0);
        }
    try{
        
        Connection c;
        c = koneksi.getkoneksi();
        Statement s = c.createStatement();
        
        String sql = "select * from '"+table+"'";
        ResultSet r = s.executeQuery(sql);
       
        while(r.next()){
        String data[] = {r.getString(1),r.getString(2)};
        model.addRow(data);    
        }
        
    }catch(SQLException ex){
                System.out.println("Terjadi Error");
                }
    }

    private String count(ResultSet r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Count(ResultSet r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
