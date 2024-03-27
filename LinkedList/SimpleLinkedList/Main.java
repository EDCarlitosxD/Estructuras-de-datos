package LinkedList.SimpleLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        list.append(24);
        list.push(2);
        list.push(1);
        list.push(13);
        list.push(19);
        list.push(91);

        list.traverseLinkedList();
        System.out.println(list.existInList(1));
        System.out.println("The Length of your List is: "+ list.lengthOfList());

        list.insertAtPosition(999, 9);

       
        list.deleteAtBeginning();
        list.deleteAtBeginning();

        System.out.println("................");
        list.traverseLinkedList();

        list.deleteAtEnd();
        list.deleteAtEnd();

        System.out.println("................");
        list.traverseLinkedList();

        list.deleteAtPosition(1);
        
        System.out.println("................");
        list.traverseLinkedList();
    }

    
}
