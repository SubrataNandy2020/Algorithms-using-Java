import java.util.*;
import java.math.*;
class TimSort{
	public static int run=32;
	public static void timsort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i+=run){
			insertion(arr,i,Math.min((i+31),(n-1)));
		}
		int size=run;
		int mid=0,right=0;
		while(size<n){
			for(int left=0;left<n;left+=2*size){
				mid=(left+size-1);
				right=Math.min((left+2*size-1),(n-1));
				merge(arr,left,mid,right);
			}
			size=2*size;
		}
	}
	public static void insertion(int arr[],int left,int right){
		//
		System.out.println("Insertion sort started");
		for(int i=left+1;i<=right;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=left && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public static void merge(int arr[],int left,int mid,int right){
		//
		System.out.println("Merge Sort Started");
		int sizeLeft=mid-left+1;
		int sizeRight=right-mid;
		
		int L[]=new int[sizeLeft];
		int R[]=new int[sizeRight];
		
		for(int i=0;i<sizeLeft;i++){
			L[i]=arr[left+i];
		}
		
		for(int i=0;i<sizeRight;i++){
			R[i]=arr[mid+1+i];
		}
		
		int k=left;
		int i=0,j=0;
		while(i<sizeLeft && j<sizeRight){
			if(L[i]<=R[j]){
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<sizeLeft){
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<sizeRight){
			arr[k]=R[j];
			j++;
			k++;
		}
		
		
	}
	public void print(int arr[]){
		System.out.println("Sorted:");
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	public static void main(String[] ags){
		Scanner sc=new Scanner(System.in);
		TimSort ts=new TimSort();
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		timsort(arr);
		ts.print(arr);
	}
}