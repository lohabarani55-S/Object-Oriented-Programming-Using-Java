import java.sql.*;
public class Test4
{
public static void main(String s[])throws Exception
{
Connection con;
PreparedStatement ps;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3307/LohaBarani","root","");
ps=con.prepareStatement("insert into LohaBarani values(101,'LohaBarani','Msc(CS)',7.35)");
ps.executeUpdate();
System.out.println("Insert Successfully");
ps=con.prepareStatement("UPDATE `LohaBarani` SET `dept`='ECE' WHERE `roll no`=101");
ps.executeUpdate();
System.out.println("Updated Successfully ");
ps=con.prepareStatement("SELECT * FROM `LohaBarani` ");
System.out.println("Student Records");
ResultSet rs=ps.executeQuery();
while(rs.next())
{System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));}
ps=con.prepareStatement("DELETE FROM `LohaBarani` WHERE `roll no`=101 ");
ps.executeUpdate();
System.out.println("Deleted Successfully ");
}
}
