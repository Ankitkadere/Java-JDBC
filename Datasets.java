package JDBC;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Datasets {
	   // Driver Load
	public void createdata () {
    try {
        // Corrected driver class name
     
        
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/--table name --";  // Ensure the database name is specified if needed
        String username = "root";
        String password = " ";

        // Establish connection
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stm = conn.createStatement();
        
        String query = "CREATE DATABASE --write new database name for creating  --";
        boolean b = stm.execute(query);
        System.out.println("Connection Successful" +" "+ b);
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
	}

	public void createtable() {
		try {
		  // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/ --table name --";  // Ensure the database name is specified if needed
        String username = "root";
        String password = " --inter password--";

        // Establish connection
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stm = conn.createStatement();
   
        String query = "CREATE TABLE emp (id INT ,name VARCHAR(20)); ";
        boolean b = stm.execute(query);
        System.out.println("Table Created  " +" "+ b);
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
	}

	public void insertdata() {
		try {
		  // Database URL, ursname, and password
        String url = "jdbc:mysql://localhost:3306/--table name--";  // Ensure the database name is specified if needed
        String username = "root";
        String password = " ";

        // Establish connection
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stm = conn.createStatement();
        String query = "INSERT INTO std VALUES(9, 'Radhey', 'Maharastra');";			
        boolean b = stm.execute(query);
        System.out.println("Insert Data " +" "+ b);
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
	}

	public void update() {
		try {
		  // Database URL, ursname, and password
        String url = "jdbc:mysql://localhost:3306/ --table name--";  // Ensure the database name is specified if needed
        String username = "root";
        String password = " ";

        // Establish connection
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stm = conn.createStatement();
        String query = "INSERT INTO std VALUES(122, 'Radhey', 'Maharastra');";		//values example sets	
        int b =  stm.executeUpdate(query);
        System.out.println("Update Data " +" "+ b);
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
	}

	public void readdata() {
		try {
			  // Database URL, ursname, and password
	        String url = "jdbc:mysql://localhost:3306/--Table name--";  // Ensure the database name is specified if needed
	        String username = "root";
	        String password = "";

	        // Establish connection
	        Connection conn = DriverManager.getConnection(url, username, password);
	        Statement stm = conn.createStatement();
	        String query = "Select * from --write table name--;";			
	        ResultSet re =  stm.executeQuery(query);
	        while(re.next()) {
	        	//there are examples setup
	        	System.out.println("ID :"+re.getInt(1));
	        	System.out.println("Name :"+re.getString(2));
	        	System.out.println("City :"+re.getString(3));
	        }
	        System.out.println("Read  Data " +" "+ re);
	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

		
	}

