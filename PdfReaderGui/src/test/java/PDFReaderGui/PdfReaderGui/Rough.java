package PDFReaderGui.PdfReaderGui;

import java.io.IOException;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

public class Rough {

	public static String folderLocation = "//Users//deepaksrivastava//Downloads//PDF Validation";
	public static String actualFile = "Users//deepaksrivastava//Downloads//ITR 2018-19.pdf";
	public static String expectedFile = "Users//deepaksrivastava//Downloads//ITR.pdf";

	public static void main(String[] args) {

		PDFUtil pdfUtil = new PDFUtil();
		// pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);

		pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
		pdfUtil.highlightPdfDifference(true);

		pdfUtil.setImageDestinationPath(folderLocation);

		try {
			pdfUtil.compare(expectedFile, actualFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("program has entered into file comparision method");
	}

}
