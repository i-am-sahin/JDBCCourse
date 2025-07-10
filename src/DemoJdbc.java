//import Package

import java.sql.*;


public class DemoJdbc{
    public static void main(String[] args)  throws Exception{
        /*
        * import Package
        * load and register
        * create connection
        * create statement
        * execute statement
        * process the results
        * close
        * */

        //load and register

                //This step is Optional
//        try{
//            Class.forName("org.postgresql.Driver");
//        }catch (Exception e){
//            System.out.println(e);
//        }

        int sid = 405;
        String sname = "Rishu";
        int num = 82;

        //create connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String passwd = "****";

//        String query = "select * from student;";
        String insertQuery = "insert into student values ( ? ,? ,?)";
//        String updateQuery = "update student set sname='Max' where sid=2;";

//        String deleteQuerey = "delete from student where sid=5";

        Connection con = DriverManager.getConnection(url,user,passwd);
        System.out.println("Connection Established");

//        create statement

//        Statement st = con.createStatement();

        PreparedStatement pSt = con.prepareStatement(insertQuery);


        //execute statement

//        ResultSet rs= st.executeQuery(query);

        //inserting values into table
//        st.execute(insertQuery);


        pSt.setInt(1,sid);
        pSt.setString(2,sname);
        pSt.setInt(3,num);

        pSt.execute();

        //Update value
//        st.execute(updateQuery);


        //Delete Value
//        st.execute(deleteQuerey);




//        rs.next();
//        String name = rs.getString("sname");
//
//        System.out.println("The name of the student is " + name);



        //Fetching All the data
//        while (rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.print(rs.getInt(3));
//            System.out.println();
//        }
//        System.out.println(rs.next());
        con.close(); //Closing the connection
        System.out.println("Connection Closed!");



    }
}
