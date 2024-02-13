enum Status{
    Running, Failed, Success;
}
public class EnumEx {
    
    public static void main(String[] args){
        
        Status r= Status.Running;
        Status s= Status.Success;
        System.out.println(r);
        System.out.println(s.ordinal());
        Status[] sArr= Status.values();
        for(Status i: sArr){
            System.out.println(i);
        }
        
        System.out.println(sArr);
        //address
    }
}