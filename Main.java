package com.company;

public class Main {

    public void addEdge(int u, int v){
        DLL obj = new DLL();
        Node tm = obj.check(u);
        System.out.println("I am tm: "+tm);
        if (tm != null){
            System.out.println("I am tm: "+tm);
            while(tm.next!=null){
                tm = tm.next;
            }
            tm.next = new Node(v);
        }
        else{
            obj.addVertex(u);
        }
    }

    public static void main(String[] args) {
	    DLL obj  = new DLL();
	    Main m = new Main();

	    obj.addVertex(0);
	    obj.addVertex(1);
	    obj.addVertex(2);
	    obj.addVertex(3);

	    //m.addEdge(0,1);
        m.addEdge(1,3);

        obj.display();
    }
}