package esameProgrammazione.Model;

import java.lang.*;

public class postParams {
	private String[] postParam;
	
	

	public postParams() {
		super();
	}

	/*public void stampaPostParam() {
		String [] y ;
		y=getPostParam();
		if(y==null) {
			System.out.println("vuoto");
		}
		    else {
			for(int i=0;i<y.length;i++)
			   System.out.println(y[i]);	
		    }	
	 }*/
	
	
	public String[] getPostParam() {
		return postParam;
	}

	public void setPostParam(String[] postParam) {
		this.postParam = postParam;
	}
	
	
	public boolean ricercaParametro(String valore, postParams parametro) {
		
		if(parametro.getPostParam()==null) {
			return false;
		}
	   String[] x = parametro.getPostParam();
		int i;
		for (i=0;i<x.length;i++) {
			if( x[i].equals(null))
					return false;
		}
		
		
		for (i=0;i<x.length;i++) {
			if( x[i].contains(valore))
					return true;
		}
		return false;
	}
	
	
}
