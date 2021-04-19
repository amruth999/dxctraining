class bank{
	int balance = 0;
	int getBalance() {
		return 0;
	}
}
class bankA extends bank{
	int balance = 100;
	int getBalance() {
		return balance;
	}
}
class bankB extends bank{
	int balance = 1000;
	int getBalance() {
		return balance;
	}
}
class bankC extends bank{
	int balance = 10000;
	int getBalance() {
		return balance;
	}
}
public class test1 {
	public static void main(String[] args) {
		bank obj = new bank();
		bankA obj1 = new bankA();
		bankB obj2 = new bankB();
		bankC obj3 = new bankC();
		System.out.println(obj.getBalance());
		System.out.println(obj1.getBalance());
		System.out.println(obj2.getBalance());
		System.out.println(obj3.getBalance());
	}
}
