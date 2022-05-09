package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;
 //output we want is bodydata of json
public class Json {

	public static String loadJsonFile(String path) throws FileNotFoundException
	{
	File f = new File(path);
	FileInputStream fi = new FileInputStream(f);
	JSONTokener js = new JSONTokener(fi);
	JSONObject jobody = new JSONObject(js);

         return jobody.toString();
}
}