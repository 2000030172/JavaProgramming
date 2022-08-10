package JDBC;
import java.sql.*;
import java.util.*;
public class skill 
{
	public static Scanner sr=new Scanner(System.in);
	public static String name,new_name;	
	public static void create_table() throws ClassNotFoundException, SQLException, Exception
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
  		    Statement st=conn.createStatement();
  		    System.out.println("Enter your Table name");
  		    name=sr.next();
  		    String query_create;
            query_create="CREATE TABLE "+name+" ("
            		+ "SNo bigint,"
            		+ "Product_specialisation_and_name varchar(50),"
            		+ "Date_of_product_manufacturing date,"
            		+ "MRP_on_the_Product int,"
            		+ "Invoice_bill_no int,"
            		+ "Product_manufacturer varchar(30)"
            		+ ");";
            boolean flag=st.execute(query_create);
            if(!flag)
            {
            	System.out.println("Table is created Successfully with name :- '"+name+"'");
            }
            else
            {
            	System.out.println("Failed to create table with name :- '"+name+"'");
            }
            conn.close();
		}
	    catch(ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch(SQLException sql)
	    {
	    	sql.printStackTrace();
	    }
	}
	public static void insert_table() throws ClassNotFoundException, SQLException
	{
	    try{
		  Class.forName("org.postgresql.Driver");
		  Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
		  Statement st=conn.createStatement();
		  System.out.println("Enter S.No");
		  int Sno=sr.nextInt();
		  System.out.println("Enter the Product specification and its table");
		  String product=sr.next();
		  System.out.println("Enter the Date of product manufacturing in (YYYY-MM-DD)");
		  String date=sr.next();
		  String query_insert;
		  System.out.println("Enter the MRP on the Product");
		  int mrp=sr.nextInt();
		  System.out.println("Enter Invoice bill Number");
		  int invoice=sr.nextInt();
		  System.out.println("Enter Product Manufacturer");
		  String manufacturer;
		  manufacturer=sr.next();
		  query_insert="INSERT into "+name+" values("+Sno+",'"+product+"','"+date+"',"+mrp+","+invoice+",'"+manufacturer+"');";
		  int i;
		  i=st.executeUpdate(query_insert);
		  if(i>0)
		  {
			  System.out.println("Inserted Sucessfully with the table name :- '"+name+"'");
		  }
		  else
		  {
			  System.out.println("Not inserted Successfully with the table name :- '"+name+"'");
		  }
		  conn.close();
	    }
	    catch(ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch(SQLException sql)
	    {
	    	sql.printStackTrace();
	    }
	}
	public static void drop_table() throws ClassNotFoundException, SQLException
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
  		    Statement st=conn.createStatement();
  		    String query_drop;
            query_drop="drop table "+name+";";
            boolean flag;
            flag=st.execute(query_drop);
            if(!flag)
            {
            	System.out.println("Table droped with table name :- '"+name+"'");
            }
            else
            {
            	System.out.println("Failed to drop the table with the table name :- '"+name+"'");
            }
    		conn.close();
		}
	    catch(ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch(SQLException sql)
	    {
	    	sql.printStackTrace();
	    }
	}
	public static void truncate_table() throws ClassNotFoundException, SQLException
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
  		    Statement st=conn.createStatement();
  		    String query_drop;
            query_drop="TRUNCATE TABLE "+name+";";
            boolean flag;
            flag=st.execute(query_drop);
            if(!flag)
            {
            	System.out.println("Table is truncated with table name :- '"+name+"'");
            }
            else
            {
            	System.out.println("Failed to truncate the table with the table name :- '"+name+"'");
            }
    		conn.close();
		}
	    catch(ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch(SQLException sql)
	    {
	    	sql.printStackTrace();
	    }
	}
	public static void rename_table() throws ClassNotFoundException, SQLException
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
  		    Statement st=conn.createStatement();
  		    String query_drop;
  		    System.out.println("Enter name to rename your table");
  		    new_name=sr.next();
            query_drop="ALTER TABLE "+name+" RENAME TO "+new_name+";";
            boolean flag;
            flag=st.execute(query_drop);
            if(!flag)
            {
            	System.out.println("Rename changed successfully from name :- '"+name+"' to '"+new_name+"'");
            }
            else
            {
            	System.out.println("Failed to rename the table from name :- '"+name+"' to name :- '"+new_name+"'");
            }
    		conn.close();
		}
	    catch(ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch(SQLException sql)
	    {
	    	sql.printStackTrace();
	    }
	}
	public static int choice()
	{
		int n;
		n=sr.nextInt();
		return n;
	}
	public static void main(String args[]) throws Exception
	{
		while(true)
		{
			System.out.println();
			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("|  *-*-* Welcome to the Lexux Ross Machine Manufacturing Co. *-*-*  |");
			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("1. Creating a new table");
			System.out.println("2. Insert into the new Table");
			System.out.println("3. Rename the existing table");
			System.out.println("4. Truncate the table");
			System.out.println("5. Drop the Table");
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("Enter Your Choice");
			switch(choice())
			{
			case 1 : create_table();
			break;
			case 2 : insert_table();
			break;
			case 3 : rename_table();
			break;
			case 4 : truncate_table();
			break;
			case 5 : drop_table();
			break;
			default : System.out.println("Thank you for storing the details in the table");
			System.exit(0);
			break;
			}
		}		
	}
}