import java.sql.*;

public class GetData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/test";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(url, user, pass)) {
                String query = "select * from student";
                try (Statement stmt = con.createStatement()) {
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt(1) + "Name : " + rs.getString(2));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}