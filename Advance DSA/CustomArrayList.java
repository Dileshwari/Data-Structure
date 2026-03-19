package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList {

	private int size = 0;
	private static int DEFAULTSIZE = 10;
	private static int[] data;

	public CustomArrayList() {

		this.data = new int[DEFAULTSIZE];
	}

	
	public CustomArrayList(int size) {

		this.data = new int[size];
	}

	public void add(int item) {

		if (isFull()) {

			resize();
		}

		data[size++] = item;
	}

	private void resize() {
          int[] temp=new int[data.length*2];
          
          for(int i=0;i<data.length;i++) {
        	  
        	  temp[i]=data[i];
        			  
          }
          data=temp;
	}

	private boolean isFull() {
		return data.length == size;
	}
	
	public int remove() {
		
		int remove=data[size--];
		return remove;
	}
	
	public int getIndex(int index) {
		
		return data[index];
	}
	public int size() {
		
		return size;
	}
	
	public void set(int index, int value) {
		
		data[index]=value;
	}

	public String toString() {
		return "CustomArrayList{ "+"data ="+Arrays.toString(data)+", size ="+size+"}";
		
	}
	public static void main(String[] args) {
		CustomArrayList l=new CustomArrayList(2);
         l.add(34);
         l.add(23);
         l.add(9);
         System.out.println(l);
         
	}

}
