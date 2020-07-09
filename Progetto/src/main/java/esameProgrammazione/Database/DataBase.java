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


import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.sun.el.parser.ParseException;

import esameProgrammazione.Model.ApiParams;
import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.postParams;

public class DataBase {
	public static JSONObject JSONdownloader(ApiParams type,postParams params) throws ParseException, MalformedURLException {
		
		final String access_token="EAAPj0sVhE6kBAFyEEM9xYOD56hf55dLsV0ZCIAIe5vyfkCwvGzlOH5uLABwL48ZBjJcNfcP9oNFpLnoL1UZAfRnM3pNW4ZApNKZCkWUy1TKTDgqG39jJTODB9ril9WHnrzLYoHBOBI346QpkW1ZA3ynF34Q6uYDbcMsdHqxyaSyxwRQpj9ENCncHQzAw0r8vTaoZCZCAnV5ZCCRIZBrgdfvQ2eepESxu3Uw8wC6iSdUhFxEAZDZD";
		
		String url=String.format("https://graph.facebook.com/me?fields=%s{%s}&access_token=%s", type, params, access_token);
		
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
