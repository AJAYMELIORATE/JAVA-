
import java.util.*;
class spiral_pattern {

	public static void main(String[] args) {
	Scanner ob=new Scanner (System.in);
    int  n1=ob.nextInt();
    int n2=ob.nextInt();
    int Arr[][]=new int[n1][n2];
    for(int i=0;i<n1;i++) {
    	for(int j=0;j<n2;j++) {
    		Arr[i][j]=ob.nextInt();
    	}
    }
    
            int start = 0;
            int end = n2 - 1;
            while (start <= end) {
                for (int m = start; m <= end; m++) {
                    System.out.print(Arr[start][m] + " ");
                }
                for (int m = start + 1; m <= end; m++) {
                    System.out.print(Arr[m][end] + " ");
                }
                if (start < end) {
                    for (int m = end-1; m >= start; m--) {
                        System.out.print(Arr[end][m] + " ");
                    }
                    for (int m = end - 1; m >=start+1; m--) {
                        System.out.print(Arr[m][start] + " ");
                    }
                }
                start++;
                end--;
            }
        }
    }