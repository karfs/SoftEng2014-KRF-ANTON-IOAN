
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Statistics extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistics frame = new Statistics();
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
	public Statistics() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 305, 78);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//-----------------------------------------------------------
		final  String[] Routes = {"--Select--", "Αλεξανδρούπολη","Άμφισσα","Αργοστόλι", "Άρτα", "Βέροια", "Βόλος", "Γρεβενά","Δράμα", "Έδεσσα", "Ζάκυνθος", "Ηγουμενίτσα", "Θεσσαλονίκη","Ιωάννινα", "Καβάλα", "Καστοριά", "Κατερίνη", "Κοζάνη","Κομοτηνή", "Κιλκίς", "Καρδίτσα", "Καρπενήσι", "Κόρινθος","Καλαμάτα", "Κέρκυρα", "Λευκάδα", "Λαμία", "Λιβαδειά","Λάρισα", "Μεσολόγγι", "Ναύπλιο", "Ξάνθη", "Πολύγυρος","Πρέβεζα", "Πύργος", "Πάτρα", "Σέρρες", "Σπάρτη","Τρίκαλα","Τρίπολη","Φλώρινα","Χαλκίδα" };
		JComboBox comboBox = new JComboBox(Routes);
		comboBox.setBounds(10, 11, 115, 20);
		contentPane.add(comboBox);
		//-----------------------------------------------------------
		final String [] Stats ={"--Select--","Ημέρας","Μήνα","Έτους"};
		JComboBox comboBox_1 = new JComboBox(Stats);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new MyComponent());
			    frame.setSize(300, 200);
			    frame.setVisible(true);
				
				
				
				
			}
		});
		comboBox_1.setBounds(155, 11, 115, 20);
		contentPane.add(comboBox_1);
		
		 
		  
	}

}
