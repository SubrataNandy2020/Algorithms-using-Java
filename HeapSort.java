import java.util.*;
class HeapSort{
	public void sort(int arr[]){
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--){
			heapify(arr,n,i);
		}
		int temp;
		for(int i=n-1;i>=0;i--){
			temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	void heapify(int arr[],int n,int i){
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[left]>arr[largest]){
			largest=left;
		}
		if(right<n && arr[right]>arr[largest]){
			largest=right;
		}
		int temp=0;
		if(largest!=i){
			temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
		
		heapify(arr,n,largest);}
		
		}
		public void print(int arr[]){
			System.out.println("Sorted elements:");
			for(int i:arr){
				System.out.println(i);
			}
		}
		public static void main(String[] ags){
			Scanner sc=new Scanner(System.in);
			HeapSort h1=new HeapSort();
			System.out.println("Enter the Size:");
			int n=sc.nextInt();
			System.out.println("Enter the Elements:");
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			h1.sort(arr);
			h1.print(arr);
		}
	}