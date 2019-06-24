/*
https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1

Lets say we have stairs A,B,C and F as final stair.
A -> B -> C -> F
Let path to reach F from C: P1 -(i)
Let path to reach F from B: P2 -(ii)
Path to reach C from B: 1 step -(iii)

So, we can say from i, ii and iii:
        P2 = 1.P1 - (iv)

Now, get ways to reach F from A:
       PA1 : A -> (1 step) -> P2 => 1.P2 => 1.1.P1 (using iv) - (v)
       PA2 : A -> (2 step) -> P1 => 2.P1 - (vi)
        
Finally, add any random stair X in from of A:
  X -> A -> B -> C -> F
  ways to rrach F from X:
        : X -> (1 step) -> PA1 => 1.1.1.P1 (using v) - (vii)
        : X -> (1 step) -> PA2 => 1.2.P1 (using vi) - (viii)
        : X -> (2 step) -> P2  => 2.1.P1 (using ii) - (ix)
        
As, we can see for any random node X we always have one unique path (vii) and rest of the path
combination will always duplicate (viii & ix are already same). 
        
More: As, X can be any random stair lets say we reach X from unique paths U1, U2, U3 then to reach F path will be:
        : U1.1.2.P1 (using viii)
        : U1.2.1.P1 (using ix)
        
        : U2.1.2.P1 (using viii)
        : U2.2.1.P1 (using ix)
       
        : U3.1.2.P1 (using viii)
        : U3.2.1.P1 (using ix)
There will always be duplicate paths and only unique path till X can be considered and unique path till X will be
1 + X/2 (all 1's + duplicates generated using viii & ix).

PS: Climb or Descent stairs the unique path will be factored by no.of steps user can take like n/2 in this case. 

*/

class DynamicProgramming{
    
    Long countWays(int m){
        
        return new Long(m/2+1);
    }        
}
