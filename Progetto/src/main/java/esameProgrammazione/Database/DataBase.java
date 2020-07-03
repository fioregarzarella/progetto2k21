package esameProgrammazione.Database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.sun.el.parser.ParseException;

import esameProgrammazione.Model.Post;

public class DataBase {
	public static JSONObject JSONdownloader(Post post) throws ParseException, MalformedURLException {
		String url = "";
		
		String data = "";
		String line = "";
		
		try {
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
		
			try {
				   InputStreamReader inR = new InputStreamReader( in );
				   
				   BufferedReader buf = new BufferedReader( inR );
				  
				   while ( ( line = buf.readLine() ) != null ) {
					   data+= line;
				   }
			} finally {
				 in.close();
			}
		} catch (IOException e) {	
			e.printStackTrace();	
		} catch (Exception e) {	
			e.printStackTrace();	
			}
		
		JSONObject json = new JSONObject();
		
		json = (JSONObject) JSONValue.parse(data);
		
		return json;
		
	 }
}
