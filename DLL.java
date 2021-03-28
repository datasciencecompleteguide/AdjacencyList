package com.company;

public class DLL{
    Node head;

    public Node addVertex(int u){
        Node newNode = new Node(u);
        if (head == null) {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.prev!=null){
                temp = temp.prev;
            }
            temp.prev = newNode;
        }
        return newNode;
    }

    public Node check(int u){
        Node temp = head;
        int flag = 0;
        while(temp != null){
            if(temp.data == u){
                flag = 1;
                break;
            }
            temp = temp.prev;
        }
        if (flag!=0)
            return temp;
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            Node yet = temp;
            System.out.print(temp.data+" ->");
            while(yet.next != null){
                System.out.print(yet.data+" ->");
                yet = yet.next;
            }
            System.out.println();
            temp = temp.prev;
        }
    }
}