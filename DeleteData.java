import java.sql.*;

public class DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/test";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "delete from student where id=1;";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Row deleted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
