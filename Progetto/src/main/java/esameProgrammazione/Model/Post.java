package esameProgrammazione.Model;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Post {
	private String id; //id post
	private Privacy privacy; //oggetto per descrivere la visibilità del post
	private String created_time; //data creazione post
	private String message;
	private String media_type;
	
	public Post() {
		super();
	}

	 //tipo di media nel post
	
	public Post(String id,Privacy privacy, String created_time, String message) {
		super();
		this.id = id;
		this.privacy = privacy;
		this.created_time = created_time;
		this.media_type = media_type; 
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public Privacy getPrivacy() {
		return privacy;
	}

	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
	}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String tipoMedia) {
		this.media_type = tipoMedia;
	}
	

}
