**You are given a number *n*.**

* For every integer *i* from 1 to *n*, print:

  * **FizzBuzz** if *i* is divisible by both 3 and 5
  * **Fizz** if *i* is divisible by 3 only
  * **Buzz** if *i* is divisible by 5 only
  * Otherwise, print *i*

Print one result per line.

---

### Example

Suppose **n = 15**.

**Output:**

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

---

### Explanation

* The numbers **3, 6, 9, and 12** are multiples of 3 (but not 5), so print **Fizz** on those lines.
* The numbers **5 and 10** are multiples of 5 (but not 3), so print **Buzz** on those lines.
* The number **15** is a multiple of both 3 and 5, so print **FizzBuzz** on that line.
* None of the other values is a multiple of either 3 or 5, so print the value of *i* on those lines.

---

### Constraints

* **0 < n < 2 × 10⁵**

---
### Solution
Great — this is a classic Hackerrank FizzBuzz question, and the solution is straightforward, but let’s do it cleanly, efficiently, and exactly how they expect it in a coding assessment. ✔️

Your constraints are:

0 < n < 2 × 10^5

Meaning your loop can safely run up to 200,000 iterations — trivial for modern Java.

Below is the complete and perfect Java solution you should write inside fizzBuzz(int n).

✅ Correct Java Solution (Complete Code for fizzBuzz)
public static void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 15 == 0) {               // divisible by both 3 and 5
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {         // divisible by 3 only
            System.out.println("Fizz");
        } else if (i % 5 == 0) {         // divisible by 5 only
            System.out.println("Buzz");
        } else {
            System.out.println(i);       // not divisible by 3 or 5
        }
    }
}

💡 Why this is the best approach

No extra memory — prints as we go.

Single pass: O(n) — optimal.

i % 15 == 0 is faster and cleaner than checking both conditions separately.

Exactly what Hackerrank expects. ✔️

🧠 What to watch for in timed assessments

People often make errors like:

❌ Checking 3 before 15 (wrong result!).
You MUST check 15 first because it matches both 3 and 5.

This:

if (i % 3 == 0) { … }
else if (i % 5 == 0) { … }


would never reach the 15 condition.


