import java.lang.Iterable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<Item> implements Iterable<Item>{
	private Node first;
	private int N;

	private class Node{
		Node next;
		Item item;
	}

	public boolean isEmpty(){ return first == null; }
	public int size(){ return N; }

	public void addItem(Item item){
		Node node = new Node();
		node.item = item;

		Node oldFirst = this.first;
		this.first = node;
		node.next = oldFirst;
		this.N++;
	}

	public Item removeItem(){
		if(this.first == null) { return null; }
		if(this.first.next == null){ 
			Item item = this.first.item;
			this.first = null;
			this.N = 0;
			return item;
		}
		else{
			Node newFirst = this.first.next;
			Item item = this.first.item;
			this.first = newFirst;
			this.N--;
			return item;
		}
	}

	public Iterator<Item> iterator(){
		return new LinkedListInterator();
	}

	private class LinkedListInterator implements Iterator<Item>{
		private Node head = first;
		public boolean hasNext() {return head != null; } 
		public Item next() { 
			Item item = head.item;
			head = head.next;
			return item;
		}
	}

	public static void main(String[] args){
		LinkedList<String> ls = new LinkedList<String>();
		String str1 = "abc";
		String str2 = "d";
		String str3 = "e";
		String str4 = "f";
		ls.addItem(str1);
		ls.addItem(str1);
		ls.addItem(str2);
		ls.addItem(str3);
		ls.addItem(str4);
		ls.addItem(str4);
		ls.addItem(str4);
		for(String it : ls){
			System.out.println(it);
		}
	}


}