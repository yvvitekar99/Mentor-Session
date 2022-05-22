public class MinAmtOfChange {
    public static void main(String[] args) {
        int coins[] = {1,1,2,3,5,7,22};
        int coin_sum = 0;
        for(int i = 0; i < coins.length - 1; i++){
            if(coins[i] <= coin_sum + 1){
                coin_sum += coins[i];
            }
            else{
                break;
            }
        }
        System.out.print(coin_sum + 1);
    }
}
