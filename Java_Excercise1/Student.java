
class stud{
	String name, address;
	int age;
	stud(){
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}
	void setInfo(String Sname, int Sage)
	{
		this.name = Sname;
		this.age = Sage;
	}
	void setInfo(String Sname, int Sage, String addr)
	{
		this.name = Sname;
		this.age = Sage;
		this.address = addr;
	}
	
	void show() {
		System.out.println(name + " " + age + " " + address);
	}
}

public class student {
	public static void main(String[] args)
	{
		//array of objects!
		stud students[] = new stud[10];
		students[0] = new stud();
		students[0].setInfo("Prasad", 21);
		students[1] = new stud();
		students[1].setInfo("Prasad", 21, "Bengaluru");
		students[0].show();
		students[1].show();
	}
}
