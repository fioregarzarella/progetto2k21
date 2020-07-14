package esameProgrammazione.Model;

import java.lang.*;

public class postParams {
	private String[] postParam;
	
	

	public postParams() {
		super();
	}

	public String[] getPostParam() {
		return postParam;
	}

	public void setPostParam(String[] postParam) {
		this.postParam = postParam;
	}
	
	
	public boolean ricercaParametro(String valore, postParams parametro) {
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
	
	/*public String formatParams(postParams parametro) {
		
		String[] y= parametro.getPostParam();
		String tmp=new String();
		for(int i=0;i< y.length-1;i++) {
			tmp = tmp + y[i]+ "," + y[i+1];
		}
		return tmp;
	}	
	 */
}
