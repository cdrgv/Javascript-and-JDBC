import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/test";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "insert into student values('2','neelesh');";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Data Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
