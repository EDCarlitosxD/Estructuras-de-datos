package LinkedList.SimpleLinkedList;

import java.util.List;

/**
 * SimpleLinkedList
 */
public class SimpleLinkedList{

    private Node head; 

    /**
     * Node
     */
    private class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
            
        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    public void append(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = null;

        Node lastNode = head;
        while(lastNode.next != null)
            lastNode = lastNode.next;

        lastNode.next = newNode;
        return;
    }

    public void traverseLinkedList(){
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }

    public boolean existInList(int target){

        Node current = head;
        while(current != null){
            
            if(current.data == target)return true;
            current = current.next;
        }

        return false;
    }
    public int lengthOfList(){
        int length = 0;
        Node current = head;
        while (current != null) {
            length ++;
            current = current.next;
        }

        return length;
    }

    public void insertAtPosition(int value, int position) {
        Node newNode = new Node(value);
        
        if(position == 0 || head == null){
            newNode.next = null;
            head = newNode;
            return;
        }

        Node current = head;

        for(int i= 1; i < position && current.next != null ;i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        System.out.println(current.data);
    }


    public void deleteAtBeginning(){

        if(head == null){
            System.out.println("Lista vacia");
            return;
        }

        head = head.next;

    }

    public void deleteAtEnd(){
        
        if(head == null){
            System.out.println("Lista vacia");
            return;
        }

        Node current = head;

        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        
    }

    public void deleteAtPosition(int position){

        if(head == null){
            System.out.println("Lista vacia");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
    
        Node current = head;

        for(int i= 1; i < position && current.next != null ;i++){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("No se puede borrar");
            return;
        }else{
            current.next = current.next.next;
        }



    }
}