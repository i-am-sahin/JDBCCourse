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

        //create connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String passwd = "****";

        Connection con = DriverManager.getConnection(url,user,passwd);

        System.out.println("Connection Established");

    }
}
