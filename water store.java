import java.util.*;
public class Main {
      public static void main(String[] args) {
    	  Scanner obj=new Scanner(System.in);
    	  int flag=0,count=0, ans=0;
    	  int size=obj.nextInt();
    	  int arr[]=new int[size];
    	  for(int i=flag;i<size;i++) {
    		  arr[i]=obj.nextInt();
    	  }
    	  for(int i=flag+1;i<size-1;i++) {
    		  count++;
    	  }
    	  if(arr[flag]>arr[size-1])
    		  ans=arr[size-1]*count;
    	  else
    	   ans=arr[flag]*count;
    	  System.out.print("water stored can be:"+ans);
      }
}