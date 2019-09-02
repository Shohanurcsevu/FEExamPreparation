/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feexampreparation;

import javafx.scene.Node;

/**
 *
 * @author Shohanur Rahman
 */
public class LinkedList {
     Node head;

    private void printList() {
        Node n = head;
        while (n!=null) {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
     
     static class Node
             {
          int data;
          Node next;
          Node (int d)
          {
              data=d;
              next=null;
          }
         
     }
    
    public static void main(String[] args)
    {
         LinkedList linkedList=new LinkedList();
         
         linkedList.head=new Node(1);
          Node second=new Node(2);
          Node third=new Node(3);
          
          
          linkedList.head.next=third;
          third.next=second;
          linkedList.printList();
          
        
    }
    
}
