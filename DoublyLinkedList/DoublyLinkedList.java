public class DoublyLinkedList {
  private int N = 0;
  private Node first;
  private Node last;
  public DoublyLinkedList() {
    this.first = null;
    this.last = null;
  }
  public boolean isEmpty() {
    return (this.N == 0);
  }
  public int size() {
    return this.N;
  }
  public void showSize() {
    System.out.print("List of values: " + this.size() );
  }
  public void insertFirst(int value) {
    Node newNode = new Node(value);
    if (this.isEmpty()) {
      this.last = newNode;
    } else {
      this.first.previous = newNode;
    }
    newNode.next = first;
    this.first = newNode;
    this.N++;
  }
  public void insertLast(int value) {
    Node newNode = new Node(value);
    if (this.isEmpty()) {
      this.first = newNode;
    } else {
      this.last.next = newNode;
      newNode.previous = this.last;
    }
    this.last = newNode;
    this.N++;
  }
  public Node deleteFirst() {
    Node temp = this.first;
    if (this.first.next == null) {
      this.last = null;
    } else {
      this.first.next.previous = null;
    }
    this.first = first.next;
    this.N--;
    return temp;
  }
  public Node deleteLast() {
    Node temp = this.last;
    if (this.first.next == null) {
      this.first = null;
    } else {
      this.last.previous.next = null;
    }
    this.last =this.last.previous;
    this.N--;
    return temp;
  }
  public boolean insertAfter(int key, int value) {
    Node current = this.first;
    while (current.getData() != key) {
      current = current.next;
      if (current == null) {
        return false;
      }
    }
    Node newNode = new Node(value);
    if (current == this.last) {
      newNode.next = null;
      this.last = newNode;
    } else {
      newNode.next = current.next;
      current.next.previous = newNode;
    }
    newNode.previous = current;
    current.next = newNode;
    this.N++;
    return true;
  }
  public Node deleteKey(int key) {
    Node current = first;
    while (current.getData() != key) {
      current = current.next;
      if (current == null) {
        return null;
      }
    }
    if (current == this.first) {
      this.first = current.next;
    } else {
      current.previous.next = current.next;
    }
    if (current == this.last) {
      this.last = current.previous;
    } else {
      current.next.previous = current.previous;
    }
    this.N--;
    return current;
  }
  public void displayBackward() {
    System.out.print("List Data (last --> first): ");
    Node current = this.last;
    while (current != null) {
      current.showData();
      current = current.previous;
    }
    System.out.println(" ");
  }
  public void displayForward() {
    System.out.print("List Data (first --> last): ");
    Node current = this.first;
    while (current != null) {
      current.showData();
      current = current.next;
    }
    System.out.println(" ");
  }
}