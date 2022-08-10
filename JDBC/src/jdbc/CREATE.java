package jdbc;
import java.sql.*;
import java.util.*;
public class CREATE 
{
	public static Scanner sr=new Scanner(System.in);
	public static int choice()
	{
		int cho;
		cho=sr.nextInt();
		return cho;
	}
    public static void create()
    {
        try{
          Class.forName("org.postgresql.Driver");
  		  Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
  		  Statement st=conn.createStatement();
          String query;
          query="create table details100(id int,name varchar(255), age int);";
          boolean flag=st.execute(query);
		  if(!flag)
		  {
			  System.out.println("Table is created succussfully");
		  }
		  else
		  {
			  System.out.println("Table is not created succussfully");
		  }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void insert()
    {
    	try{
            Class.forName("org.postgresql.Driver");
    		  Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
    		  Statement st=conn.createStatement();
            String query;
            query="insert into details100 values(2000030172,'Prashanth',18);";
            boolean flag=st.execute(query);
  		  if(!flag)
  		  {
  			  System.out.println("Inserted succussfully");
  		  }
  		  else
  		  {
  			  System.out.println("Not Inserted succussfully");
  		  }
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
    }
    public static void drop_table() throws ClassNotFoundException
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","muni2002");
  		    Statement st=conn.createStatement();
  		    String query_drop;
            query_drop="DROP TABLE details100;";
            st.execute(query_drop);
            System.out.println("Table is droped with the table name ");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
    public static void main(String args[])
    {
    	while(true)
    	{
    	switch(choice())
    	{
    	case 1: create();
    	break;
    	case 2 : insert();
    	break;
    	}
    	}
    }
}