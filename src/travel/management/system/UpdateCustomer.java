package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class UpdateCustomer extends JFrame implements ActionListener{
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton update,back;
    UpdateCustomer(String username)
    {
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        setTitle("Update");
        
        JLabel text=new JLabel("Update Customer Details");
        text.setBounds(50,10,300,25);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelusername);
        
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(30,90,150,25);
        lblid.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblid);
        
        tfid=new JTextField();
        tfid.setBounds(220,90,150,25);
        tfid.setBackground(Color.WHITE);
        tfid.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfid);
        
        JLabel lblnumber=new JLabel("ID Number");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblnumber);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblname);
        
        labelname=new JLabel();
        labelname.setBounds(220,170,150,25);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        lblgender.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblgender);
        
        tfgender=new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        lblcountry.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblcountry);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        lbladdress.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(30,330,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(30,370,150,25);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(220,370,150,25);
        add(tfemail);
        
        update=new JButton("Update");
        update.setBounds(70,430,100,25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma",Font.BOLD,14));
        update.addActionListener(this);
        add(update);
        
        back=new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.jpg"));
        Image i2=i1.getImage().getScaledInstance(350, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(440,40,450,420);
        add(image);
        
        try{
                String query="select * from customer where username ='"+username+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next())
                    {
                        labelusername.setText(rs.getString("username"));
                        labelname.setText(rs.getString("name"));
                        tfid.setText(rs.getString("id"));
                        tfnumber.setText(rs.getString("number"));
                        tfgender.setText(rs.getString("gender"));
                        tfcountry.setText(rs.getString("country"));
                        tfaddress.setText(rs.getString("address"));
                        tfphone.setText(rs.getString("phone"));
                        tfemail.setText(rs.getString("email"));
                    }
        }catch(Exception e){
             e.printStackTrace();
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
           if(ae.getSource()==update)
           {
                String username=labelusername.getText();
                String id=tfid.getText();
                String number=tfnumber.getText();
                String name=labelname.getText();
                String gender=tfgender.getText();
                String country=tfcountry.getText();
                String address=tfaddress.getText();
                String phone=tfphone.getText();
                String email=tfemail.getText();
                try{
                    Conn c=new Conn();
                    String query="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Data Updated Successfully...");
                    setVisible(false);   
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
           }
           else 
           {
               setVisible(false);
           }
    }
    public static void main(String args[]){
        new UpdateCustomer("Shruti");
    }
}
