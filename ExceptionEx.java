class CustomEx extends Exception{
    public CustomEx(String str){
        super(str);
    }
}
public class ExceptionEx {
    public static void main(String[] args){
        System.out.println("Exception Handling!");

        int i=11;
        int j=0;

        try{

            Class.forName("Main");}
        catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try{
            i=0;
            if (j==0)
                throw new CustomEx("Zeroes are not allowed!");
            j=44/i;
        }

        catch(CustomEx ce){
            System.out.println("Something went wrong!");
        }

        System.out.println(j);

        System.out.println("\n\nThe end!");

    }
}