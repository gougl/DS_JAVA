import javax.sound.midi.SysexMessage;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



//        node<String> c = new node<>("C");
//        node<String> d = new node<>("D");
//        node<String> b = new node<>("B",null,c);
        BinaryTree<String> tree = new BinaryTree<>("A");
        node<String> b = tree.insert_lchild(tree.getRoot(),"B");
        node<String> c = tree.insert_rchild(b,"C");
        node<String> d = tree.insert_rchild(tree.getRoot(),"D");

        tree.preOrder(tree.getRoot());
        tree.inOrder(tree.getRoot());
        tree.postOrder(tree.getRoot());

        ArrayBinaryTree<String> ArrTree = new ArrayBinaryTree<>();
        String[] arr = new String[]{"A","B","D","","C"};
        ArrTree.create_binarytree(5,arr);
        ArrTree.preorder(1);






    }
}
