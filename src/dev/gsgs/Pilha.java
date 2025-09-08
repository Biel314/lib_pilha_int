package dev.gsgs;

public class Pilha {

	Node top;
	
	public Pilha() {
		top = null;
	}

	public boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int e) {
		Node element = new Node();
		element.data = e;
		
		//if(isEmpty == true) {
		if(isEmpty()) {
			top = element;
		} else {
			element.next = top;
			top = element;
		}
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Não existem elementos para desempilhar!");
		}
		int value = top.data;
		top = top.next;
		return value;
	}
	
	public int top() throws Exception {
		//if(isEmpty == true) {
		if(isEmpty()) {
			throw new Exception("Não existem elementos para desempilhar!");
		}
		int value = top.data;
		return value;
	}
	
	public int size() {
		int i = 0;
		
		//if(isEmpty() == false) {
		if(!isEmpty()) {
			Node aux = top;
			i = 1;
			while(aux.next != null) {
				aux = aux.next;
				i++;
			}
		}
		
		return i;
	}
	
	public int max() throws Exception {
		if(isEmpty()) {
			throw new Exception("A pilha está vazia!");
		}
		
		int m = top.data;
	
		Node aux = top;
		while(aux.next != null) {
			aux = aux.next;
			m = Math.max(aux.data, m);
		}
		
		return m;
	}
	
}
