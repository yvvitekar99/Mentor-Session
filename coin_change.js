function question1(input)
{
    let coin_sum = 0;
    
    for(let i = 0; i < coins.length - 1; i++ )
    {
        
            
            if (coin_sum+1 >= coins[i])
            {
                coin_sum += coins[i]
            } else {
                break
            }
    }
    
    console.log(coin_sum + 1)
}
 
let coins = [1, 1, 2, 3, 5, 7, 22]
question1([1, 1, 2, 3, 5, 7, 22])
