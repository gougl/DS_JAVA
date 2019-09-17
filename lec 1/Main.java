import javax.sound.midi.SysexMessage;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        CreditCard card = new CreditCard("Yinlimu","HSBC","1-2-3333",10000,10000);
//        System.out.println(card.getCustomer());
//
//        CreditCard card2 = new CreditCard("Sunny","AmericanExpress","6-66-6666",10000,10000);
//        System.out.println(card2.getCustomer());
//        System.out.println(card2.getBalance());
//        card2.makePayment(10001);
//        card2.makePayment(1000);
//        System.out.println(card2.getBalance());
//        Person a = new Person("Yinlaimu");
//        Person b = new Person("Raj",18);
//        Person c = new Person("Han",17,6.7);
//
//        System.out.println(a.getName());
//        System.out.println(b.getAge());
//        System.out.println(c.getHeight());
//
//        a.setAge(18);
//        b.setHeight(6.6);
//        System.out.println(b.getHeight());
//
//        if(a.getHeight() == 0.0)
//            a.setHeight(5.7);
//
//        a.eat();
//        a.drink();
//
//        // polymophism
//        Person d = new Man("Hu");
//        d.eat();
//
//        Person e = new Person("Abier", 20, 4.5);
//        e.play();
//        System.out.println(e.married());

        MyArray<String> myarray = new MyArray<String>();
        myarray.insert(0, "Roj");
        myarray.insert(1, "AI");
        myarray.insert(2, "An");

        myarray.display();
        System.out.println("Mr. Han will insert on Position 1");
        myarray.insert(1,"Han");
        myarray.display();
        System.out.println("delete Position 2");
        System.out.println(myarray.delete(2));
        //myarray.display();
    }
}
