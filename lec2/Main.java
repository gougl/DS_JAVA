import javax.sound.midi.SysexMessage;
import java.awt.*;
import java.util.Scanner;

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

//        MyArray<String> myarray = new MyArray<String>();
//        myarray.insert(0, "Roj");
//        myarray.insert(1, "AI");
//        myarray.insert(2, "An");
//
//        myarray.display();
//        System.out.println("Mr. Han will insert on Position 1");
//        myarray.insert(1,"Han");
//        myarray.display();
//        System.out.println("delete Position 2");
//        System.out.println(myarray.delete(2));
        //myarray.display();

//        MyArrayAgain<String> a = new MyArrayAgain<>();
//        a.insert(0,"Yinlimu");
//        a.insert(0,"Hu");
//        a.insert(0,"An");
//        a.insert(0,"Aimond");
//        a.traverse();
//
//        System.out.println("The delte is " + a.delete(2));
//        a.traverse();

//        MyLinkedList<String> a = new MyLinkedList<>();
//        a.addFirst("Ai");
//        a.addFirst("An");
//        a.addFirst("Ma");
//        a.display();
//        //node<String> del_node = a.delFirst();
//
//        System.out.println("delete the node is "+a.delFirst());
//        a.display();

/*        Stack<String> s = new MyLinkedStack<>();
        s.push("Abus");
        s.push("An");
        s.push("Chen");

        System.out.println(s.pop());
        System.out.println(s.getTop());
        System.out.println(s.getTop());

        Stack<Integer> binarycode = new MyLinkedStack<>();
        Scanner input = new Scanner(System.in);
        Integer x = input.nextInt();
        while(x!=0){
            binarycode.push(x%2);
            x = x/2;
        }
        while(binarycode.isEmpty()!=true){
            System.out.println(binarycode.pop());
        }

 */
        Queue<String> qu = new MyArrayQueue<>();
        qu.enqueue("An");
        qu.enqueue("Hu");
        qu.enqueue("Raj");
        qu.enqueue("Ai");
        while(qu.isEmpty()!=true){
            System.out.println(qu.outqueue());
        }

    }
}
