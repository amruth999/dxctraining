
class area {
	double length, width;
	
	void set(double l, double w)
	{
		this.length = l;
		this.width = w;
	}
	
	double getArea()
	{
		return length * width;
	}
}

class Box extends area{
	double length, width, height;
	Box(){
		length = 1.0;
		width = 1.0;
		height = 1.0;
	}
	void setDox(double l, double w, double h)
	{
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
	double volume()
	{
		return (length * width * height);
	}
}

public class Rectangle{
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setDox(10.0, 20.0, 1.0);
		System.out.println(b1.volume());
		b1.set(10.0, 20.0);
		System.out.println(b1.getArea());
	}
}
