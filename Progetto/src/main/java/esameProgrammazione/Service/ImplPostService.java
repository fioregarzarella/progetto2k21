package esameProgrammazione.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import esameProgrammazione.Model.ApiParams;
import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.Stat;
import esameProgrammazione.Model.StatDate;
import esameProgrammazione.Model.postParams;



@Service
public class ImplPostService implements PostService {
	public  ArrayList<Post> posts= new ArrayList<Post>();
	private StatDate filtroData;
	private Stat[] filtro_stat=new Stat[2];
	
	
	
	public ImplPostService(ApiParams type, postParams params) {
		
		try {
			ArrayList<Post> lista=JsonParser.parsing(type, params);
			System.out.println("ciao");
			for(int i=0; i<lista.size(); i++) {
				 Post psPost=lista.get(i);
				 posts.add(psPost);
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	public ArrayList<Post> getPosts(){
		return posts;
	}
	
	public Stat[] visualizza_stat(Object filtro, postParams parametro) {
		return null;
		
	}
	
	public  StatDate Stat_Data(Object filtro, postParams parametro) {
		return null;
	}
	
	
	
	
}
