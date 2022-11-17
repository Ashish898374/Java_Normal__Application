package Moduleses;

public class emplo {
	private  int id1;
	private String name;
	private int age;
	private int depart;
	
	public emplo() {
		// TODO Auto-generated constructor stub
	}
	public emplo(int id1, String name, int age, int depart) {
		super();
		this.id1 = id1;
		this.name = name;
		this.age = age;
		this.depart = depart;
	}
	
	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "modules [id1=" + id1 + ", name=" + name + ", age=" + age + ", depart=" + depart + "]";
	}

	

}
