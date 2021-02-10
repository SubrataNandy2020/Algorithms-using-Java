import java.util.*;
class FiboSearch{
	public static int fiboSearch(int arr[],int n){
		int offset=-1;
		int fib0=0;
		int fib1=1;
		int fib=fib0+fib1;
		int len=arr.length;
		while(fib<len){
			fib0=fib1;
			fib1=fib;
			fib=fib0+fib1;
		}
		while(fib>1){
			int i=Math.min(offset+fib0,len-1);
			if(arr[i]<n){
				fib=fib1;
				fib1=fib0;
				fib0=fib-fib1;
				offset=i;
			}
			else if(arr[i]>n){
				fib=fib0;
				fib1=fib1-fib0;
				fib0=fib-fib1;
			}
			else{
				return i;
			}
		}
		if(fib1==1 && arr[offset+1]==n)
			return offset+1;
		
	return -1;
		
	}
public static void main(String[] ags){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size:");
int n=sc.nextInt();
System.out.println("Enter the elements:");
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
System.out.println("Enter the element to search:");
int search=sc.nextInt();
int i=fiboSearch(arr,search);
if(i==-1){
	System.out.println("Not Found");
}
else{
	System.out.println("Found:"+search+" at index:"+i);
}
}
}