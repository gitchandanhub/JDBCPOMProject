package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtility 
{
	static Connection con;
    static boolean flag = false;
    static Statement statement; 
	    public static void connect(String url, String uname, String password)
	    {
	    	try
	    	{
	    		Class.forName("com.mysql.jdbc.Driver");
	    		con = DriverManager.getConnection(url, uname, password);
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	
	    	}
	    	
	    }
	    	public static void fetchdataquery(String query, int columnlength)
	    	{
	    		try
	    		{
	    			statement = con.createStatement();
	    		ResultSet result = statement.executeQuery(query);
	    		while(result.next())
	    		{
	    			String data = "";
	    			for(int i = 1; i<=columnlength; i++)
	    			{
	    				data = data + result.getString(i) + " ";
	    			}
	    			System.out.println(data);
	    		}
	    		}
	    		catch(Exception e)
	    		{
	    			e.printStackTrace();
	    		}
	    	}
	    public static void Insertintoquery(String query)
	    {
	    	
	    	try
	    	{
	    	statement = con.createStatement();
	    	statement.execute(query);
	    	flag = true;
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	if(flag)
	    	{
	    		System.out.println("Record has been added");
	    	}
	    	else
	    	{
	    		System.out.println("Fix the error");
	    	}
	    }
	    public static void Updatequery(String query)
	    {
	    	try
	    	{
	    		statement = con.createStatement();
	    		statement.executeUpdate(query);
	    		flag = true;
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	if(flag)
	    	{
	    		System.out.println("Record has been Updated");
	    	}
	    	else
	    	{
	    		System.out.println("Fix the error");
	    	}

	    }
}
