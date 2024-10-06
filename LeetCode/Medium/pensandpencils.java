class pensandpencils 
{
    public long waysToBuyPensPencils(int total, int cost1, int cost2) 
    {
        long ways=0;
        for(int i=0;i<=total/cost1;i++)
        {
            ways = ways+ (total-(cost1*i))/cost2+1;
        }
        return ways;
    }
}

//You are given an integer total indicating the amount of money you have. You are also given two integers cost1 and cost2 indicating the price of a pen and pencil respectively. You can spend part or all of your money to buy multiple quantities (or none) of each kind of writing utensil.

//Return the number of distinct ways you can buy some number of pens and pencils.

//Input: total = 20, cost1 = 10, cost2 = 5
//Output: 9
//Explanation: The price of a pen is 10 and the price of a pencil is 5.
//- If you buy 0 pens, you can buy 0, 1, 2, 3, or 4 pencils.
//- If you buy 1 pen, you can buy 0, 1, or 2 pencils.
//- If you buy 2 pens, you cannot buy any pencils.
//The total number of ways to buy pens and pencils is 5 + 3 + 1 = 9.