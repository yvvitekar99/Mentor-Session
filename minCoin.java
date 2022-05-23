public class minCoin{
    public static void main(String[] args) {
        int coins[] = {1,1,2,3,5,7,22};
        int coinSum = 0;
        for(int i = 0; i < coins.length - 1; i++){
            if(coins[i] <= coinSum + 1){
                coinSum += coins[i];
            }
            else{
                break;
            }
        }
        System.out.print(coinSum + 1);
        System.out.println();
    }
}