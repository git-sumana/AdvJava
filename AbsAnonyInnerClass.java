abstract class A {
    public abstract void show();
}

public class AbsAnonyInnerClass {
    
    public static void main(String[] args) {
        
        A objA = new A(){
            
            public void show(){
                
                System.out.println("Updated using Anonymous Inner Class");
            }
        };

        objA.show();
    }
}