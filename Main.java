package datastructure;


public class Main {

    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(10);
        list.insertLast(11);
        list.insert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete( 3));
        list.display();
    }
}
