package com.jc.testappium.utils;

public enum TestCases {

	T1("Fungsi Tambah"),
	T2("Fungsi Kali");
	
	private String testName;
	
	private TestCases(String value) {
		this.testName = value;
	}

	public String getTestName() {
		return testName;
	}
	
	
	
}
