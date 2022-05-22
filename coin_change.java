import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int []arr={1,2,5};
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=sum+1){
                sum+=arr[i];
            }else{
                
                break;
            }
        }
        System.out.print(sum+1);
        
    }
}
