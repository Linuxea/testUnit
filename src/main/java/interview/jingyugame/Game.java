package interview.jingyugame;

/**
 * @author linuxea
 * @date 2018/6/5
 */
public class Game {
	
	private String name;
	private String detail;
	
	protected Game(String name, String detail) {
		this.name = name;
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "Game{" +
				"name='" + name + '\'' +
				", detail='" + detail + '\'' +
				'}';
	}
	
	protected void explain() {
		System.out.println("Game{" +
				"name='" + name + '\'' +
				", detail='" + detail + '\'' +
				'}');
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
