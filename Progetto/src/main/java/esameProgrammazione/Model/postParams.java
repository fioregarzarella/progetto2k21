package esameProgrammazione.Model;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

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
		int i=0;
		for (String string : x) {
			if( x[i].contains(valore))
					return true;
			i++;
		}
		return false;
	}
	

}
