public class DoublyLinkedListApp {
  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();
    list.insertFirst(1);
    list.insertFirst(4);
    list.insertFirst(3);
    list.showSize();
    System.out.println();

    list.insertLast(7);
    list.insertLast(8);
    list.insertLast(5);
    list.showSize();
    System.out.println();

    list.displayBackward();
    list.displayForward();

    list.deleteFirst();
    list.deleteLast();
    list.deleteKey(1);
    list.displayForward();
    list.showSize();
    System.out.println();

    list.insertAfter(1, 4);
    list.insertAfter(1, 3);
    list.displayForward();
    list.showSize();
    System.out.println();
  }
}