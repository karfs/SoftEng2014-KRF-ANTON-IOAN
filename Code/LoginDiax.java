
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;


public class LoginDiax extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginDiax frame = new LoginDiax();
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
	public LoginDiax()  {	
	
	
		final String User="Admin";
		final String Pass="ktel";
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 308, 165);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//----------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setBounds(10, 11, 78, 23);
		contentPane.add(lblNewLabel);
		//----------------------------------------------------
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(10, 51, 78, 23);
		contentPane.add(lblNewLabel_1);
		//----------------------------------------------------
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(10, 85, 89, 23);
		contentPane.add(btnCancel);
		//----------------------------------------------------
		Username = new JTextField();
		Username.setBounds(86, 12, 161, 20);
		Username.setColumns(10);
		contentPane.add(Username);
		//----------------------------------------------------		
		Password = new JTextField();
		Password.setColumns(10);
		Password.setBounds(86, 52, 161, 20);
		contentPane.add(Password);
		//----------------------------------------------------
		        
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(Username.getText().trim().compareTo(User)== 0  && Password.getText().trim().compareTo(Pass) ==0 )
				{				
					Diaxeiristis1 Admin =new Diaxeiristis1();
					Admin.setVisible(true);
					
				}
			}
		});
		btnLogin.setBounds(158, 85, 89, 23);
		contentPane.add(btnLogin);
		
		
	}
}












