package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    JButton addPersonDetails,updatePersonDetails,viewPersonDetails,deletePersonDetails,checkpackages,bookpackages,
            viewpackages,viewhotels,bookhotel,viewbookedhotel,destinations,payments,calculator,notepad,about;
    String username;
    Dashboard(String username)
    {
        this.username=username;
        //setBounds(0,0,1800,900);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        setTitle("Dashboard");
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setFont(new Font("TAHOMA",Font.BOLD,30));
        heading.setForeground(Color.WHITE);
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        p2.setLayout(null);
        add(p2);
        
        addPersonDetails=new JButton("Add Person Details");
        addPersonDetails.setBounds(0,0,300,50);
        addPersonDetails.setBackground(new Color(0,0,102));
        addPersonDetails.setForeground(Color.WHITE);
        addPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonDetails.setMargin(new Insets(0,0,0,60));
        addPersonDetails.addActionListener(this);
        p2.add(addPersonDetails);
        
        updatePersonDetails=new JButton("Update Person Details");
        updatePersonDetails.setBounds(0,50,300,50);
        updatePersonDetails.setBackground(new Color(0,0,102));
        updatePersonDetails.setForeground(Color.WHITE);
        updatePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonDetails.setMargin(new Insets(0,0,0,30));
        updatePersonDetails.addActionListener(this);
        p2.add(updatePersonDetails);
        
        viewPersonDetails=new JButton("View Details");
        viewPersonDetails.setBounds(0,100,300,50);
        viewPersonDetails.setBackground(new Color(0,0,102));
        viewPersonDetails.setForeground(Color.WHITE);
        viewPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonDetails.setMargin(new Insets(0,0,0,115));
        viewPersonDetails.addActionListener(this);
        p2.add(viewPersonDetails);
        
        deletePersonDetails=new JButton("Delete Person Details");
        deletePersonDetails.setBounds(0,150,300,50);
        deletePersonDetails.setBackground(new Color(0,0,102));
        deletePersonDetails.setForeground(Color.WHITE);
        deletePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonDetails.setMargin(new Insets(0,0,0,35));
        deletePersonDetails.addActionListener(this);
        p2.add(deletePersonDetails);
        
        checkpackages=new JButton("Check Packages");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,85));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages=new JButton("Book Packages");
        bookpackages.setBounds(0,250,300,50);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackages.setMargin(new Insets(0,0,0,95));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages=new JButton("View Packages");
        viewpackages.setBounds(0,300,300,50);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackages.setMargin(new Insets(0,0,0,100));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,120));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,130));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,60));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destinations=new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,120));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments=new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,150));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator=new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,160));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about=new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,180));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text=new JLabel("Travel And Tourism Management System");
        text.setBounds(400,70,1000,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("BRITANNIC BOLD",Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
           if(ae.getSource()==addPersonDetails)
           {
               new AddCustomer(username);
           }
           else if(ae.getSource()==viewPersonDetails)
           {
               new ViewCustomer(username);
           }
           else if(ae.getSource()==deletePersonDetails)
           {
               new DeleteDetails(username);
           }
           else if(ae.getSource()==updatePersonDetails)
           {
               new UpdateCustomer(username);
           }
           else if(ae.getSource()==checkpackages)
           {
               new CheckPackage();
           }
           else if(ae.getSource()==bookpackages)
           {
               new BookPackage(username);
           }
           else if(ae.getSource()==viewpackages)
           {
               new ViewPackage(username);
           }
           else if(ae.getSource()==viewhotels)
           {
               new CheckHotels();
           }
           else if(ae.getSource()==bookhotel)
           {
               new BookHotel(username);
           }
           else if(ae.getSource()==viewbookedhotel)
           {
               new ViewBookedHotel(username);
           }
           else if(ae.getSource()==destinations)
           {
               new Destinations();
           }
           else if(ae.getSource()==payments)
           {
               new Payment();
           }
           else if(ae.getSource()==calculator)
           {
               try
               {
                   Runtime.getRuntime().exec("calc.exe");
               }
               catch (Exception e)
               {
                   e.printStackTrace();
               }
           }
           else if(ae.getSource()==notepad)
           {
               try
               {
                   Runtime.getRuntime().exec("notepad.exe");
               }
               catch (Exception e)
               {
                   e.printStackTrace();
               }
           }
           else if(ae.getSource()==about)
           {
               new About();
           }
    }
    public static void main(String args[]){
        new Dashboard("");
    }
}
