import java.util.*;
class animal{
	void eat(){
		System.out.println("eating");
	}
	void sleep(){
System.out.println("sleeping");		
	}
}
class bird extends animal{
	void fly(){
		System.out.println("flying");
	}
}
	public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird b=new bird();
		b.fly();
		b.sleep();
		b.eat();
     
	}

}
