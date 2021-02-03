import java.util.*;
class Inversion{
int merge(int arr[], int temp[], int left, int mid, int right) {
   int i, j, k;
   int count = 0; 
   i = left;    
   j = mid;     
   k = left;    

   while ((i <= mid - 1) && (j <= right)) {
      if (arr[i] <= arr[j]) {    
         temp[k++] = arr[i++];
      }else{
         temp[k++] = arr[j++];
         count += (mid - i);  		 
      }
   }

    while (i <= mid - 1)    
       temp[k++] = arr[i++];

    while (j <= right)    
       temp[k++] = arr[j++];
   
    for (i=left; i <= right; i++){
	arr[i] = temp[i];    
	//System.out.println("Copying from temp to arr:"+arr[i]);
	}
    return count;
}

int mergeSort(int arr[], int temp[], int left, int right) {
   int mid, count = 0;

   if (right > left) {
      mid = (right + left)/2;   
      count += mergeSort(arr, temp, left, mid);    
      count += mergeSort(arr, temp, mid+1, right);    
      count += merge(arr, temp, left, mid+1, right);    
   }
   return count;
}

public static void main(String[] ags){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size:");
int n=sc.nextInt();
System.out.println("Enter the elements:");
int a[]=new int[n];
for(int i=n-1;i>=0;i--){
a[i]=sc.nextInt();
}
Inversion ii=new Inversion();
int temp[]=new int[n];
System.out.println("Total number of Inversion:"+ii.mergeSort(a, temp, 0, n - 1));

}
}