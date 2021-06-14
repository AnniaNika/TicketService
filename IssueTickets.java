import java.io.BufferedWriter;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Timer;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;

public class IssueTickets extends JFrame {
	
	ArrayList<TicketPassenger> ticketpass=new ArrayList();
	
	public IssueTickets() {
		 super();
	}
	public void prepareUI() {
		
		
		//Panel BoardingPass                   
		JPanel topPanel = new JPanel();
		Font font = new Font("Courier", Font.BOLD,12);
		JLabel boardpass=new JLabel("Boarding Pass");
		boardpass.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
		topPanel.add( boardpass,BorderLayout.NORTH);
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		topPanel.setVisible(true);
		
		JPanel topPanel2 = new JPanel();
		JLabel flight=new JLabel("Flight");
		JLabel boardTime=new JLabel("Boarding time");  
		JLabel gate=new JLabel("Gate") ;
		JLabel seat=new JLabel("Seat") ;
		JLabel firstlastNameLbl=new JLabel("Passenger's name");
		JLabel from=new JLabel("From");
		JLabel to=new JLabel("To");
		JLabel date=new JLabel("Date");
		JLabel class1=new JLabel("Seat class");
		
		 JTextField fli=new JTextField(10);
		 //Timer hours
		 String[] patternExamples6 = {"Select hour"};
		 JComboBox myComboBox6 = new JComboBox(patternExamples6);	
		 myComboBox6.setBounds(5, 90, 250, 30);	
		 
		 myComboBox6.addItem("00");	
		 myComboBox6.addItem("01");		
		 myComboBox6.addItem("02");   		
		 myComboBox6.addItem("03");
		 myComboBox6.addItem("04");		
		 myComboBox6.addItem("05");   		
		 myComboBox6.addItem("06");
		 myComboBox6.addItem("07");		
		 myComboBox6.addItem("08");   		
		 myComboBox6.addItem("09");
		 myComboBox6.addItem("10");		
		 
		 String[] patternExamples7 = {"Select minutes�"};
		 JComboBox myComboBox7 = new JComboBox(patternExamples7);	
		 myComboBox7.setBounds(5, 90, 250, 30);		
		 
		 //
		 myComboBox7.addItem("00");	
		 myComboBox7.addItem("01");		
		 myComboBox7.addItem("02");   		
		 myComboBox7.addItem("03");
		 myComboBox7.addItem("04");		
		 myComboBox7.addItem("05");   		
		 myComboBox7.addItem("06");
		 myComboBox7.addItem("07");		
		 myComboBox7.addItem("08");   		
		 myComboBox7.addItem("09");
		 myComboBox7.addItem("10");
		 myComboBox7.addItem("11");		
		 myComboBox7.addItem("12");   		
		 myComboBox7.addItem("13");
		 myComboBox7.addItem("14");		
		 myComboBox7.addItem("15");   		
		 myComboBox7.addItem("16");
		 myComboBox7.addItem("17");		
		 myComboBox7.addItem("18");   		
		 myComboBox7.addItem("19");
		 myComboBox7.addItem("20");	
		 myComboBox7.addItem("21");
		 myComboBox7.addItem("22");		
		 myComboBox7.addItem("23");   		
		 myComboBox7.addItem("24");
		 myComboBox7.addItem("25");		
		 myComboBox7.addItem("26");   		
		 myComboBox7.addItem("27");
		 myComboBox7.addItem("28");		
		 myComboBox7.addItem("29");   		
		 myComboBox7.addItem("30");
		 myComboBox7.addItem("31");
		 myComboBox7.addItem("32");
		 myComboBox7.addItem("33");
		 myComboBox7.addItem("34");
		 myComboBox7.addItem("35");
		 myComboBox7.addItem("36");
		 myComboBox7.addItem("37");
		 myComboBox7.addItem("39");
		 myComboBox7.addItem("40");
		 myComboBox7.addItem("41");
		 myComboBox7.addItem("42");
		 myComboBox7.addItem("43");
		 myComboBox7.addItem("44");
		 myComboBox7.addItem("45");
		 myComboBox7.addItem("46");
		 myComboBox7.addItem("47");
		 myComboBox7.addItem("48");
	     myComboBox7.addItem("49");
		 myComboBox7.addItem("50");
		 myComboBox7.addItem("51");
		 myComboBox7.addItem("52");
		 myComboBox7.addItem("53");
		 myComboBox7.addItem("54");
		 myComboBox7.addItem("55");
		 myComboBox7.addItem("56");
	     myComboBox7.addItem("57");
		 myComboBox7.addItem("58");
		 myComboBox7.addItem("59");
				
				
		JComboBox myComboBox8 = new JComboBox();	
		myComboBox8.setBounds(5, 90, 250, 30);		
		//	
		myComboBox8.addItem("p.m");	
		myComboBox8.addItem("a.m");		
			    
		 
		String[] patternExamples = {"Select gate"};
		JComboBox myComboBox = new JComboBox(patternExamples);	
		   
		
		myComboBox.setBounds(5, 90, 250, 30);		
				
		myComboBox.addItem("1");		
		myComboBox.addItem("2");   		
		myComboBox.addItem("3");
		myComboBox.addItem("4");		
	    myComboBox.addItem("5");   		
		myComboBox.addItem("6");
		myComboBox.addItem("7");		
		myComboBox.addItem("8");   		
		myComboBox.addItem("9");
		myComboBox.addItem("10");		
		myComboBox.addItem("11");   		
		myComboBox.addItem("12");
		myComboBox.addItem("13");		
		myComboBox.addItem("14");   		
		myComboBox.addItem("15");
	    myComboBox.addItem("16");		
		myComboBox.addItem("17");  
		myComboBox.addItem("18");	
		myComboBox.addItem("19");
	    myComboBox.addItem("20");
			
			
		String[] patternExamples2 = {"Select seat"};
		JComboBox myComboBox2=new JComboBox(patternExamples2);		
		   
		myComboBox2.setBounds(5, 90, 250, 30);		
	
		myComboBox2.addItem("1");		
		myComboBox2.addItem("2");   		
		myComboBox2.addItem("3");
		myComboBox2.addItem("4");		
		myComboBox2.addItem("5");   		
		myComboBox2.addItem("6");
		myComboBox2.addItem("7");		
		myComboBox2.addItem("8");   		
		myComboBox2.addItem("9");
		myComboBox2.addItem("10");		
		myComboBox2.addItem("11");   		
		myComboBox2.addItem("12");
		myComboBox2.addItem("13");		
		myComboBox2.addItem("14");   		
		myComboBox2.addItem("15");
		myComboBox2.addItem("16");		
		myComboBox2.addItem("17");  
		myComboBox2.addItem("18");	
		myComboBox2.addItem("19");
		myComboBox2.addItem("20");
			
		
		String[] patternExamples3 = {"Select A/B/C/D"};
		JComboBox myComboBox3=new JComboBox(patternExamples3);
		myComboBox3.addItem("A");		
		myComboBox3.addItem("B");   		
		myComboBox3.addItem("C");
		myComboBox3.addItem("D");
			
			
		JTextField firstLastName=new JTextField(30);
		JTextField from1=new JTextField(30);
		JTextField to1=new JTextField(30);
		    
		    
		//Date day
		String[] patternExamples9 = {"Select week day"};
		JComboBox myComboBox9 = new JComboBox(patternExamples9);	
		myComboBox6.setBounds(5, 90, 250, 30);		
		
	    myComboBox9.addItem("Monday");	
		myComboBox9.addItem("Tuesday");		
		myComboBox9.addItem("Wednesday");   		
		myComboBox9.addItem("Thursday");
		myComboBox9.addItem("Friday");		
		myComboBox9.addItem("Saturday");   		
		myComboBox9.addItem("Sunday");
					
		//Date daynumber
		 String[] patternExamples10 = {"Select day"};
		JComboBox myComboBox10 = new JComboBox(patternExamples10);	
		myComboBox10.setBounds(5, 90, 250, 30);			
				    
		myComboBox10.addItem("1");		
		myComboBox10.addItem("2");   		
		myComboBox10.addItem("3");
		myComboBox10.addItem("4");		
		myComboBox10.addItem("5");   		
		myComboBox10.addItem("6");
		myComboBox10.addItem("7");		
		myComboBox10.addItem("8");   		
		myComboBox10.addItem("9");
		myComboBox10.addItem("10");
		myComboBox10.addItem("11");		
		myComboBox10.addItem("12");   		
		myComboBox10.addItem("13");
		myComboBox10.addItem("14");		
		myComboBox10.addItem("15");   		
		myComboBox10.addItem("16");
		myComboBox10.addItem("17");		
		myComboBox10.addItem("18");   		
		myComboBox10.addItem("19");
		myComboBox10.addItem("20");	
		myComboBox10.addItem("21");
		myComboBox10.addItem("22");		
		myComboBox10.addItem("23");   		
		myComboBox10.addItem("24");
	    myComboBox10.addItem("25");		
		myComboBox10.addItem("26");
		myComboBox10.addItem("27");		
		myComboBox10.addItem("28");
		myComboBox10.addItem("29");		
		myComboBox10.addItem("30");
		myComboBox10.addItem("31");
				    
				    
				    
		//Date Month
		String[] patternExamples12 = {"Select month"};
		JComboBox myComboBox12 = new JComboBox(patternExamples12);	
		myComboBox12.setBounds(5, 90, 250, 30);		
			
					    
		myComboBox12.addItem("January");		
		myComboBox12.addItem("February");   		
		myComboBox12.addItem("March");
		myComboBox12.addItem("April");		
		myComboBox12.addItem("May");   		
		myComboBox12.addItem("June");
		myComboBox12.addItem("July");		
		myComboBox12.addItem("August");   		
		myComboBox12.addItem("September");
		myComboBox12.addItem("October");
		myComboBox12.addItem("November");		
		myComboBox12.addItem("December");   		
					    
		//Timer Year
		String[] patternExamples11 = {"Select month"};
	    JComboBox myComboBox11 = new JComboBox(patternExamples11);	
		myComboBox11.setBounds(5, 90, 250, 30);			
					    
		myComboBox11.addItem("2021");		
		myComboBox11.addItem("2022");   		
		myComboBox11.addItem("2023");
						
			
		JCheckBox first=new JCheckBox();
		first.setText("First Class");
		JCheckBox bus=new JCheckBox();
		bus.setText(" Business Class");
		JCheckBox eco=new JCheckBox();
		eco.setText(" Economy Class");
			
		ButtonGroup group2 = new ButtonGroup();		
		group2.add(first);		
		group2.add(bus);	
		group2.add(eco);	
		     
		JLabel  idticketlab = new JLabel("Ticket ID \t");
        JTextField idticket = new JTextField(10);
		     
		JLabel  pricelab = new JLabel("Original Price \t");
        JTextField price = new JTextField(10);
             
        JLabel  discountlab = new JLabel("Discount\t");
        JTextField discount = new JTextField(10);
             
        JLabel  totalpricelab = new JLabel("Total Cost\t");
        JTextField totalprice = new JTextField(10);
             
		topPanel2.setLayout(new BoxLayout(topPanel2, BoxLayout.PAGE_AXIS));
		topPanel2.add( flight);
		topPanel2.add( fli);
		topPanel2.add( myComboBox);
		topPanel2.add( boardTime);
		topPanel2.add( myComboBox6);
		topPanel2.add( myComboBox7);
	    topPanel2.add( myComboBox8);
		topPanel2.add( gate);
		topPanel2.add( myComboBox);
		topPanel2.add( seat);
		topPanel2.add( myComboBox2);
		topPanel2.add( myComboBox3);
	    topPanel2.add( firstlastNameLbl);
		topPanel2.add( firstLastName);
		topPanel2.add( from);
		topPanel2.add( from1);
		topPanel2.add( to);
		topPanel2.add( to1);
		topPanel2.add( date);
		topPanel2.add( myComboBox9);
		topPanel2.add( myComboBox10);
		topPanel2.add( myComboBox12);
		topPanel2.add( myComboBox11);
		topPanel2.add( class1);
		topPanel2.add( first );
		topPanel2.add( bus );
		topPanel2.add( eco );
		topPanel2.add( idticketlab );
		topPanel2.add( idticket );
		topPanel2.add( pricelab );
		topPanel2.add( price);
		topPanel2.add( discountlab );
		topPanel2.add( discount);
		topPanel2.add( totalpricelab );
		topPanel2.add( totalprice);
			
			 
			 
		topPanel2.setVisible(true);
		JButton calculatetn = new JButton("Calculate cost");
		JPanel topPanel3 = new JPanel();
		JButton saveBtn = new JButton("Save");
		topPanel3.add(calculatetn);
	    topPanel3.add(saveBtn);
		topPanel3.setVisible(true);
	    
	    calculatetn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int c = minusNumbers(price, discount);
					totalprice.setText(String.valueOf(c));
					
				}
				 
			 });
		    
	    saveBtn.addActionListener(new ActionListener() {
	    	
		        @Override
		          public void actionPerformed(ActionEvent e) {
		        	
			          String fligt1=fli.getText();
			          String hours = myComboBox6.getSelectedItem().toString();
			          String minutes= myComboBox7.getSelectedItem().toString();
			          String ampm = myComboBox8.getSelectedItem().toString();
			          String gate1 = myComboBox.getSelectedItem().toString();
			          String seat= myComboBox.getSelectedItem().toString();
			          String seat2 = myComboBox.getSelectedItem().toString();
			          String name=firstLastName.getText();
			          String fr=from1.getText();
			          String t=to1.getText();
			          String day = myComboBox9.getSelectedItem().toString();
			          String daynumber= myComboBox10.getSelectedItem().toString();
			          String month= myComboBox12.getSelectedItem().toString();
			          String year = myComboBox11.getSelectedItem().toString();
			          //String class1= JCheckBox.getText();
			          String idticket2=idticket.getText();
			          String totalcost =totalprice.getText();
			           	   
			          if ((fligt1 != null && !fligt1.isEmpty()) && (hours.equals("Select hour")) 
			           	  && (minutes.equals("Select minutes"))&& (gate1.equals("Select gate"))
			           	  && (seat.equals("Select seat"))&&(seat2.equals("Select A/B/C/D"))
			           	  && (name != null && !name.isEmpty()) && (fr != null && !fr.isEmpty()) 
			           	  && (t != null && !t.isEmpty())&& (day.equals("Select week day")) 
			           	  && (daynumber.equals("Select day"))&& (month.equals("Select month"))
	         			  && (year.equals("Select year")) && (idticket2 != null && !idticket2.isEmpty())
	         			  && (totalcost != null && !totalcost.isEmpty()))  {
			           		      
			        	        JOptionPane.showMessageDialog(IssueTickets.this, 
			           		        	"Some fields are incorrect.",
			           		        	"Error allocating file",
			           		        	JOptionPane.ERROR_MESSAGE);    
			           		             return;                    
			           		             }
			                 
			          int dayint=Integer.parseInt(daynumber);
			          int yearint=Integer.parseInt(year);
			          int hoursint=Integer.parseInt(hours);
			          int minutesint=Integer.parseInt(minutes);
			          float totalcostint=Float.parseFloat(totalcost);
			          int idticket2int=Integer.parseInt(idticket2);
			           	  
			          Date d1=new Date(day, dayint,month, yearint);
			          Time t1=new Time(hoursint, minutesint,ampm);
			          TicketPassenger passenger = new TicketPassenger(fligt1,t1 ,gate1,seat,seat2,name,fr,t,d1,idticket2int,totalcostint);
			          ticketpass.add(passenger);
			         
			                
			         final JFileChooser fc = new JFileChooser();  
			         int returnVal = fc.showSaveDialog(IssueTickets.this);    
			                
			        if (returnVal == JFileChooser.APPROVE_OPTION) {     
			        String fileName = fc.getSelectedFile().getPath();     
			                      
			        if (fileName != null && !fileName.isEmpty()) {
			                saveTicketOfPassengers(fileName);
			            	System.exit(0);
			                MainFrame fm=new MainFrame();
			        
			                 }
			          }		         
			        
				}
		       
		     });
	    	
			this.addWindowListener(new WindowAdapter() {

					@Override
					public void windowClosing(WindowEvent arg0) {
						int input = JOptionPane.showConfirmDialog(IssueTickets.this, "Do you want to exit?");  
						if(input==JOptionPane.YES_OPTION) {       
							MainFrame fm=new MainFrame();
						}
					}
				   });  
			  
             this.setSize(600, 600);
             JScrollBar hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 300);
             JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);
             hbar.setUnitIncrement(2);
             hbar.setBlockIncrement(1);
             add(hbar, BorderLayout.SOUTH);
             add(vbar, BorderLayout.EAST);
             this.add(topPanel,BorderLayout.NORTH);
             this.add(topPanel2,BorderLayout.CENTER);
  
             this.add(topPanel3,BorderLayout.SOUTH);
             this.setResizable(true);
             this.setTitle("Book new tickets");
             this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
             this.setVisible(true);
  
}
	
	    public int minusNumbers(JTextField f1,JTextField f2) {
		String text3 = f1.getText();
		int num1 = Integer.parseInt(text3);
		String text4 = f2.getText();
		int num2= Integer.parseInt(text4);
		
		return (num1-num2);
		}
	
	    public void saveTicketOfPassengers(String fileName) {      
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(fileName, true));    //�� ������ �� �������� ��� ���� ��� ���������� ������� ��� ����� ������ ��� ����������.
            
            for(TicketPassenger ticket: ticketpass) {    //��� ���� ����������� TicketPassenger ����� �������� ���� ����� ticketpass(synolo ������ ��� ticketpassenger)
                file.write(ticket.toString());       //���� ��� �� ����������� ticket ��� ������ toString ��� ������ ���� ��� ������.
                file.newLine();                      
                }
           file.close();
			
		   JOptionPane.showMessageDialog(IssueTickets.this,
                             fileName,                                  
                            "Finished saving",
                            JOptionPane.INFORMATION_MESSAGE); 
		   MainFrame fm=new MainFrame();
                        
        } catch (IOException ex) {
            
        }
	}
	
}
