Day8 of #100Days
-

----------------------------
Understanding of DP and one Problem on Dynamic programming

1.  Coin Change

Things to remember while doing coin change problems
- Repeated sub-problems
- should able to optimize repeated sub-problems
Check first greedy, if greedy works go further steps
Greedy —> Get the best possible solution among all by single path and it’s linear way of solution
If Greedy doesn’t work, go for a exhaustive way  check among all possible ways->  choose or not choose


- At last, look at bottom up DP solution: looking tree from bottom. Whereas in arrays goes from right to left
  1. Follow choose or not choose pattern: if you choose the coin get it’s value
  2. Here, not choose mean 0 and choose mean 1 rows are amount to make and columns are number of coins

  ![img.png](img.png)

  3. There is no chance to make amount 1with coins 2 here hence, 0 case and get it from sub-problem where to make amount

￼![img_1.png](img_1.png)

    To make amount 2,  1 case will work with to make this need 1 coin of 2 result to [1,2]^0 case subproblem = 0
    Go 2 steps back get that sub prob, add 1 to it  and get the minimum from it.

![img_2.png](img_2.png)
￼
    Reason for going 2 steps back is  it already exists with subproblems which already solved before. Similarly,
￼
![img_3.png](img_3.png)
    4. at last,
￼![img_4.png](img_4.png)
     5 NOTE :  Consider always 0 case as ∞

![img_5.png](img_5.png)
￼
    6 If array of coins are in unsorted order follows:
![img_6.png](img_6.png)
￼


	
