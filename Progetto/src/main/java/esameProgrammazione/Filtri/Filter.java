package esameProgrammazione.Filtri;

import java.util.ArrayList;

import com.sun.el.parser.ParseException;

import esameProgrammazione.Model.Data;
import esameProgrammazione.Model.Post;

/** 
 *
 *
 * 
 * @author Christian Parente
 * @author Fiore Garzarella
 */

public interface Filter {
	
	
	
	public boolean filter(ArrayList<String> value,Post post);
	
	
	public boolean filterDate(Data data) throws ParseException, java.text.ParseException;


	boolean filter(Post post);

}
