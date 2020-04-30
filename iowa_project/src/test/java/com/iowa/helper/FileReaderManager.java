package com.iowa.helper;

import java.io.IOException;

import com.iowa.helper.CofigurationReader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
public static FileReaderManager getInstance() {
	FileReaderManager frm = new FileReaderManager();
	return frm;
}
public CofigurationReader getcrInstance() throws IOException {
	CofigurationReader cr = new CofigurationReader();
	return cr;
	
}
}
