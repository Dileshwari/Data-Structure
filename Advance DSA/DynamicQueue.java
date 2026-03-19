package StackQueue;

public class DynamicQueue extends CircularQueue {

	public static void main(String[] args) throws Exception {
		DynamicQueue q=new DynamicQueue(5);
		q.insert(34);
		q.insert(3);
		q.insert(4);
	
		q.display();
	}

	DynamicQueue(){
		
		super();
	}
	
	DynamicQueue(int size){
		
		super(size);
	}
	
	@Override
	public boolean insert(int item) throws Exception {
		if (isFull()) {
			int[] temp=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				
				temp[i]=data[(front+i)% data.length];
			}
			front=0;
			end=data.length;
			data=temp;
			}
			return super.insert(item);
		
		
	}

}
