package esameProgrammazione.Model;

public class Metadata {
	private String text;
	private String data;
	private long id;
	
public Metadata(String text, String data, long id) {
		super();
		this.text = text;
		this.data = data;
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
