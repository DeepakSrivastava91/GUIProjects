package PDFReaderGui.PdfReaderGui;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class OpenFile {

	JFileChooser actualFileChooser = new JFileChooser();
	JFileChooser expectedFileChooser = new JFileChooser();

	StringBuilder sbActual = new StringBuilder();
	StringBuilder sbExpected = new StringBuilder();

	static String actualFilePath;
	static String expectedFilePath;

	public File file;

	public void PickMeActual() throws Exception {
		// String actualFilePath =
		// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
		// System.out.print(actualFilePath);

		if (actualFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			// get the file
			file = actualFileChooser.getSelectedFile();

			// create a scanner for the file
			Scanner input = new Scanner(file);

			// fetching the path of actual file
			// File path1 = fileChooser.getCurrentDirectory();
			// String actualFilePath =
			// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
			// String actualFilePath =
			// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
			// System.out.print(actualFilePath);

			while (input.hasNext()) {
				sbActual.append(input.nextLine());
				sbActual.append("\n");
			}
			input.close();

		} else {
			sbActual.append("No file was selected");
		}

		actualFilePath = actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
		// System.out.print(actualFilePath);

		// String actualFilePath =
		// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
		// System.out.print(actualFilePath);

		// return actualFilePath;
	}

	// ******Expeted file COde***********

	public void PickMeExpected() throws Exception {
		// String actualFilePath =
		// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
		// System.out.print(actualFilePath);

		if (expectedFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			// get the file
			file = expectedFileChooser.getSelectedFile();

			// create a scanner for the file
			Scanner input = new Scanner(file);

			// fetching the path of actual file
			// File path1 = fileChooser.getCurrentDirectory();
			// String actualFilePath =
			// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
			// String actualFilePath =
			// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
			// System.out.print(actualFilePath);

			while (input.hasNext()) {
				sbExpected.append(input.nextLine());
				sbExpected.append("\n");
			}
			input.close();

		} else {
			sbExpected.append("No file was selected");
		}

		expectedFilePath = expectedFileChooser.getSelectedFile().getAbsoluteFile().toString();
		// System.out.print(actualFilePath);

		// String actualFilePath =
		// actualFileChooser.getSelectedFile().getAbsoluteFile().toString();
		// System.out.print(actualFilePath);

		// return actualFilePath;
	}
}
