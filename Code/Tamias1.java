
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Tamias1 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
          	   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
					Tamias1 frame = new Tamias1();
					frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Tamias1()  {
		//-------------------------------------------------------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();                                //WINDOW
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	//--------------------------------------------------------------------------	
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Print Printjob=new Print();
				Printjob.setVisible(true);
			}
		});
		btnPrint.setBounds(429, 208, 89, 23);                      //JBUTTON
		contentPane.add(btnPrint);
	//-------------------------------------------------------------------------------	
				
		
		 final  String[] Routes = {"--Select--", "Αλεξανδρούπολη","Άμφισσα","Αργοστόλι", "Άρτα", "Βέροια", "Βόλος", "Γρεβενά","Δράμα", "Έδεσσα", "Ζάκυνθος", "Ηγουμενίτσα", "Θεσσαλονίκη","Ιωάννινα", "Καβάλα", "Καστοριά", "Κατερίνη", "Κοζάνη","Κομοτηνή", "Κιλκίς", "Καρδίτσα", "Καρπενήσι", "Κόρινθος","Καλαμάτα", "Κέρκυρα", "Λευκάδα", "Λαμία", "Λιβαδειά","Λάρισα", "Μεσολόγγι", "Ναύπλιο", "Ξάνθη", "Πολύγυρος","Πρέβεζα", "Πύργος", "Πάτρα", "Σέρρες", "Σπάρτη","Τρίκαλα","Τρίπολη","Φλώρινα","Χαλκίδα" };
		 final JComboBox comboBox = new JComboBox(Routes);
		 
		 		
		comboBox.setBounds(165, 124, 130, 23);     //COMBOBOX DESTINATION
		contentPane.add(comboBox);
		
		
		//--------------------------------------------------------------------------
		textField = new JTextField();
		textField.setBounds(165, 39, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	//--------------------------------------------------------------------------------	
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(165, 77, 148, 20);
		contentPane.add(textField_1);
	//--------------------------------------------------------------------------------	
		String [] Time ={"8:30","13:00","16:30","21:00"};
		JComboBox comboBox_1 = new JComboBox(Time);
		comboBox_1.setBounds(165, 208, 113, 23);                     //COMBOBOX TIME
		contentPane.add(comboBox_1);
	//--------------------------------------------------------------------------------	
		
		String [] Seat = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};
		JComboBox comboBox_2 = new JComboBox(Seat);
		comboBox_2.setBounds(165, 245, 113, 23);                     //COMBOBOX SEAT
		contentPane.add(comboBox_2);
		
	//--------------------------------------------------------------------------------	
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(20, 39, 130, 20);
		contentPane.add(lblNewLabel);
		//----------------------------------------------------------------------------------
		JLabel label = new JLabel("Surname :");
		label.setBounds(20, 77, 130, 20);
		contentPane.add(label);
		//-------------------------------------------------------------------------------------
		String [] Days = {"Δευτέρα","Τρίτη","Τετάρτη","Πέμπτη","Παρασκευή","Σάββατο","Κυριακή"};
		JComboBox comboBox_3 = new JComboBox(Days);
		comboBox_3.setBounds(165, 166, 113, 23);
		contentPane.add(comboBox_3);		
		JLabel lblDay = new JLabel("Day :");
		lblDay.setBounds(20, 168, 67, 19);
		contentPane.add(lblDay);
	//--------------------------------------------------------------------------------------	
		JLabel label_1 = new JLabel("Route :");
		label_1.setBounds(20, 125, 130, 20);
		contentPane.add(label_1);
	//-------------------------------------------------------------------------------	
		JLabel label_2 = new JLabel("Time :");
		label_2.setBounds(20, 209, 130, 20);
		contentPane.add(label_2);
	//-------------------------------------------------------------------------------	
		JLabel label_3 = new JLabel("Seat number :");
		label_3.setBounds(20, 246, 130, 20);
		contentPane.add(label_3);
	//------------------------------------------------------------------------------------	
		JTextPane textPane = new JTextPane();
		textPane.setBounds(52, 306, 298, 211);
		contentPane.add(textPane);
		
		
	}

	
	

	
	
	
	}

