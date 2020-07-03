package esameProgrammazione.Model;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Post {
	private String id;
	private Boolean is_hidden;
	private Privacy privacy;
	private String created_time;
	private String media_type;
	
	public Post(String id, Boolean is_hidden, Privacy privacy, String created_time) {
		super();
		this.id = id;
		this.is_hidden = is_hidden;
		this.privacy = privacy;
		this.created_time = created_time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(Boolean is_hidden) {
		this.is_hidden = is_hidden;
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

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}
	

}
