package StackQueue;

public class DynamicStack extends CustomrStack {

	

	public DynamicStack(int size) {

		super(size);
	}
	public DynamicStack() {
		
		super();
	}

	
	@Override
	public boolean push(int item) {
		if (isFull()) {
		int[] temp=new int[data.length*2];
		for(int i=0;i<data.length;i++) {
			
			temp[i]=data[i];
		}
		data=temp;
		}
		return super.push(item);
	}
	
	public static void main(String[] args) throws ExceptionClassCustomeStack   {

		DynamicStack c = new DynamicStack(2);
		c.push(89);
		c.push(2);
		c.push(1);
		c.push(9);
		c.push(8);
		c.push(60);
		
		c.push(600);
		System.out.println(c.pop());
		
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		//System.out.print(c);
	}
}
