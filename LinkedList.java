import java.util.*;
class LinkedList
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
		temp=head;
		while(temp!=null)
	{
		if(temp.data==n2)
	{
		newNode.next=temp.next;
		temp.next=newNode;
		break;
	}
	else{
		temp=temp.next;
	}
}
}
}
void deleteLast()
{
	if(head==null)
	{
		System.out.println("no nodes");
	}
	else if(head.next==null){
		head=null;
	}
	else
	{
		for(temp=head;temp.next.next!=null;temp=temp.next);
		temp.next=null;

	}
}

void deleteFirst()
{
	if(head==null)
	{
		System.out.println("no nodes");
	}
	else if(head.next==null){
		head=null;
	}
	else
	{
	   head=head.next;

	}
}
void deleteAfter(int n)
{
	
	if(head==null)
	{
		System.out.println("no nodes");
	}
	else if(head.data==n){
		head=head.next;
	}
	else
	{
		node prev;
		
		
	for( prev=head;prev.next.next!=null;prev=prev.next)
	    {
		if(prev.next.data==n)
	{
		prev.next=prev.next.next;
		
	}
	
        }
		

	}
	
}
void count()
{
	int c=0;
	if(head==null)
	{
		System.out.print("no nodes");
	}
	
	else{
		for(temp=head;temp!=null;temp=temp.next)
	{
		c+=1;
	}
	}
	System.out.println("count: "+c);
}
void getMax()
{
	int max=head.data;
	for(temp=head.next;temp!=null;temp=temp.next)
	{
		if(max<temp.data)
		{
			max=temp.data;
		}
	}
		System.out.println("max"+max);
}



void search(int n)
{ int c=1;
	if(head==null)
	{
		System.out.print("no nodes");
	}
	else if(head.data==n)
	{
		System.out.println("present at node no.: 1");
	}
	else
	{
		boolean f=false;
		for(temp=head;temp!=null;temp=temp.next)
		{
			if(temp.data==n)
			{
				
				f=true;
				break;
			}
			
			c++;
		}
		if(f==true)
		{
			System.out.println("element fount"+c);
		}
		else
		{
			System.out.println("element not fount");
			
		}
	
		
	}
	
	
}
void sort()
{
	
	node temp1;
	for(temp=head;temp!=null;temp=temp.next)
	{
		for(temp1=temp.next;temp1!=null;temp1=temp1.next)
		{
			if(temp.data>temp1.data)
			{
				int t;
				t=temp.data;
				temp.data=temp1.data;
				temp1.data=t;
			}
		}
	}
	
}


public static void main(String args[])
{
	LinkedList l=new LinkedList();
	l.insertLast(22);
	l.insertFirst(33);
	l.insertAfter(22,10);
	l.insertLast(44);
	l.insertLast(55);
	l.insertLast(66);
	l.insertLast(77);
	l.print();
	l.deleteLast();
	l.print();
	l.deleteFirst();
	l.print();
	l.deleteAfter(44);
	l.print();
	l.count();
	l.getMax();
	l.search(66);
	l.insertLast(1);
	l.print();
	l.sort();
	l.print();


}
}






class node
{
int data;
node next=null;
node(int data)
{
this.data=data;
}
}
