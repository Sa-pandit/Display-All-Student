import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        try {
            String MySqlDriver = "com.mysql.cj.jdbc.Driver";
            String MySqlUrl = "jdbc:mysql://localhost:3306/test";
            System.out.println("Connecting to database...");

            Class.forName(MySqlDriver);
            Connection con = DriverManager.getConnection(MySqlUrl, "root", "root");
            PreparedStatement ps = con.prepareStatement("create table if not exists students (Id int ,name varchar(50), age int)");
            int count = ps.executeUpdate();

            //PreparedStatement ps1 = con.prepareStatement("insert into students values(3 ,'sayog',21)");
            // int count1 = ps1.executeUpdate();
            // System.out.println("Datainsert");

            PreparedStatement ps2 = con.prepareStatement("select * from students");
            ResultSet rs = ps2.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "\t" + name + "\t" + age);

            }


        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

