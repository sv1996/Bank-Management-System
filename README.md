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

# Database Tables
```
1 - Create Login table

create table login(cardno varchar(20),pin varchar(5));

2 - create Signup table

create table signup(name varchar(15),fname varchar(15),date varchar(5),month varchar(10),year varchar(5),gender varchar(7),email varchar(20), marital varchar(10), address varchar(20),city varchar(20),pincode varchar(10), state varchar(15),formno varchar(10));

3 - create another table with name signup2

create table signup2(formno varchar(10),religion varchar(15), category varchar(15),income varchar(5),education varchar(15),occupation varchar(15),cnicno varchar(15),bisp varchar(20), senior varchar(5), existing varchar(5));

4 - create another table with name signup3

create table signup3(formno varchar(10), account varchar(30), cardno varchar(25),pin varchar(5), service_required varchar(100));

```

# Usage

1. First We connect mysql using jdbc API.
2. We make our database and required tables in mysql workbench or using Mysql Shell Command Line.
3. First class is Login.java and here we create a bank account of customer by using credentials (username and Pin) 
4. After login we redirect to signup page and entered our details for opening new Account of customers (Personal details , name gender , email , address , city etc )  
5. Next class or window is for withdrawing and deposit of money and account updation.



















