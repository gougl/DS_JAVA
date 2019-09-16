public class Person {
    // data fields
    private String name;
    private int age;
    private double height;
    //private CreditCard card;

    // methods
    // default constructor without arguments
    public Person(){};
    // overload the contructor
    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    // overlaod the constructor
    public Person(String name, int age){
        this(name, age,0.0);
    }
    // overlod the constructor
    public Person(String name){
        this(name, 0,0.0);
    }
    // get methods
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    // set methods
    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // other methods
    public void eat(){
        System.out.println("Person eats");
    }

    public void drink(){
        System.out.println("Person drink");
    }

}
