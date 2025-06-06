import java.sql.*;
public class JdbcConnection{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String pass="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection con=DriverManager.getConnection(url, user, pass)){
                System.out.println("Connection created successfully");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}