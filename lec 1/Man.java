// inheritance
public class Man extends Person {
    // data fields
    private String gender;
    // constructor
    public Man(){
        gender = "Man";
    }
    // overlaod the constructor
    public Man(String name){
        super(name);
    }
    public Man(String name, int age){
        super(name, age);
    }
    public Man(String name, int age, double height){
        super(name, age, height);
    }

    // getter methods
    public String getGender(){
        return this.gender;
    }

    // override
    public void eat(){
        System.out.println("Man eats");
    }
}
