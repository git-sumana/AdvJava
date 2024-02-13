public class UsingAbsClass
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Car o=new BMW(); //since we used abstract class
		BMW a=new BMW();
		o.music();
		a.drive();
	}
}
abstract class Car{
    public abstract void drive();
    public void music(){
        System.out.println("Playing Music");
    }
}
class BMW extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}