package com.studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection createConnection(){

        try{
            //Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?useSSL=false";
            String user="root";
            String pass="Nithish@2k";

            con= DriverManager.getConnection(url,user,pass);

        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return con;
    }

}