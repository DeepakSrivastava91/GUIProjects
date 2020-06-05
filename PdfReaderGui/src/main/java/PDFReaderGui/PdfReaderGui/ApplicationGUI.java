package PDFReaderGui.PdfReaderGui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ApplicationGUI {

	// JFileChooser actualFileChooser = new JFileChooser();

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

		// ****************************button for actual file***************************

		JButton btnChooseFile = new JButton("Choose actual File");
		btnChooseFile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				OpenFile op = new OpenFile();

				try {
					op.PickMeActual();

				} catch (Exception e1) {

					e1.printStackTrace();
				}

			}

		});

		btnChooseFile.setBounds(100, 10, 172, 29);
		frame.getContentPane().add(btnChooseFile);

		// ************Code for expected file button***************

		JButton btnNewButton = new JButton("Choose Expected file");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				OpenFile op2 = new OpenFile();
				// PdfComparisonInVisualMode vC=new PdfComparisonInVisualMode();

				try {
					op2.PickMeExpected();

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		btnNewButton.setBounds(100, 62, 172, 29);
		frame.getContentPane().add(btnNewButton);

		// *********Button for Comparison**************************

		JButton btnCompare = new JButton("Compare");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// OpenFile op = new OpenFile();
				PdfComparisonInVisualMode vC = new PdfComparisonInVisualMode();
				String actual = vC.locationActualFile();
				// System.out.println(actual);
				String expected = vC.locationExpectedFile();
				System.out.println(expected);

				vC.readFile(expected, actual);

			}

		});

		btnCompare.setBounds(115, 124, 117, 29);
		frame.getContentPane().add(btnCompare);

	}
}
