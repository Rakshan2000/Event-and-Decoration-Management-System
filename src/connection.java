import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

public class connection {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","manjunath@28");
             System.out.print("connected");
        }
        catch(Exception e){
           System.out.print(e);
            
        }
    }
}
