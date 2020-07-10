package esameProgrammazione.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import esameProgrammazione.Model.Post;



@Service
public class ImplPostService implements PostService {
	public ArrayList<Post> postList = new ArrayList<Post>();
	private StatDate filtroData;
	private Stat[] filtro_stat=new Stat[2];
	
	
	
	
	
}
