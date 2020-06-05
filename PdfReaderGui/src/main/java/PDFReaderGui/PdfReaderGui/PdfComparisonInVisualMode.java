package PDFReaderGui.PdfReaderGui;

import java.io.IOException;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

public class PdfComparisonInVisualMode {

	String folderLocation = "/Users/deepaksrivastava/Downloads/PDF Validation";
	// public String actualFile = "Path2";
	// public String expectedFile = "Path3";
	ApplicationGUI aGUI = new ApplicationGUI();

	public String locationActualFile() {
		OpenFile op = new OpenFile();
		String str = op.actualFilePath;
		return str;
	}

	public String locationExpectedFile() {
		OpenFile op = new OpenFile();
		String str = op.actualFilePath;
		return str;
	}

	public void readFile(String locationExpectedFile, String locationActualFile) {

		PDFUtil pdfUtil = new PDFUtil();
		// pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);

		pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
		pdfUtil.highlightPdfDifference(true);

		pdfUtil.setImageDestinationPath(folderLocation);

		try {
			pdfUtil.compare(locationExpectedFile, locationActualFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("program has entered into file comparision method");
	}

	// public void readExcel( ) {
	// PDFUtil pdfUtil = new PDFUtil();
	// // pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
	//
	// pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
	// pdfUtil.highlightPdfDifference(true);
	//
	// pdfUtil.setImageDestinationPath(folderLocation);
	//
	// try {
	// pdfUtil.compare(expectedFile, actualFile);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

}

// StringBuffer