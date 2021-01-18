# Bank-Management-System
This is a bank management / Atm Simulator Desktop application build on Core Java Swing and Mysql Database.

# Tech Stack

- Core Java 
- Swing 
- MySQL
- Eclipse IDE


# Database Connection Code 
## conn.java

```
package atmSimulatorSYSTEM;

import java.sql.Connection;
import java.sql.DriverManager;
 
import java.sql.Statement;

public class Conn {
	
 public static void main(String[] args)
    {
	   	Conn ct= new Conn();
   }
	
	//}
Connection c;
	    Statement s;
	    public Conn()
	    {  
	    	try
	  	{  
	   Class.forName("com.mysql.jdbc.Driver"); 
	 c =DriverManager.getConnection("jdbc:mysql://localhost/myproject","root","");    
	 s =c.createStatement();  
	System.out.println("connected--->"+ s);
	     }
	  catch(Exception e)
	    	{ 
	            System.out.println(e);
	            
	        }  
	    }
}


```

