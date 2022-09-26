package com.properties;

import java.io.IOException;

public class FileReaderManager {

	
	
	
	public static FileReaderManager getinstance() {

	FileReaderManager helper=new FileReaderManager();
	return helper;
	
	}
	
	
	
	public ConfigurationReader getinstanceCR() throws IOException {

		
		ConfigurationReader reader=new ConfigurationReader();
		return reader;
	}
}
