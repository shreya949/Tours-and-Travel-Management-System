package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
        
        //setLocation(200,100);
        //setSize(1200,600); 
        setTitle("Splash");
        JPanel p1=new JPanel();
        p1.setBackground(Color.BLACK);
        p1.setBounds(0,0,1600,65);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JLabel text=new JLabel("Travel And Tourism Management System");
        text.setBounds(200,5,1000,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("BRITANNIC BOLD",Font.PLAIN,40));
        p1.add(text);
        
        thread=new Thread(this);
        thread.start();
        setVisible(true);
    }
    public void run(){
        try{
                Thread.sleep(7000);
                setVisible(false);
                new Login();
        }catch(Exception e){
             e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Splash frame=new Splash();
        int x=1;
        for(int i=1 ; i<=500 ; x+=7 , i+=6){
           frame.setLocation(750 - (x+i)/2,400 - (i/2));
           frame.setSize(x + i,i);
           try{
               Thread.sleep(10);
           }catch (Exception e){
           
           }
        }
    }       
}
