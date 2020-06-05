package com.stringComparisio.StringComparisonFromPDF;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class StringComparisonGUI {

	private JFrame frame;
	private JTextField txtString;

	public String input;
	private JButton btnLoadPdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringComparisonGUI window = new StringComparisonGUI();
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
	public StringComparisonGUI() {
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

		JButton btnSearchString = new JButton("search string");
		btnSearchString.setBounds(270, 58, 117, 29);
		frame.getContentPane().add(btnSearchString);

		txtString = new JTextField();
		txtString.setToolTipText("type string here");
		txtString.setBounds(138, 58, 130, 26);
		frame.getContentPane().add(txtString);
		txtString.setColumns(10);

		btnLoadPdf = new JButton("Load PDF");
		btnLoadPdf.setBounds(9, 58, 117, 29);
		frame.getContentPane().add(btnLoadPdf);

		txtString.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				input = txtString.getText();
				txtString.setText(input);

			}

		});

		btnSearchString.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				StringComparisionCode scc = new StringComparisionCode();

				System.out.println("The value of input is as following " + input);
				try {
					scc.compareStringInPDF(scc.pdfLocation);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		/*
		 * txtString.addActionListener(new ActionListener() {
		 * 
		 * public void actionPerformed(ActionEvent e) {
		 * 
		 * String input = txtString.getText();
		 * 
		 * }
		 * 
		 * });
		 */
	}
}
