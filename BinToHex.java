import java.util.*;
import java.math.*;
class BinToHex{
public static void go(int n){
int temp=0;
int f=n;
List<Integer> a=new ArrayList<>();
String s="";

//Converting Base10 To Base2
if(n==0){
	s="0000";
}
else{
while(n!=0){
 temp=n%2;
 a.add(temp);
 n=n/2;
}}
for(int i=a.size()-1;i>=0;i--){
	s+=a.get(i);
}
System.out.println("Decimal is:"+f+" to Binary:"+s);

//Converting Base2 To Base16
if(s.length()%4==1){
	s="000"+s;
}
else if(s.length()%4==2){
	s="00"+s;
}
else if(s.length()%4==3){
	s="0"+s;
}
HashMap<String,String> hmap=new HashMap<>();
hmap.put("0000","0");
hmap.put("0001","1");
hmap.put("0010","2");
hmap.put("0011","3");
hmap.put("0100","4");
hmap.put("0101","5");
hmap.put("0110","6");
hmap.put("0111","7");
hmap.put("1000","8");
hmap.put("1001","9");
hmap.put("1010","A");
hmap.put("1011","B");
hmap.put("1100","C");
hmap.put("1101","D");
hmap.put("1110","E");
hmap.put("1111","F");

int t=0;
System.out.print("Binary:"+s +" To Hexadecimal:");
	String[] part=new String[4];
    for(int i=0;i<s.length();i=i+4){
		String bypart=s.substring(i,i+4);
		part[t]=bypart;
		//System.out.println("PART:"+part[t]);
			if(hmap.containsKey(part[t])){
			System.out.print(hmap.get(part[t]));
			}
		t++;
		}
}
public static void main(String[] ags){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
go(n);
}
}