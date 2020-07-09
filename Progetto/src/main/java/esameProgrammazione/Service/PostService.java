package esameProgrammazione.Service;

import java.util.Collection;

import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.postParams;

public interface PostService {
	
	
	public abstract Collection<Post> getPosts();
	
	
	public abstract Stat[] visualizza_stat(Object filtro, postParams parametro);
	
	
	public abstract StatDate Stat_Data(Object filtro, postParams parametro);

	

}
