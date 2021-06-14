import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.event.AncestorListener;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		super();
		prepareGUI();
	}
	
public void prepareGUI() {
	JPanel west = new JPanel();
	west.setLayout(new BoxLayout(west, BoxLayout.PAGE_AXIS));
	JButton ek=new JButton();
	ek.setText("Book new ticket");
	JButton li=new JButton();
	li.setText("List of tickets:");
	JButton info =new JButton();
	info.setText("Application info");
	JButton exit =new JButton();
	exit.setText("Exit");
	
	ek.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			IssueTickets it=new IssueTickets();
			it.prepareUI();
			}
	}
);
	li.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			ListOfIssueTickets list=new ListOfIssueTickets();
			list.prepareUI();
			}
	}
);
	info.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			InformationApp information=new InformationApp();
			information.prepareUI();
			}
	}
);
	exit.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int input = JOptionPane.showConfirmDialog(MainFrame.this, "Do you want to exit the app?");  // rootPane=Panel to opoio einai pano apo ola ta  JFrames. //null=to dialog tha emfanizotan ektos toy parent frame gia ayto kai MainFrame.this
					if(input==JOptionPane.YES_OPTION) {       //��� ���� ������� �� Yes ���� ���� exit.
						System.exit(0);
					}
				}}
	);
	this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent arg0) {
			int input = JOptionPane.showConfirmDialog(MainFrame.this, "Do you want to exit the app?");  // rootPane=Panel to opoio einai pano apo ola ta  JFrames. //null=to dialog tha emfanizotan ektos toy parent frame gia ayto kai MainFrame.this
			if(input==JOptionPane.YES_OPTION) {       //��� ���� ������� �� Yes ���� ���� exit.
				System.exit(0);
			}
			
		}
		
		
	}
	);              //���� �� ��������o���� WindowListener �� ������������ WindowAdapter()
	JPopupMenu menu = new JPopupMenu("Menu");
    menu.add(ek);
    menu.add(li);
    menu.add(info);
    menu.add(exit);
    menu.setVisible(true);
    west.add(menu);
    west.setMaximumSize(new Dimension(400, 100));

    
    west.setBorder(BorderFactory.createTitledBorder("Handle Ticket Service"));
    this.getContentPane().add(west);
    this.add(west, BorderLayout.CENTER);
    
  
    this.setSize(780,400);
    this.setLocationRelativeTo(null);
    this.setTitle("Main Frame");
    this.setVisible(true);
    this.setResizable(true);

    
 

}
}