package atmSimulatorSYSTEM;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	
	 JLabel l1,l2,l3;
	 
	 
	 
	    JTextField tf1;
	    
	    
	    JPasswordField pf2;
	    
	    
	    
	    JButton b1,b2,b3;
	    
	    
	    
	    
	    Login()
	    
	    
	    {
	    	
	    	  //Move the text to the center
	        //AUTOMATED TELLER MACHINE
	        setFont(new Font("System", Font.BOLD, 22));
	        Font f = getFont();
	        FontMetrics fm = getFontMetrics(f);
	        int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
	        int y = fm.stringWidth(" ");
	        int z = getWidth() - x;
	        int w = z/y;
	        String pad ="";
	        //for (int i=0; i!=w; i++) pad +=" ";   
	        pad = String.format("%"+w+"s", pad);
	        setTitle(pad+"Login System");
	    	//  FOR 3 FIELDS LIKE 
	    	//1-"WELCOME TO ATM
	        //2-Card No:
	        //3-PIN:
	        l1 = new JLabel("LOGIN SYSTEM DEMO");
	        l1.setFont(new Font("Osward", Font.BOLD, 38));
	        
	        l2 = new JLabel("Admin Id:");
	        l2.setFont(new Font("Raleway", Font.BOLD, 28));
	        
	        l3 = new JLabel("Passward:");
	        l3.setFont(new Font("Raleway", Font.BOLD, 28));
	    	// CARD NO AND PIN FIELDS 
	        tf1 = new JTextField(15); // 15 COLUMM TAK JAYEGa 
	        pf2 = new JPasswordField(15); // 15 COLUMM TAK JAYEGa  passward
	        // ab button banayenge  sign in aur clear au sign up
	        b1 = new JButton("SIGN IN");
	        b1.setBackground(Color.BLACK);
	        b1.setForeground(Color.WHITE);
	        
	        b2 = new JButton("CLEAR");
	        b2.setBackground(Color.BLACK);
	        b2.setForeground(Color.WHITE);
	        
	        b3 = new JButton("SIGN UP");
	        b3.setBackground(Color.BLACK);
	        b3.setForeground(Color.WHITE);
	    	//ab layout ke liye 
	        setLayout(null);
	        // ab set bound lagayenge  height and width ko layout karne ke liye 
	        // 1-welcome to atm ke liye 
	        l1.setBounds(175,50,450,200);
	        // add se label dikhega 
	        add(l1);
	        // 2-card no ke liye 
	        l2.setBounds(125,150,375,200);
	        add(l2);
	        //3- pin ke liye 
	        l3.setBounds(125,225,375,200);
	        add(l3);
	        // ab button aur sub par 
	        tf1.setFont(new Font("Arial", Font.BOLD, 14));
	        tf1.setBounds(300,235,230,30);
	        add(tf1);
	        
	        pf2.setFont(new Font("Arial", Font.BOLD, 14));
	        pf2.setBounds(300,310,230,30);
	        add(pf2);
	        
	        b1.setFont(new Font("Arial", Font.BOLD, 14));
	        b1.setBounds(300,400,100,30);
	        add(b1);
	        
	        b2.setFont(new Font("Arial", Font.BOLD, 14));
	        b2.setBounds(430,400,100,30);
	        add(b2);
	        
	        b3.setFont(new Font("Arial", Font.BOLD, 14));
	        b3.setBounds(300,450,230,30);
	        add(b3);	
	   // ab action listener lagayenge becoz action perform karne ke liye b1 b2 b3 par
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	        
	        // ab poore frame ka background color white karenge 
	        getContentPane().setBackground(Color.WHITE);
	        // frame ka size aur location set karenge 
	        setSize(750,750);
	        // ye default location hai upar screen aur neeche se
	        setLocation(500,200);
	        // by default frame visible false hota hai so hum ise setvisible true karenge 
	        setVisible(true);
	    	
	    	
	    	
	    	
	    	
	 
	    
	    
	    }
	    
	    // Login ends here 
	// ab action perform karenge try catch ke saath
	    public void actionPerformed(ActionEvent ae){
	        
	        try{        
	            Conn c1 = new Conn();
	            // .getText text retreive karne ke liye 
	         //   1- text field ke liye 
	            String a  = tf1.getText();
	           // 2-password ke liye 
	            
				String b  = pf2.getText();
	            String q  = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
	            ResultSet rs = c1.s.executeQuery(q);
	            
	            if(ae.getSource()==b1){
	                if(rs.next()){
	                	// naya frame khulega 
	              new Transactions().setVisible(true);
	              // current frame off ho jayega 
	                    setVisible(false);
	                
	                }else{
	                	// agar passwaord ya card number galat hue to msg pop up kara denge 
	                    JOptionPane.showMessageDialog(null, "Incorrect Admin Id or Password");
	                    
	                }
	            }
	            // b2 clear wla button hai 
	            else if(ae.getSource()==b2){
	            	// yahan pe hum empty set kar rahe hain clear waale button ko
	                tf1.setText("");
	                pf2.setText("");
	            }
	            
	            
	            
	            
	            // b3 sign up wala button hai 
	            
	            else if(ae.getSource()==b3){
	            	// agar b3 par click kiya to naya window or class signup ka khulega 
	                 new Signup().setVisible(true);
	                setVisible(false);
	            }
	        }catch(Exception e){
	                    e.printStackTrace();
	                    System.out.println("error: "+e);
	        }
	            
	    }  
	    
	
	    public static void main(String[] args){
	    	
	        new Login().setVisible(true);
	        
	        
	        // ab hum next frame signup par move karenge 
	        
	        
	    }
	
	
	
	
	
}
