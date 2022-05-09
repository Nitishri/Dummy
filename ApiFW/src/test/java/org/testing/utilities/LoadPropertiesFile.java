package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Purpose of this class is to load properties file
public class LoadPropertiesFile {

	
	public static Properties propertiesFile(String path) throws IOException
	{
	 File f = new File(path);  //connection establish	
	 FileInputStream fi = new FileInputStream(f);
	 Properties pr = new Properties();
	 pr.load(fi);
	
	return pr;
	
	
	
	}
}
