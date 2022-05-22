import java.util.*;


public class Main
{

        public static void main(String args[])
        {
                int arr[][]=new int[2][2];
//                arr[1][2]=5;
//                arr[1][1]=5;
//                arr[0][3]=5;
//                arr[1][4]=5;
//                arr[2][4]=5;
//                arr[2][0]=5;
                  arr[0][1]=5;
                  arr[0][0]=1;



                int i=0;
                int j=1;
                boolean flag=false;
                boolean flag2=false;
                int count=0;
                int dire=1;
                while(!flag){
                        while(!flag2) {
                                if (dire == 1) {
                                        if (j == 1) {
                                                dire = 2;
                                                break;
                                        } else if (arr[i][j + 1] == 5) {
                                                dire = 2;
                                                break;
                                        }
                                }

                                else if (dire == 2) {
                                        if (i == 1) {
                                                dire = 3;
                                                break;
                                        } else if (arr[i + 1][j] == 5) {
                                                dire = 3;
                                                break;
                                        }
                                }


                                else if (dire == 3) {
                                        if (j == 0) {
                                                dire = 4;
                                                break;
                                        } else if (arr[i][j - 1] == 5) {
                                                dire = 4;
                                                break;
                                        }
                                }


                                else if (dire == 4) {
                                        if (i == 0) {
                                                dire = 1;
                                                break;
                                        } else if (arr[i - 1][j] == 5) {
                                                dire = 1;
                                                break;
                                        }
                                }
                        }

                                if (arr[i][j] == dire) {
                                        count++;
                                        break;
                                }

                                else if (arr[i][j] == 0) {
                                        arr[i][j] = dire;
                                        count++;
                                }

                                else {
                                        count++;
                                }



                                if(dire==1){
                                        j++;
                                }

                                else if(dire==2){
                                        i++;
                                }

                                else if(dire==3){
                                        j--;
                                }

                                else {
                                        i--;
                                }


                }
                System.out.println(count);

        }

}
