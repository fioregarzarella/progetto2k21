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
			
		String[] y= params.getPostParam();
		String tmp=new String();
		
		for(int i=0;i< y.length-1;i++) {
			
			tmp = tmp + y[i]+ "," + y[i+1];
		}
		return tmp;
		
	}
	
	public static JSONObject JSONdownloader(ApiParams type,postParams params) throws ParseException, MalformedURLException {

		final String access_token="EAAFKYxCh5ZBcBANZCDFYPPBqsl63NKvNl8Qgpn338930GndGLMOltAmaZBrAV7pfKEu6b8KZCPjuu9JGOtAXuGaHh6BZBpHRQdDX0nlocFehY9dmqgdVabzw6QNk6GQmMmXCJCfRwjhrg0X1Jl6odl1teJiE6QgV3iCLUP0ZBoKU1FNZB1MEogPypuWaCQ08m3gQCgh0p8vYK9jXJEETZCiu8VZCv4brO7QZBVZC3YyHMw13wZDZD";
		
		String appoggio = new String(formatParams(params));
		
		String url=String.format("https://graph.facebook.com/me?fields=%s{%s}&access_token=%s", type.getaParams(), appoggio , access_token);

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
		System.out.println("eiiii sei arrivato qui3");
		JSONObject json = new JSONObject(data);
		
		
		return json;
		
	 }

	
}
