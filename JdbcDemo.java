import java.sql.*;
public class JdbcDemo
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","system","Sapient123");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select* from emp");
while(rs.next())
{
System.out.println("Name:"+rs.getString(1));
System.out.println("Age:"+rs.getInt(2));
System.out.println(" ");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}