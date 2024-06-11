public class OOp {
    // using in class
    int vlxx; ;
    static void myStaticMethod () {
        System.out.println("Hello word");
    }

    //using in obj
    public void publicStaticMethod (){
        System.out.println("Public method");
    }
    public void speed (int maxSpeed){
        System.out.println("max speed is " + maxSpeed);
    }
    // that is Constructor
    public  OOp (int y){
        vlxx = y;
    }

    public  static void main(String[] args){
        myStaticMethod();
        OOp myOOp = new OOp(2222222);
        myOOp.publicStaticMethod();
        myOOp.speed(13);
        // Call the main method of the Second class
        Second.main(new String[]{});
        System.out.println(myOOp.vlxx);
    }
}
class Second {
    public static  void main(String[] args){
        OOp myCar = new OOp(1232);
        myCar.speed(123);
    }
}
