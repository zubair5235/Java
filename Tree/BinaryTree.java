import java.util.*;

public class BinaryTree{
    static Node root;
    class Node{
        int data;
        Node left, right;
        Node(String s){
            String values[] = s.split(" ");
            root = buildTree();
        }
    }
}