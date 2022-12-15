package Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Login.Helper;

 public class ToRegister {  //Main class
    static Scanner sc = new Scanner(System.in);
    public static void generate(long sid, String password) throws SQLException {
      // to select what operation to be done from user
     System.out.println("Enter your first name : ");
        String fname = sc.next();
        System.out.println("Enter your last name : ");
        String lname = sc.next();
        System.out.println("Enter your address(city) : ");
        String sadd = sc.next();
        System.out.println("Enter your phone number (without +91): ");
        long phone = sc.nextLong();
        System.out.println("Enter your 10th overall percentage : ");
        double per10 = sc.nextDouble();
        System.out.println("Enter your 12th overall percentage : ");
        double per12 = sc.nextDouble();
        System.out.println("Enter your passing year(12th) : ");
        int yop = sc.nextInt();
     //call getConnection() method
        Connection conn = Helper.con();
     // declare the sql statement
        Statement stmt = conn.createStatement();

        PreparedStatement stmt1=conn.prepareStatement("insert into Registration values(?,?,?,?,?,?,?,?,?)");
     // setting all inputs into db
        stmt1.setLong(1, sid);
        stmt1.setString(2, fname);
        stmt1.setString(3, lname);
        stmt1.setString(4, sadd);
        stmt1.setLong(5, phone);
        stmt1.setDouble(6, per10);
        stmt1.setDouble(7, per12);
        stmt1.setInt(8, yop);
        stmt1.setString(9, password);
        stmt1.executeUpdate();
        System.err.println("----Registration Successful----");
    }
}
