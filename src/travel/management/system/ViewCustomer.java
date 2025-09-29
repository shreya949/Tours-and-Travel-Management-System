package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class ViewCustomer extends JFrame implements ActionListener{
    JButton back;
    ViewCustomer(String username)
    {
        setBounds(450,180,1000,625);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        setTitle("Customer Details");
        
        JLabel text=new JLabel("VIEW CUSTOMER DETAILS");
        text.setBounds(300,0,400,30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelusername);
        
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(30,110,150,25);
        lblid.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblid);
        
        JLabel labelid=new JLabel();
        labelid.setBounds(220,110,150,25);
        labelid.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblnumber);
        
        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,170,150,25);
        labelnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelnumber);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(220,230,150,25);
        labelname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        lblgender.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblgender);
        
        JLabel labelgender=new JLabel();
        labelgender.setBounds(220,290,150,25);
        labelgender.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelgender);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        lblcountry.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblcountry);
        
        JLabel labelcountry=new JLabel();
        labelcountry.setBounds(690,50,150,25);
        labelcountry.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelcountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(500,110,150,25);
        lbladdress.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lbladdress);
        
        JLabel labeladdress=new JLabel();
        labeladdress.setBounds(690,110,150,25);
        labeladdress.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labeladdress);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        JLabel labelphone=new JLabel();
        labelphone.setBounds(690,170,150,25);
        labelphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelphone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblemail);
        
        JLabel labelemail=new JLabel();
        labelemail.setBounds(690,230,300,25);
        labelemail.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelemail);
        
        back=new JButton("Back");
        back.setBounds(350,350,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(20,400,600,200);
        add(image);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5=i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image2=new JLabel(i6);
        image2.setBounds(600,400,600,200);
        add(image2);
        
        try
        {
            Conn conn=new Conn();
            String query="select * from customer where username ='"+username+"'";
            
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
           if(ae.getSource()==back)
           {
               setVisible(false);
           }       
    }
    public static void main(String args[])
    {
        new ViewCustomer("Shruti");
    }
}
