package org.testing.utilities;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadXmlData {

	public static void readXml(String path) throws IOException {
		
		File f = new File(path);
		java.io.FileReader fr = new java.io.FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		

	String s;
	while((s=b.readLine())!=null)
	{
		System.out.println(s);
		
}
}
}