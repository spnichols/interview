
public class MyLinkedNode {
	private Object data;
	private MyLinkedNode next;
	
	public MyLinkedNode(Object data, MyLinkedNode next){
		this.data = data;
		this.next = next;
	}
	public MyLinkedNode(Object data){
		this.data = data;
		this.next = null;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public MyLinkedNode getNext(){
		return next;
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public void setNext(MyLinkedNode next){
		this.next = next;
	}
	
}
