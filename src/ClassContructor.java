public class ClassContructor {
    int modelYear;
    String modelName;
    private ClassContructor (int year,String name) {
        this.modelName = name;
        this.modelYear = year;
    }

    public  static  void  main(String[] args){
        ClassContructor myClass = new ClassContructor(1996,"kHA BANH");
        System.out.println(myClass.modelName + " "+ myClass.modelYear);
    }
}
