import java.sql.*;
import java.util.*;

public class CreateTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3307/test";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            while (true) {
                System.out.print("Do you want to create table(true/false): ");
                boolean choice = sc.nextBoolean();
                while (choice) {
                    System.out.println("Enter Table Name : ");
                    String tableName = sc.next();
                    System.out.println("Enter number of columns needed : ");
                    int noOfColumns = sc.nextInt();
                    if (noOfColumns == 1) {
                        System.out.println("Enter column name with datatype : ");
                        String cdname = sc.next();
                        String query = "create table " + tableName + "(?);";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1, cdname);
                        pstmt.executeUpdate();
                        System.out.println("Table Created Successfully\n");
                        break;
                    } else {
                        System.out.println("Enter column name : ");
                        String cname = sc.next();
                        System.out.println("Enter DataType : ");
                        String dtype = sc.next();
                        String query = "create table ?('? ?');";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1, tableName);
                        pstmt.setString(2, cname);
                        pstmt.setString(3, dtype);
                        pstmt.executeUpdate();
                        for (int i = 1; i <= noOfColumns; i++) {
                            System.out.println("Enter column name : ");
                            String cname1 = sc.next();
                            System.out.println("Enter DataType : ");
                            String dtype1 = sc.next();
                            String addQuery = "alter table ? add column ? ?;";
                            PreparedStatement pstmt1 = con.prepareStatement(addQuery);
                            pstmt1.setString(1, tableName);
                            pstmt1.setString(2, cname1);
                            pstmt1.setString(3, dtype1);
                            pstmt1.executeUpdate();
                        }
                        System.out.println("Table Created Successfully\n");
                        break;
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
