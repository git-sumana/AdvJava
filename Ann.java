@Deprecated
class A{
    public void show(){
        System.out.println("Class A");
        
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("Class B");
    }
}
public class Ann {
    
    public static void main(String[] args){
        
        B o=new B();
        o.show();
        
        
    }
}