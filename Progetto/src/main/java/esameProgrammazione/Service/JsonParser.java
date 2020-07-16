package esameProgrammazione.Service;

import java.net.MalformedURLException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.el.parser.ParseException;

import esameProgrammazione.Database.DataBase;
import esameProgrammazione.Model.ApiParams;
import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.Privacy;
import esameProgrammazione.Model.postParams;

public class JsonParser { 
	
	
	public static ArrayList<Post> parsing(ApiParams type, postParams params) throws MalformedURLException, ParseException{
			
	JSONObject parser =  DataBase.JSONdownloader(type, params);
	JSONArray data =  (JSONArray)  parser.getJSONObject("posts").getJSONArray("data");
	
	ArrayList<Post> listaPosts= new ArrayList<Post>();
	
	for(int i=0; i< data.length(); i++) {
		Post post = new Post();
		
		JSONObject postObject = (JSONObject) data.get(i);
		/*if( postObject.get("message")=="null") {
			post.setMessage("");}
		else {
			post.setMessage( (String) postObject.get("message"));
		}*/
		
		
		//post.setCreated_time( (String) postObject.get("created_time"));
		post.setId( (String) postObject.get("id"));
		
		if(params.ricercaParametro("privacy", params)==true) {
			
			Privacy tmp =new Privacy();
			tmp.setValue( (String) postObject.getJSONObject("privacy").get("value"));
			tmp.setDescription( (String) postObject.getJSONObject("privacy").get("description"));
			
			post.setPrivacy(tmp);
		}

		
		if(params.ricercaParametro("attachments", params)==true) {
			JSONArray attach = (JSONArray) postObject.getJSONObject("attachments").get("data");
			JSONObject media_tipo = attach.getJSONObject(i);
			String tipoMedia = (String) media_tipo.get("media_type");
			post.setMedia_type(tipoMedia);
			
		}
		
		listaPosts.add(post);
		
		
	} //fine for
	
	
	return listaPosts;
	
	
	
	} //fine metodo
	
}
