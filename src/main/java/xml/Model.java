package xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Model {
	
	@XStreamAsAttribute
	@XStreamAlias("id")
	private Integer id;
	@XStreamAsAttribute
	@XStreamAlias("name")
	private String name;
	@XStreamAsAttribute
	@XStreamAlias("cp")
	private Model cp;
	
	public Model(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Model(Integer id, String name, Model cp) {
		this.id = id;
		this.name = name;
		this.cp = cp;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Model getCp() {
		return cp;
	}
	
	public void setCp(Model cp) {
		this.cp = cp;
	}
}
