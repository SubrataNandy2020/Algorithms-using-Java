import java.util.*;
class BS{
	int search(int l,int h,int key,int a[]){
		if(l==h){
			if(a[l]==key)
				return (l);
			else
				return -1;
		}
		else{
			int mid=(l+h)/2;
			if(a[mid]==key){
			return mid;}
			if(key<a[mid]){
			return search(l,mid-1,key,a);}
			else{
			return search(mid+1,h,key,a);}
		}
	}
public static void main(String[] ags){
	BS b=new BS();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int n=sc.nextInt();
	System.out.println("Enter the Array Elements:");
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the key:");
	int key=sc.nextInt();
	int x=b.search(0,n-1,key,a);
	if(x!=-1)
		System.out.println("Number:"+key+" is found in the position:"+(x+1));
	else
		System.out.println("Not Found");
	
}
}