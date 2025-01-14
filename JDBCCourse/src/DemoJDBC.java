import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        import packages
        load and register
        create connection
        create statement
        create execution
        process, the results
        close
         */
        int id=100;
        String name="rajmouli";
        int marks=40;

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="saisasank@09";
        String sql = "INSERT INTO student VALUES (" + id + ", " + marks + ", '" + name + "')";
        String prepSql= "Insert into student values(?,?,?)";
        Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);

        PreparedStatement pst= con.prepareStatement(prepSql);
        pst.setInt(1,id);
        pst.setInt(2,marks);
        pst.setString(3,name);
        pst.execute();
        System.out.println("Connection Established");
//        Statement st= con.createStatement();
//        boolean exe=st.execute(sql);
//        System.out.println(exe);
//       ResultSet rs= st.executeQuery(sql);
//        System.out.println(rs.next());
////        String student=(rs.getString("Sname"));
////        System.out.println("The student name is "+ student);
//        while (rs.next()){
//            System.out.print(rs.getInt(1)+ " - ");
//            System.out.print(rs.getString(3)+" - ");
//            System.out.print(rs.getInt(2));
//            System.out.println();
//        }

        con.close();
        System.out.println("Connection Closed");

    }
}
