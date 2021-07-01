package com.stack;

public class Stack {
	Node top;
	int size;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	public void push(int data) {		//push method
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;

		size++;


	}

	public void print() {		//print method
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.data +  "-> ");
			temp = temp.next;
		}
		
	}

	public boolean peek(int data) {
		 
        if (top != null) {
           System.out.println(top.data); 
        }
        else {
            System.out.println("Stack is under flow");
            
        }
		return false;
		
	}


		
	}

