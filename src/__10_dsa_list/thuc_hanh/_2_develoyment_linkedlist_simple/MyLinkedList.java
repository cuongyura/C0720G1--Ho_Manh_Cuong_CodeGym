package __10_dsa_list.thuc_hanh._2_develoyment_linkedlist_simple;

import org.w3c.dom.Node;

public class MyLinkedList {
    // properties:
     private Node head;
     private int numNodes;

     // method constructor:
    // khởi tạo node đầu tiên trong danh sách
    public MyLinkedList(Object data) {
         head = new Node(data);
    }

    public class Node {
        // properties Node:
         private Node next;
         private Object data;

         // method constructor:


        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    // method add:
    // thêm vào vị trí index:
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i <= index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    /*thêm vào vị trí đầu tiên trong danh sách:*/

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

     /*Lấy phần tử ở vị trí index từ danh sách: */
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++ ) {
            temp = temp.next;
        }
        return temp;
    }

    // hiển thị danh sách các phần tử trong danh sách:

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
