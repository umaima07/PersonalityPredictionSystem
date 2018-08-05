/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tycs;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class connectionClass {
    public Connection getConnection()
    {   Connection con=null;
         try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","newrootpassword");                               
            }
            catch(Exception e)
            {
                System.out.println(e);
                
            }
         return con;
    }
      public ResultSet getQuery(String sql) throws SQLException
      {
         Connection con = getConnection();
          Statement st = con.createStatement();
          ResultSet rs=st.executeQuery(sql);
          return rs;
      }
      public int getQuery1(String sql1) throws SQLException
      {
         Connection con = getConnection();
          Statement st = con.createStatement();
          int i =st.executeUpdate(sql1);
          return i;
      }
}
