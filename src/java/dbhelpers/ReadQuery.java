
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.StudentMajors;

public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery() {
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead() {
        try {
            String query = "Select * from STUDENTMAJORS";
            
            PreparedStatement ps= conn.prepareStatement(query);
            {
                
            }} catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLTable () {
        
        String table = "Student Majors";
        table += "<table border=1>";
        
        try {
            while(this.results.next()){
                
                
                StudentMajors studentmajors= new StudentMajors();
                
                studentmajors.setSTUDENTID(this.results.getString("StudentId"));
                studentmajors.setMAJOR(this.results.getString("Majors"));
                studentmajors.setHOMETOWN(this.results.getString("Hometown"));
                studentmajors.setAge(this.results.getInt("Age"));
                studentmajors.setFavBar(this.results.getString("FavBar"));
                
                
                table += "<tr>";
                table += "<td>";
                table += studentmajors.getSTUDENTID();
                table += "</td>";
                
                
                table += "<td>";
                table += studentmajors.getMAJOR();
                table += "</td>";
                
                
                table += "<td>";
                table += studentmajors.getHOMETOWN();
                table += "</td>";
                
                
                table += "<td>";
                table += studentmajors.getAge();
                table += "</td>";
                
                
                table += "<td>";
                table += studentmajors.getFavBar();
                table += "</td>";
                
                table +="</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";
        
        return table;
    }
    
}
