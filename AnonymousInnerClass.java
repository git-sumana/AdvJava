class A {
    public void show() {
        System.out.println("Inside A's show method");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A objA = new A(){
            public void show(){
                System.out.println("Updated using Anonymous Inner Class");
            }
        };

        objA.show();
    }
}