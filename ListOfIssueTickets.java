import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ListOfIssueTickets extends JFrame {
	
	
	private JTextArea  area = new JTextArea();
	private  JPanel p3 = new JPanel();
	private Font font3 = new Font("Courier", Font.BOLD,12);
	private JLabel l5= new JLabel("Total booked tickets:",SwingConstants.CENTER);
	private JLabel ld= new JLabel("");
	private Font fonta = new Font("Courier", Font.BOLD,12);
	private JLabel la= new JLabel("Total cost of all booked tickets:",SwingConstants.CENTER);
	private Font fontb = new Font("Courier", Font.BOLD,12);
	private JLabel lb= new JLabel("Cheaper ticket:",SwingConstants.CENTER);
	private Font fontc = new Font("Courier", Font.BOLD,12);
	private JLabel lc= new JLabel("Most expensive ticket:",SwingConstants.CENTER);
		
	ArrayList<TicketPassenger> ticketpass=new ArrayList();
	public ListOfIssueTickets() {
		 super();
	}
	public void prepareUI() {
			

	   this.addWindowListener(new WindowAdapter() {	
				@Override
				public void windowActivated(WindowEvent e) {
					
					 final JFileChooser fc = new JFileChooser();  
					 int returnVal=fc.showOpenDialog(ListOfIssueTickets.this);
					 
					 if(returnVal==JFileChooser.APPROVE_OPTION) {
						  String fileName = fc.getSelectedFile().getPath();
						      if (fileName != null && !fileName.isEmpty()) {
							  loadPassengerTicket(fileName) ;
							  
						  }
					 }
					 else
						 if(returnVal==JFileChooser.CANCEL_OPTION) {
							 	
						 }
					
				}
		 });   
		
		
	   
		l5.setFont(font3.deriveFont(font3.getStyle() | Font.BOLD));
		lb.setFont(fontb.deriveFont(fontb.getStyle() | Font.BOLD));
		Font fontc = new Font("Courier", Font.BOLD,12);
		lc.setFont(fontc.deriveFont(fontc.getStyle() | Font.BOLD));
		p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
		p3.add( l5);
		p3.add( ld);
		p3.add( la);
		p3.add( lb);
		p3.add( lc);
		
		//�� �������� ���� �� ������ �� �������� ���� �������
		JPanel topPanel3 = new JPanel();
		JButton ek = new JButton("Book new ticket");
		JButton ref = new JButton("Refresh");
		JButton ex = new JButton("Exit");
		topPanel3.add(ek);
	    topPanel3.add(ref);
	    topPanel3.add(ex);
		topPanel3.setVisible(true);
		topPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ek.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				IssueTickets it=new IssueTickets();
				it.prepareUI();
				}
		}
	);
		ref.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ListOfIssueTickets list=new ListOfIssueTickets();
				list.prepareUI();
				}
		}
	);
		ex.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				  
				MainFrame fm=new MainFrame();
			}
		});
		  //setup the frame
	    
	    this.setSize(780, 400);
	    this.setLocationRelativeTo(null);
	    this.setTitle("List of booked tickets");
	    this.add(area, BorderLayout.CENTER);
	    this.add(p3, BorderLayout.NORTH);
	    this.add(topPanel3, BorderLayout.SOUTH);
	    
	    this.setVisible(true);
	   

}
	
	private void loadPassengerTicket(String fileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line="";
			String [] tokens;
			 TicketPassenger passenger;
			
			
			while(reader.ready()) {      //��� �� ��� �� ����� ��� �������.��� � ready() ����������� true  �������� ��� ��� �������� �� �������.
				
				line=reader.readLine();
				area.append(line);
		     	area.append("\n");            
				
		     
				line=reader.readLine();              //� buffer �������� ��� ��� ������.
				                                       //������� ������ �� �� String �� ��������  ���� ��� delimeter ��� ��� ������ ������(tab space).���������� array ��� Strings 
				tokens=line.split("\t");                //���������� String array
				
				int hrint=Integer.parseInt(tokens[1]);	
				int miint=Integer.parseInt(tokens[2]);
				int daint=Integer.parseInt(tokens[12]);	
				int yeint=Integer.parseInt(tokens[13]);
				float costint=Float.parseFloat(tokens[14]);
	         	int idticket2int=Integer.parseInt(tokens[15]);
	         	
	         	 Time t1=new Time( hrint,miint,tokens[3]);
	         	 Date d1=new Date(tokens[10],daint,tokens[12], yeint);
	               
				if(tokens.length==16)  {                         //����������� ��� ���� ��� ������� ��� ���� ������� � �������.�� �������� ��� ������� NewPassengerIssuTicket ����� 
					
					 passenger=new TicketPassenger(tokens[0],t1,tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9],d1,idticket2int,costint);
					 ticketpass.add(passenger);
				}
				
				
		
				
				ticketpass.sort(Comparator.comparing(TicketPassenger::getCostTicket).reversed());
				
				
				for(TicketPassenger ticket: ticketpass) {    
				    area.append(ticket.toString());
					area.append("\n");                    
		            }
		            
		        }
			
			 int x=ticketpass.size();
			 String s=Integer.toString(x);
			 ld.setText(s);
			reader.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} 
	}
	
	
	
}







