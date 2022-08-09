class DoubleList
{
	node head,newNode,temp;
	
	
	void insertLast(int n)
{
	newNode = new node(n);
	if(head==null)
	{
		head = newNode;
	}
	else{
		for(temp=head;temp.next!=null;temp=temp.next);
		temp.next=newNode;
		newNode.prev=temp;
		System.out.print(n +" "+"node added at last");
		System.out.println();
	 }
}

void print()
{
	for(temp=head;temp!=null;temp=temp.next)
	System.out.print(temp.data+"->");
	System.out.println();
}
void insertFirst(int n)
{
	newNode = new node(n);
	newNode.next=head;
	head.prev=newNode;
	head=newNode;
    System.out.println(n+"added at first ");
}

void insertAfter(int n1,int n2)
{
	newNode = new node(n1);
	if(head==null)
	{
		
		head=newNode;
		
	}
	else{
	
		for(temp=head;temp!=null;temp=temp.next)
	{
		if(temp.data==n2)
	{
		newNode.next=temp.next;
		temp.next.prev=newNode;
		temp.next=newNode;
	
	}
	
}
}
}

public static void main(String args[])
{
	DoubleList l=new DoubleList();
	l.insertLast(22);
	l.insertFirst(33);
	l.insertAfter(10,22);
	l.insertLast(44);
	l.insertLast(55);
	l.insertLast(66);
	l.insertLast(77);
	l.print();
	l.insertAfter(22,10);
	l.print();
	//l.deleteLast();
	//l.print();
	//l.deleteFirst();
	//l.print();
	//l.deleteAfter(44);
	//l.print();
	//l.count();
	//l.print();
	//l.sort();
	//l.print();


}
}




class node
{
int data;
node next=null;
node prev=null;
node(int data)
{
this.data=data;
}
}
