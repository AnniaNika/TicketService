import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InformationApp extends JFrame {
	
	public InformationApp() {
		 super();  
	}
	public void prepareUI() {

		 JPanel p = new JPanel(new BorderLayout());
	
		 Font font = new Font("Courier", Font.BOLD,12);
		 JLabel l1= new JLabel("Application for ticket booking in JAVA",SwingConstants.CENTER);
		 l1.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
		 p.setBackground(Color.LIGHT_GRAY);
		 p.setBorder(BorderFactory.createTitledBorder("Application name:"));
		 p.add(l1);
		 p.setVisible(true);
		 
		 JPanel p2 = new JPanel();
		 Font font2 = new Font("Courier", Font.BOLD,12);
		 JLabel l3= new JLabel("Antonia Kollia-Nika",SwingConstants.CENTER);
		 l3.setFont(font2.deriveFont(font2.getStyle() | Font.BOLD));
		 p2.setBorder(BorderFactory.createTitledBorder("Developers fullname:"));
		 p2.setBackground(Color.LIGHT_GRAY);
		 
		 JPanel p3 = new JPanel();
		 Font font3 = new Font("Courier", Font.BOLD,12);
		JLabel l5= new JLabel("cs131073   -   13/6/2021",SwingConstants.CENTER);
		 l5.setFont(font3.deriveFont(font3.getStyle() | Font.BOLD));
		 p3.setBorder(BorderFactory.createTitledBorder("AM - Project Finished Date"));
		 p3.setBackground(Color.LIGHT_GRAY);
		 
		 
		 p2.add(l3);
		 p3.add(l5);
		 p2.setVisible(true);
		 
		 
		JPanel p4 = new JPanel();
		 JLabel  lblPic = new javax.swing.JLabel();
		 lblPic.setIcon(new javax.swing.ImageIcon("")); //screenshot
		 p4.add(lblPic);
		 p4.setSize(100, 100);
		 p4.setVisible(true);
		 
	        
		 this.setTitle("Application Info");
		 this.add(p,BorderLayout.NORTH);
		 this.add(p2,BorderLayout.CENTER);
		 this.add(p3,BorderLayout.SOUTH);
		 this.add(p4,BorderLayout.EAST);
		 
		 
		 
		 this.setSize(780, 400);
	     this.setLocationRelativeTo(null);
		 this.setVisible(true);
	
}
	
}
