package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Paytm extends JFrame implements ActionListener{
    
    Paytm()
    {
        setBounds(500,200,800,600);
        setTitle("Paytm Karo..");
        JEditorPane pane=new JEditorPane();
        pane.setEditable(false);
        try
        {
            pane.setPage("https://paytm.com/rent-payment");
        }
        catch(Exception e)
        {
             pane.setContentType("text/html");
             pane.setText("<html>Could Not Load Page, Error 404</html>");
        }
        JScrollPane sp=new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back=new JButton("Back");
        back.setBounds(610,20,80,40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.addActionListener(this);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
            setVisible(false);
    }
    public static void main(String args[])
    {
        new Paytm();
    }
}
