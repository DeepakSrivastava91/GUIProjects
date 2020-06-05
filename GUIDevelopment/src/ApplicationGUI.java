import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ApplicationGUI {

	// ActionListener aL;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationGUI window = new ApplicationGUI();
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
	public ApplicationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnChooseFile = new JButton("Choose actual File");
		btnChooseFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				OpenFile op = new OpenFile();
				try {
					op.PickMe();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		btnChooseFile.setBounds(100, 10, 172, 29);
		frame.getContentPane().add(btnChooseFile);

	}
}
