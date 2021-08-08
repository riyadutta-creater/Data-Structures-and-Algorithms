package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
	
  public static int KthLargestElementUsingMaxheap(int[] arr,int k) {
	PriorityQueue<Integer>Maxheap = new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<arr.length;i++){
		Maxheap.add(arr[i]);
	}
	for(int i=0;i<k-1;i++){
		Maxheap.poll();
	}
	return Maxheap.peek();
 }
  
  public static int KthLargestElementUsingMinheap(int[] arr,int k) {
	
	  PriorityQueue<Integer> Minheap = new PriorityQueue<>();
	  for(int i=0;i<k;i++){
		  Minheap.add(arr[i]);
	  }
	  for(int i=k;i<arr.length;i++) {
		  if(arr[i]>Minheap.peek()){
			  Minheap.poll();
			  Minheap.add(arr[i]);
	      }
	  }
	  
	  return Minheap.peek();
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,7,45,12,90,32,2};
		int k = 3;
		System.out.println("Kth largest element using MaxHeap:"+KthLargestElementUsingMaxheap(arr, k));
		System.out.println("Kth largest element using MinHeap:"+KthLargestElementUsingMinheap(arr, k));
	}
}



	