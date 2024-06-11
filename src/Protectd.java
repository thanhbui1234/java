class Person {
    protected String fname = "john";
    protected String lname = "Doe";
    protected String email = "John@doe.com";
    protected int age = 24;
}

class Student extends Person {
   final private int graduationYear = 2018;
    public  static void main(String[] args){
        Student myObj = new Student();
        System.out.println("name" + myObj.fname + " " + myObj.lname);
        System.out.println(("Email" + myObj.email));
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}


