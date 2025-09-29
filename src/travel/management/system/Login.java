package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login,signup,forgetPass;
    JTextField tfusername,tfpassword;
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(new Color(131,193,233));
        
        setTitle("Login");
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        JPanel p2=new JPanel();
        p2.setBounds(400,30,450,300);
        p2.setLayout(null);
        add(p2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,400,400);
        p1.add(image);
        
        JLabel lblusername=new JLabel("User Name");
        lblusername.setBounds(60,20,150,25);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblusername);
        
        tfusername=new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(60,110,150,25);
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblpassword);
        
        tfpassword=new JTextField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login=new JButton("Login");
        login.setBounds(60,210,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        p2.add(login);
        
        signup=new JButton("Sign Up");
        signup.setBounds(230,210,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        p2.add(signup);
        
        forgetPass=new JButton("Forget Password");
        forgetPass.setBounds(140,260,130,30);
        forgetPass.setBackground(new Color(133,193,233));
        forgetPass.setForeground(Color.WHITE);
        forgetPass.addActionListener(this);
        p2.add(forgetPass);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
           if(ae.getSource()==login)
           {
               try
               {
                   String username=tfusername.getText();
                   String password=tfpassword.getText();
                   
                   String query="select * from account where username ='"+username+"' AND password='"+password+"'";
                   Conn c=new Conn();
                   ResultSet rs=c.s.executeQuery(query);
                   if(rs.next())
                   {
                       setVisible(false);
                       new Loading(username);
                   }
                   else
                   {
                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password....");
                   }
               }catch(Exception e){
                    e.printStackTrace();
               }
           }
           else if(ae.getSource()==signup)
           {
               setVisible(false);
               new Signup();
           }
           else 
           {
               setVisible(false);
               new ForgetPassword();
           }
    }
    public static void main(String args[]){
        new Login();
    }
            
}
