import java.sql.*;
import java.util.*;
public class Update{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String pass="";
        int id;
        String marks;
        System.out.println("Enter Student Id : ");
        id=sc.nextInt();
        System.out.println("Enter marks : ");
        marks=sc.nextLine();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection con=DriverManager.getConnection(url, user, pass)){
                System.out.println("Connection created successfully");
                String UpdateQuery="update student set marks= ? where id=?";
                try(PreparedStatement pstmt=con.prepareStatement(UpdateQuery)){
                    pstmt.setInt(2, id);
                    pstmt.setString(1, marks);
                    int rowsUpdated=pstmt.executeUpdate();
                    if(rowsUpdated>0){
                        System.out.println("Marks Updated for student id: "+id);
                    }else{
                        System.out.println("NO Specific Student with that id");
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}