package esameProgrammazione.Service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.support.StaticApplicationContext;

import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.Stat;
import esameProgrammazione.Model.StatDate;
import esameProgrammazione.Model.postParams;

public interface PostService {
	
	
	public abstract ArrayList<Post> getPosts();
	
	
	public abstract Stat[] visualizza_stat(Object filtro, postParams parametro);
	
	
	public abstract StatDate Stat_Data(Object filtro, postParams parametro);

	

}
