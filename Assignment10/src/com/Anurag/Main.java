package com.Anurag;


class SList<E> {
    private Node<E> head = new Node<E>(null);
    SListIterator<E> iterator() { return new SListIterator<E>(head); }
    public String toString() {
        if(head.nextPointer == null) return "SList: No Elements added!";
        SListIterator<E> iterator = this.iterator();
        StringBuilder stringBuilder = new StringBuilder("SList: [");
        while(iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if(iterator.hasNext())
                stringBuilder.append(',');
            else
                stringBuilder.append("");
        }
        return stringBuilder + "]";
    }
}

class SListIterator<E> {
    Node<E> currentLink;
    SListIterator(Node<E> link) {
        currentLink = link;
    }
    public boolean hasNext() {
        return currentLink.nextPointer != null;
    }
    public Node<E> next() {
        currentLink = currentLink.nextPointer;
        return currentLink;
    }
    public void insert(E data) {
        currentLink.nextPointer = new Node<E>(data, currentLink.nextPointer);
        currentLink = currentLink.nextPointer;
    }
    public void remove(E data) {
        Node temp;
        while(currentLink.nextPointer!=null){
            temp=currentLink;
            currentLink=currentLink.nextPointer;
            if(currentLink.data==data){
                temp.nextPointer=currentLink.nextPointer;
                break;}
        }
    }
}

class Node<E> {
    E data;
    Node<E> nextPointer;
    Node(E data, Node<E> nextPointer) {
        this.data = data;
        this.nextPointer = nextPointer;
    }
    Node(E e) {
        this(e, null);
    }
    public String toString() {
        if(data == null) return "Null";
        return data.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        SList<Integer> list=new SList<>();
        SListIterator<Integer> sListIterator=list.iterator();
        System.out.println(list);
        sListIterator.insert(1);
        sListIterator.insert(2);
        sListIterator.insert(3);
        sListIterator.insert(4);
        sListIterator.insert(5);
        System.out.println(list);
        sListIterator=list.iterator();
        sListIterator.remove(2);
        System.out.println(list);
    }
}
