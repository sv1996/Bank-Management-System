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
	
	//
	    
	    
	    
	
	
	
}
