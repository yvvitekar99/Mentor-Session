
public class Main
{
    public static boolean roration(int arr[],int arr2[]){
        if(arr.length!= arr2.length){
            return false;
        }
        int pos=0;
        for(int i=0;i< arr.length;i++){
            if(arr2[i]==arr[0]){
                pos=i;
                break;
            }
        }
        int j=1;
        int i=pos+1;
        while (i< arr.length){
            if(arr[j]!=arr2[i]){
                return false;
            }
            pos=j;
            j++;
            i++;

        }

        j=pos+1;
        i=0;
        while (j<arr.length){
            if (arr2[i]!=arr[j]){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {


        int arr[]={11, 21, 33, 42, 59, 61, 79};
        int arr2[]={42, 59, 61, 79, 11, 21, 33};

        if(roration(arr,arr2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }





    }
}
