import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class waiting_room_management {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	management m = new management();
	Font font = new Font("Ariel",Font.BOLD,13);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waiting_room_management window = new waiting_room_management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public waiting_room_management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Waiting room management");
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("** Register new Patient");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 424, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2. Serve Patient");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 277, 111, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3. Cancell All");
		lblNewLabel_2.setBounds(10, 86, 96, -41);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3. Cancell All");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(131, 278, 96, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4. Can Doctor Go Home?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(237, 278, 164, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5. Show All Patient");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(411, 278, 222, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Which you want to choose?");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(175, 319, 193, 35);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setFont(font);
				textField.setText(m.ServePatient());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(89, 377, 66, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setFont(font);
				textField.setText(m.CancelAll());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(187, 377, 66, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setFont(font);
				textField.setText(m.CanDoctorGoHome());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(290, 377, 66, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setFont(font);
				textField.setText(m.ShowAllPatient());
			}
		});
		btnNewButton_4.setBounds(389, 377, 66, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(30, 478, 505, 272);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Display");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(241, 428, 115, 45);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Name :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(30, 56, 66, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Age :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(30, 80, 46, 23);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Blood Group :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(30, 114, 104, 19);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 55, 133, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 82, 116, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 113, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		JButton btnNewButton_5 = new JButton("ENTRY !");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
	    	     {
	    	    	 textField.setText(m.RegisterPatient(textField_1.getText(),textField_2.getText(),textField_3.getText()));
	    	    	 textField_1.setText("");
	 				 textField_2.setText("");
	 				 textField_3.setText("");
	    	     }
	    	     catch(Exception e1) 
	    	     {
	    	    	 System.out.println(e1+" ");
	    	     }
			}
		});
		btnNewButton_5.setBounds(30, 171, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
	
		
		JButton btnNewButton_6 = new JButton("Erase");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton_6.setBounds(133, 171, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
	}
}








