package com.stringComparisio.StringComparisonFromPDF;

import com.testautomationguru.utility.PDFUtil;

public class StringComparisionCode {

	// public String pdfLocation = "/Users/deepaksrivastava/Desktop/2019 20 ITR
	// form.pdf";

	public void compareStringInPDF(String pdfLocation) throws Exception {

		PDFUtil pdfUtil = new PDFUtil();

		String pdfContent = pdfUtil.getText(pdfLocation);
		System.out.println(pdfContent);
		// String stringToBeValidated = "anyString";
		// String stringToBeValidated = StringComparisonGUI.class.input;
		StringComparisonGUI scg = new StringComparisonGUI();
		String stringToBeValidated = scg.input;

		if (pdfContent.contains(stringToBeValidated))
			System.out.println("This PDF contains: " + stringToBeValidated);
		else
			System.out.println("This PDF does not contain: " + stringToBeValidated);

	}
}
