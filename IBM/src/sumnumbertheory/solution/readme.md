## Question 2

An array generator service takes in a single integer **k** and a sum **s**. It returns an array with a sum **s** where the *i*ᵗʰ element is *(k + i − 1)*. Thus, for the parameters **k = 6** and **s = 30**, the service returns **[6, 7, 8, 9]**. Note that it is not always possible to generate a valid array for some pair of **k** and **s**.

Given an integer **s**, find the number of valid values of **k** for which it is possible to generate a valid array using the service.

---

### Example

Suppose **s = 10**.

* For **k = 1**, **[1, 2, 3, 4]** sums to **10**
* For **k = 10**, **[10]** sums to **10**

There are **2** values of **k** for **s = 10**.

---

### Function Description

Complete the function **getKCount** in the editor below.

**getKCount** has the following parameter(s):

* **long s**: the value to sum to

---

### Returns

* **long**: count of possible values of **k**

---

### Constraints

* **1 ≤ s ≤ 10¹²**

### Input Format For Custom Testing

The first line contains a long integer, **s**.

---

### Sample Case 0

#### Sample Input For Custom Testing

```
STDIN      Function
-----      --------
125   →    s = 125
```

---

### Sample Output

```
4
```

---

### Explanation

There are four possible values of **k**.

* **k = 8** produces
  8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 = 125

* **k = 23** produces
  23 + 24 + 25 + 26 + 27 = 125

* **k = 62** produces
  62 + 63 = 125

* **k = 125** produces
  125 = 125

### Sample Case 1

#### Sample Input For Custom Testing

```
STDIN      Function
-----      --------
5     →    s = 5
```

---

### Sample Output

```
2
```

---

### Explanation

* **k = 5** produces
  5 = 5

* **k = 2** produces
  2 + 3 = 5

---
### Solution
We want how many different `k` give a sequence of **consecutive integers** starting at `k` that sums to `s`.

Example:
`s = 10`

* `k = 1` → `1 + 2 + 3 + 4 = 10`
* `k = 10` → `10 = 10`

So there are 2 valid `k`.

---

### Math trick (so we can solve it fast)

Any sum of consecutive positive integers

[
k + (k+1) + \dots + (k + (m-1))
]

has:

* `m` terms (length `m`)
* sum:
(Sum of an arithmetic progression)
[
s = \frac{m}{2} \big(2k + m - 1\big)
]

Rearrange:

[
2s = m \cdot (2k + m - 1)
]

For some integer `m ≥ 1` and `k ≥ 1`.

**Classical result:**
The number of ways to write `s` as a sum of consecutive positive integers equals the number of **odd divisors of `s`**.

Why? Because each such representation corresponds to a factorization of `s` into `s = m * a` where `m` is the length and `a` is the average, and they must have the same parity ⇒ `m` must divide `s` and be odd.

So the answer = **count of odd divisors of `s`**.

Constraints: `s ≤ 10^12` → we can loop `d` up to `sqrt(s)` safely.

---

### Implementation of `getKCount`

```java
class Result {

    /*
     * Complete the 'getKCount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER s as parameter.
     */

    public static long getKCount(long s) {
        long count = 0;

        // iterate over all divisors up to sqrt(s)
        for (long d = 1; d * d <= s; d++) {
            if (s % d == 0) {
                long other = s / d;

                // if d is a divisor and odd, it corresponds to one representation
                if ((d & 1L) == 1L) {
                    count++;
                }

                // check the paired divisor (other) if it's different and odd
                if (other != d && (other & 1L) == 1L) {
                    count++;
                }
            }
        }

        return count;
    }
}
```

This is:

* **O(√s)** time — fine for `s ≤ 10^12`
* Uses only `long` arithmetic, no overflow issues.
* Matches all the sample cases:

  * `s = 5` → odd divisors: 1, 5 → `2`
  * `s = 125` → odd divisors: 1, 5, 25, 125 → `4` ✔️

### We can loop d up to sqrt(s) safely. why?

Excellent question — this is a **fundamental number-theory idea**, and interviewers *love* when candidates understand it, not just use it. 💡
Let’s break it down **very concretely and visually**.

---

## 1️⃣ What are we looping over?

In Question 2, we are looping over **divisors** of `s`.

A **divisor** `d` of `s` means:

```text
s % d == 0
```

Example:
`s = 36`

Divisors are:

```text
1, 2, 3, 4, 6, 9, 12, 18, 36
```

---

## 2️⃣ Divisors come in PAIRS

This is the key insight.

If `d` divides `s`, then:

```text
d × (s / d) = s
```

So divisors always come in **pairs**:

| d | s / d |
| - | ----- |
| 1 | 36    |
| 2 | 18    |
| 3 | 12    |
| 4 | 9     |
| 6 | 6     |

Notice something important:

* One number in the pair is **small**
* The other is **large**
* When `d` increases, `s / d` decreases

---

## 3️⃣ Where does √s come from?

The point where the two numbers in the pair meet is:

```text
d = sqrt(s)
```

Example:

```text
sqrt(36) = 6
```

After that point:

* If `d > sqrt(s)`
* Then `s / d < sqrt(s)`
* That pair was **already seen earlier**

So **every divisor greater than √s has a partner smaller than √s**.

---

## 4️⃣ Visual intuition

Think of walking from both ends:

```
1  ---->      <----  s
2  ---->      <----  s/2
3  ---->      <----  s/3
...
sqrt(s)  <---->  sqrt(s)
```

Once you reach `sqrt(s)`, **you have seen all divisor pairs**.

---

## 5️⃣ Why looping only up to √s is enough

Because:

* If `d ≤ √s` and `s % d == 0`

  * You find **two divisors**: `d` and `s / d`
* If `d > √s`

  * Its partner was already found earlier

So instead of looping:

```java
for (long d = 1; d <= s; d++)
```

(which is impossible for `s ≤ 10^12` ❌)

We safely loop:

```java
for (long d = 1; d * d <= s; d++)
```

Which is at most:

```text
sqrt(10^12) = 10^6
```

➡️ **1 million iterations** — perfectly safe and fast ✔️

---

## 6️⃣ Why this is CRITICAL for performance

Let’s compare:

| Approach          | Max iterations      |
| ----------------- | ------------------- |
| Loop to `s`       | 1,000,000,000,000 ❌ |
| Loop to `sqrt(s)` | 1,000,000 ✔️        |

This is the difference between:

* **Time limit exceeded**
* **Accepted solution**

---

## 7️⃣ How this appears in the code

```java
for (long d = 1; d * d <= s; d++) {
    if (s % d == 0) {
        long other = s / d;

        // d is a divisor
        // other is the paired divisor
    }
}
```

Special case:

* When `d * d == s`

  * `d == s / d`
  * Count it **only once** (perfect square)

---

## 8️⃣ Interview-ready explanation (short & strong)

If asked:

> Why can we loop only up to √s?

Say:

> Divisors of a number come in complementary pairs (d, s/d).
> Once d exceeds √s, its paired divisor is less than √s and has already been checked, so iterating beyond √s would only repeat work.

This answer signals **strong mathematical understanding** ✔️

---

## 9️⃣ One-sentence intuition to remember forever

> You never need to look past √s, because every large divisor has already “shown its face” as the partner of a smaller one.
