import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class Diaxeiristis1 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 	static final String DB_URL = "jdbc:mysql://localhost/ktel";
 	static final String USER = "root";
 	static final String PASS = "1991";
 				
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diaxeiristis1 frame = new Diaxeiristis1();
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
	public Diaxeiristis1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

 		final JButton Update= new JButton("Update");
 		Update.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) { 
 				try{ 					
 					//Emfanish eggrafwn ths bashs se JTable
 					Class.forName(JDBC_DRIVER);
 				Connection Conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
 				Statement stm = (Statement) Conn.createStatement();
 				ResultSet rs=stm.executeQuery("SELECT * FROM reservations");
 				ResultSetMetaData meta =rs.getMetaData();
 				int Colnum=((ResultSetMetaData) meta).getColumnCount();
 				
 				DefaultTableModel mymodel = new DefaultTableModel();
 				table_1.setModel(mymodel);
 				
 				
 				for(int x=1; x<=Colnum;x++)
 				{
 					mymodel.addColumn(meta.getColumnLabel(x));
 				}
 				
 				while(rs.next())
 			     {
 					
 					Object [] file=new Object [Colnum];
 			           for(int y=0; y<Colnum;y++)
 			              {
 				           file [y]=rs.getObject(y+1);
 			              }
 			
 			      mymodel.addRow(file);
 			    }
 				
 				
 				}catch(ClassNotFoundException ce){
 					ce.printStackTrace();
 				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 			
 				
 				
 			}
 		});
		Update.setBounds(90, 65, 105, 20);
		contentPane.add(Update);
		
		JLabel lblNewLabel = new JLabel("Διαδρομη :");
		lblNewLabel.setBounds(21, 68, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Διαθεσιμες θέσεις :");
		lblNewLabel_1.setBounds(400, 341, 174, 14);
		contentPane.add(lblNewLabel_1);
	
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(400, 366, 174, 173);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 440, 384, 99);
		contentPane.add(textPane_1);
		
		JLabel lblA = new JLabel("A\u03BD\u03B1\u03BA\u03BF\u03B9\u03BD\u03C9\u03C3\u03B7 :");
		lblA.setBounds(10, 409, 149, 20);
		contentPane.add(lblA);
		
		JButton button = new JButton("\u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 Statistics Stat= new Statistics();
				 Stat.setVisible(true);
			}
		});
		button.setBounds(205, 64, 120, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u039A\u03C1\u03AC\u03C4\u03B7\u03C3\u03B7\u03C2");
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 Kataxorisi Kat= new Kataxorisi();
				 Kat.setVisible(true);
			}
		});
		
		
		button_1.setBounds(400, 307, 174, 23);
		contentPane.add(button_1);
		
		table_1 = new JTable();
		table_1.setBounds(10, 118, 384, 290);
		contentPane.add(table_1);
		
		
	
		
}
	}
