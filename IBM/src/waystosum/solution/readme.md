## Question 1

An automated packaging system packs boxes with items of various weights.
A box is certified to hold a certain total weight.

Given an integer **total** and an integer **k**, calculate the number of possible ways to achieve the total weight using items with integer weights from **1 to k inclusive**. Return the number modulo **(10⁹ + 7)**.

---

### Example

```
total = 8
k = 2
```

To reach a weight of 8, there are **5 different ways** to combine items weighing 1 or 2:

* [1, 1, 1, 1, 1, 1, 1, 1]
* [1, 1, 1, 1, 1, 1, 2]
* [1, 1, 1, 1, 2, 2]
* [1, 1, 2, 2, 2]
* [2, 2, 2, 2]

---

### Function Description

Complete the function **ways** in the editor with the following parameter(s):

* **int total**: the value to sum to
* **int k**: the maximum of the range of integers to consider when summing to total

---

### Returns

* **int**: the number of ways to sum to **total**; the number might be very large, so return the integer modulo **1000000007 (10⁹ + 7)**

---

### Constraints

* 1 ≤ total ≤ 1000
* 1 ≤ k ≤ 100

---

## Input Format For Custom Testing

The first line contains an integer, **total**, that denotes the target sum.
The second line contains an integer, **k**, that denotes the maximum value in the range of integers to be considered, i.e., from 1 to k.

---

## Sample Case 0

### Sample Input For Custom Testing

```
STDIN   Function
-----   --------
5       total = 5
3       k = 3
```

### Sample Output

```
5
```

### Explanation

The integers that can be considered to reach the sum are **[1, 2, 3]**.

The 5 ways to reach the target sum are:

1. 1 + 1 + 1 + 1 + 1 = 5
2. 1 + 1 + 1 + 2 = 5
3. 1 + 2 + 2 = 5
4. 1 + 1 + 3 = 5
5. 2 + 3 = 5

```
5 modulo 1000000007 = 5
```

---

## Sample Case 1

### Sample Input For Custom Testing

```
STDIN   Function
-----   --------
4       total = 4
2       k = 2
```

### Sample Output

```
3
```

### Explanation

The sum required is 4, and the range of integers is **[1, 2]**.

There are **3 ways** to reach the target sum:

1. 1 + 1 + 1 + 1 = 4
2. 1 + 1 + 2 = 4
3. 2 + 2 = 4

```
3 modulo 1000000007 = 3
```

---
### Solution
Nice one — this is a classic “coin change / ways to sum” DP problem. 🔨🤖🔧

We’re counting how many combinations (order doesn’t matter) of numbers in 1..k sum to total.
That’s exactly the same as: “How many ways to make amount total using coin values 1..k, with unlimited copies of each coin?”

DP idea

Let dp[s] = number of ways to make sum s.

Base: dp[0] = 1 (one way to make 0: take nothing).

For each value v from 1 to k:

For each sum s from v to total:

dp[s] += dp[s - v] (every way to build s - v can be extended by adding v).

Take all operations mod 1_000_000_007.

Looping v on the outside and s increasing ensures order doesn’t matter (combinations, not permutations).

Code to put inside Result class
class Result {

    /*
     * Complete the 'ways' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER total
     *  2. INTEGER k
     */

    public static int ways(int total, int k) {
        final int MOD = 1_000_000_007;

        int[] dp = new int[total + 1];
        dp[0] = 1; // one way to reach sum 0: use no items

        // coin-change style DP: combinations (order-independent)
        for (int value = 1; value <= k; value++) {
            for (int sum = value; sum <= total; sum++) {
                dp[sum] = (dp[sum] + dp[sum - value]) % MOD;
            }
        }

        return dp[total];
    }
}


This satisfies the constraints (total ≤ 1000, k ≤ 100) easily: time complexity O(total * k) and memory O(total). ✔️

### Example:

---

**total = 5**
**k = 3**

---

### DP table sketch (top row: sums)

```
      0   1   2   3   4   5 | values
dp →  1   1   1   1   1   1 | 1
              2   2   3   3 | 2
                  3   4   5 | 3
```

Notes written above:

* “3 ways to make 4 with 2 values”
* “ways”
* Values: 1, 2, 3

---

### Explanation notes

* value = 1, 2, 3
* value 1
* Sum 1 to 5

Formula:

```
dp[s] = dp[s] + dp[s - v]
```

---

### Value = 1

```
dp[1] = dp[1] + dp[1 - 1 = 0] = 1
dp[2] = dp[2] + dp[2 - 1 = 1] = 1
dp[3] = dp[3] + dp[3 - 1 = 2] = 1
dp[4] = dp[4] + dp[4 - 1 = 3] = 1
dp[5] = dp[5] + dp[5 - 1 = 4] = 1
```

Comment:

* “1 way to make n with 1 value”

---

### Value = 2

Sum 2 to 5

```
dp[2] = dp[2] + dp[2 - 2 = 0] = 2
        1   +   1   = 2

dp[3] = dp[3] + dp[3 - 2 = 1] = 2
        1   +   1   = 2

dp[4] = dp[4] + dp[4 - 2 = 2] = 3
        1   +   2   = 3

dp[5] = dp[5] + dp[5 - 2 = 3] = 3
        1   +   2   = 3
```

Comments:

* “2 ways to make 2 with 2 values”
* “3 ways to make 3 with 2 values”
* “4 ways to make 4 with 3 values (1,2,3)”
* “ways to make 5 with 2 values”

---

### Value = 3

Sum 3 to 5

```
dp[3] = dp[3] + dp[3 - 3 = 0] = 3
        2   +   1   = 3

dp[4] = dp[4] + dp[4 - 3 = 1] = 4
        3   +   1   = 4

dp[5] = dp[5] + dp[5 - 3 = 2] = 5
        3   +   2   = 5
```

Final result boxed:

```
5
```

---

### Final interpretation

* Total ways to make **5** using values **1, 2, 3** = **5**

---


