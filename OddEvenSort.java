import java.util.*;
class OddEvenSort{
	public static void sort(int arr[]){
		boolean x=false;
		int temp=0;
		while(!x){
			x=true;
			for(int i=0;i<arr.length-2;i+=2){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					x=false;
				}
			}
			for(int i=1;i<arr.length-2;i+=2){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					x=false;
				}
			}
		}
		
	}
	void print(int arr[]){
		System.out.println("Sorted:");
		for(int i:arr){
			System.out.println(i+" ");
		}
	}
	public static void main(String[] ags){
		Scanner sc=new Scanner(System.in);
		OddEvenSort oes=new OddEvenSort();
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr);
		oes.print(arr);
	}
}