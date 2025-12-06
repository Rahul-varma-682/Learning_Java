class A{
    public void show(){
System.out.println(" In A show ");
    }
}


public class AnonymousInnercls {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println(" New show");
   
            }


        };
        obj.show();
    }
    
}
