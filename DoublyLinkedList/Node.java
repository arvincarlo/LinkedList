public class Node {
  private int data;
  public Node next;
  public Node previous;
  public Node(int data) {
  	this.data = data;
  }
  public int getData() {
  	return this.data;
  }
  public void showData() {
  	System.out.print(this.getData() + " ");
  }
}