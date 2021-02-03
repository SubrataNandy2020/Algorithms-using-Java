import java.util.*;
class List1{
	public static List<Integer> arr=new ArrayList<>();
	int isearch(int l,int h,int key){
		int start=l,end=h,pos;
		while(start<=end && key>=arr.get(start) && key<=arr.get(end)){
			pos=(int)(start+((float)(end-start)/(arr.get(end)-arr.get(start)))*(key-arr.get(start)));
			if(arr.get(pos)==key)
				return pos;
			if(key>arr.get(pos))
				start=pos+1;
			else
				end=pos-1;
		}
		return -1;
	}
public static void main(String[] ahs){
	Scanner sc=new Scanner(System.in);
	List1 l=new List1();
	int m=0;
	System.out.println("Enter the list size:");
	int n=sc.nextInt();
	System.out.println("Enter the elements in list:");
	for(int i=0;i<n;i++){
		int x=sc.nextInt();
		arr.add(x);
	}
	System.out.println("Enter the search element in list:");
	int z=sc.nextInt();
	System.out.println("List Elements are:"+Arrays.toString(arr.toArray()));
	m=l.isearch(0,n-1,z);
	if(m!=-1){
		System.out.println("Number:"+z+" is found in the position:"+(m+1));
	}
	else
		System.out.println("Not found");
}	
}