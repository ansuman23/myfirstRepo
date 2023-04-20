import java.util.*;
public class Anticlockwise_90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[30][30];
        int trps[][]=new int[50][50];
        int row,col,size,t;
        System.out.print("enter size: ");
        size=sc.nextInt();
        System.out.println("enter elements: ");
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                arr[row][col]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("original array is: ");
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                trps[row][col]=arr[col][row];
            }
        }
        System.out.println("Transpose of array is: ");
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                System.out.print(trps[row][col]+" ");
            }
            System.out.println();
        }
        for(row=0;row<size/2;row++){
            for(col=0;col<size;col++){
                t=trps[row][col];
                trps[row][col]=trps[size-row-1][col];
                trps[size-row-1][col]=t;
            }
        }
        System.out.println("After 90 deg rotation the matrix is: ");
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                System.out.print(trps[row][col]+" ");
            }
            System.out.println();
        }
    }
}
