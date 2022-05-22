import java.util.*;
public class Main {

    public static boolean available(int[][]arr){
        for(int i=0;i< arr.length-2;i++){
            if(arr[i][1]>=arr[i+1][0]){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
	// write your code here



        int arr[][]={{1,4},{2,5},{7,9}};
       
        if(available(arr)){
            System.out.print("Possible");
        }else {
            System.out.print("not-Possible");
        }

    }
}
