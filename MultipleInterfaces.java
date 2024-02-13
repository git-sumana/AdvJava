interface A {
    void show();
    void show1();
}

interface X {
    void run();
}

interface Y extends X {
    void run();
}



class B implements A,X,Y{
    
    public void show(){
        System.out.println("Show");
    }
    
    public void show1(){
        System.out.println("Show 1");
    }
    
    public void run(){
        System.out.println("Run Function");
    }
    
}
public class MultipleInterfaces {
    
    public static void main(String[] args) {
        A oj = new B();
        Y o = new B();
        oj.show();
        oj.show1();
        o.run();
    }
}