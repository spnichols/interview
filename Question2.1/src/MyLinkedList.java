
public class MyLinkedList {
	
	private MyLinkedNode head = new MyLinkedNode(null,null);
	private MyLinkedNode tail = new MyLinkedNode(null, null);
	private int listSize = 0; 
	
	public MyLinkedList(){
			
	}
	
	public int getSize(){
		return this.listSize;
	}
	
	public void addLastNode(Object data){
		MyLinkedNode newNode = new MyLinkedNode(data,null);
		
		//if linked list is empty
		if(head.getNext() == null){
			head.setNext(newNode);
			tail = newNode;
			listSize++;
		}
		//at least one value in the linked list
		else{
			tail.setNext(newNode);
			tail = newNode;
			tail.setNext(null);
			listSize++;
		}
	}
	
	public void addFirstNode(Object data){
		MyLinkedNode newNode = new MyLinkedNode(data,null);
		
		if(head.getNext() == null){
			head.setNext(newNode);
			tail = newNode;
			listSize++;
		}
		else{
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			listSize++;
		}
		
	}
	
	public String toString(){
		String output = "null";
		MyLinkedNode current = head;
		while(current.getNext() != null){
			output += "->" + current.getNext().getData();
			current = current.getNext();
		}
		return output;
	}
	
	
}
