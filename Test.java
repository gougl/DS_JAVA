import java.util.ArrayList;
import java.util.Stack;

public class Test {
    public static void main(String[] args){
        System.out.println("This is test class");
        /*
        Generic<Integer> a = new Generic<Integer>();
        a.setVar(5);
        a.print();
        */
//        LinkedList<Integer> a = new LinkedList<Integer>();
//        a.addLast(4);
//        a.addLast(5);
//        a.addLast(6);
//        a.addFirst(1);
//        a.addFirst(2);
//        a.addFirst(3);
//
//        a.display();

        LinkedListIterable<Integer> b = new LinkedListIterable<>();
        b.addFirst(1);
        b.addFirst(2);
        b.addFirst(3);
        b.display();
        b.display_iterator();
        b.display_foreach();

        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        ArrayList<Integer> al = new ArrayList<>();
        al.add(8);
        al.add(9);
        System.out.println(al.get(0));
        System.out.println(al.get(1));


    }
}
