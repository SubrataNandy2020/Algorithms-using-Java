import java.util.*;
class QS{
	void sort(int l,int h,int[] a){
		int j=0;
		if(l<h){
			j=part(l,h,a);
			sort(l,j-1,a);
			sort(j+1,h,a);
		}
	}
	int part(int l,int h,int[] a){
		int i=l-1;
		int j=h;
		int mid=(l+h)/2;
		int pivot=a[h];
		for(int jj=l;jj<h;jj++){
			if(a[jj]<=pivot){
				i++;
				int temp=a[i];
				a[i]=a[jj];
				a[jj]=temp;
			}
			}
		
		int temp1=a[i+1];
			a[i+1]=a[j];
			a[j]=temp1;
			
			
			return (i+1);
			
		}
		
		
	static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
	
public static void main(String[] ags){
Scanner sc=new Scanner(System.in);
QS q=new QS();
System.out.println("Enter the size:");
int n=sc.nextInt();
System.out.println("Enter the array elements:");
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}
System.out.println("Arranging in Ascending Order:");
q.sort(0,n-1,a);
print(a);
}
}