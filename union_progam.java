import java.util.*;
class Main{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of 1st array: ");
       int n=sc.nextInt();
        System.out.println("Enter the size of 2nd array: ");
       int m=sc.nextInt();
       LinkedHashSet <Integer> pavi = new LinkedHashSet<Integer>();
       for(int i=0;i<n;i++)
       {
           pavi.add(sc.nextInt());
       }
       for(int i=0;i<m;i++)
       {
         pavi.add(sc.nextInt());   
       }
       System.out.println(pavi);
    }
}