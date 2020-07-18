package esameProgrammazione.Database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import java.lang.*;
import org.json.JSONObject;


import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.sun.el.parser.ParseException;

import esameProgrammazione.Model.ApiParams;
import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.postParams;

public class DataBase {
	
	private static String formatParams(postParams params) {
		if(params.getPostParam()==null) {
			return "";
		}
		if(params.ricercaParametro("attachments", params)==true) {
			
			String[] z= params.getPostParam();
			String tmp=new String();
			for (int i=0;i<z.length;i++) {
						if( z[i].contains("attachments")) {
					    tmp = z[i] + "{media_type}";
				        }
		    }
	    return tmp;}
		
		
        params.stampaPostParam();
		String[] y= params.getPostParam();
		String tmp=new String();
		if(y.length==1) {
			tmp=y[0];
		                }
		else {
				for(int i=0;i< y.length-1;i++) {
					tmp = tmp + y[i]+ "," + y[i+1];
					}
		      }	
		return tmp;
		}
	
	/*private static String attachformatParams(postParams params) {
		
		if(params.ricercaParametro("attachments", params)==true) {
		
			String[] z= params.getPostParam();
			String tmp=new String();
			for (int i=0;i<z.length-1;i++) {
						if( z[i].contains("attachments")) {
					    tmp = z[i] + "{media_type}"+ ",";
				        }
						
			}
	return tmp;}
		else return "";
		
	}*/
	
	
	
	public static JSONObject JSONdownloader(ApiParams type,postParams params) throws ParseException, MalformedURLException {

		final String access_token="EAAFKYxCh5ZBcBAHcNWZBABbrUK5bHkXiH1iHYHPFqPaq253KlB5ajK13jvkFhPqoZBvSACfFbRj9AtVTInBLmXwf6NZA1lEpcZBqPjyKtihZBPuUVZA6UxOYMmgUYDP8Dg7g7gBxBJPTSQJZCwCGRMRyxuouyQdyjrWTPBFeCvRMoqHjDm2PIW0ZB3onZBZBh5WF6GePDgBjI4ge1BVI6hqEvQVKJcgNmLqvaE6e50ZCBNJCsAZDZD";
		
		String appoggio = new String(formatParams(params));
		
		String url=String.format("https://graph.facebook.com/me?fields=%s{%s}&access_token=%s", type.getaParams(), appoggio , access_token);
System.out.println(url);
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
		
		JSONObject json = new JSONObject(data);
		
		return json;
		
	 }

	
}
