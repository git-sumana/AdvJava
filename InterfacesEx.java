interface A {
    int num=44;
    String name="Sharma";
    void show();
    void show1();
}

class B implements A{
    
    public void show(){
        System.out.println("Show");
    }
    
    public void show1(){
        System.out.println("Show 1");
    }
    
}
public class InterfacesEx {
    
    public static void main(String[] args) {
        A oj = new B();
        oj.show();
        oj.show1();
        System.out.println(A.name);
    }
}