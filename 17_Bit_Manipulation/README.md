# Bit Manipulation in Java

Bit manipulation involves manipulating individual bits within a binary representation of data. It's a powerful technique used in competitive programming, system programming, and optimization.

## Binary Number System

**Decimal to Binary Conversion:**
- 10 in decimal = 1010 in binary
- 8 bits = 1 byte
- 32 bits = 1 integer (in Java)

**Binary Representation:**
```
Decimal: 10 = Binary: 00001010
Decimal: 5  = Binary: 00000101
```

## Bitwise Operators

### 1. AND (&)
- Returns 1 if both bits are 1
- `a & b` performs bitwise AND

**Truth Table:**
| A | B | A & B |
|---|---|-------|
| 0 | 0 | 0     |
| 0 | 1 | 0     |
| 1 | 0 | 0     |
| 1 | 1 | 1     |

**Example:**
```
10 & 5 = 00001010 & 00000101 = 00000000 = 0
```

### 2. OR (|)
- Returns 1 if at least one bit is 1
- `a | b` performs bitwise OR

**Truth Table:**
| A | B | A \| B |
|---|---|--------|
| 0 | 0 | 0      |
| 0 | 1 | 1      |
| 1 | 0 | 1      |
| 1 | 1 | 1      |

**Example:**
```
10 | 5 = 00001010 | 00000101 = 00001111 = 15
```

### 3. XOR (^)
- Returns 1 if bits are different
- `a ^ b` performs bitwise XOR

**Truth Table:**
| A | B | A ^ B |
|---|---|-------|
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 0     |

**Example:**
```
10 ^ 5 = 00001010 ^ 00000101 = 00001111 = 15
5 ^ 5 = 00000101 ^ 00000101 = 00000000 = 0 (XOR with self = 0)
```

### 4. NOT (~)
- Flips all bits (0 becomes 1, 1 becomes 0)
- `~a` performs bitwise NOT

**Example:**
```
~5 = ~(00000101) = 11111010 = -6 (in two's complement)
```

### 5. Left Shift (<<)
- Shifts bits to the left by specified positions
- `a << n` shifts left by n positions
- Equivalent to multiplying by 2^n

**Example:**
```
5 << 1 = 00000101 << 1 = 00001010 = 10 (5 * 2^1)
5 << 2 = 00000101 << 2 = 00010100 = 20 (5 * 2^2)
```

### 6. Right Shift (>>)
- Shifts bits to the right by specified positions
- `a >> n` shifts right by n positions
- Equivalent to dividing by 2^n (for positive numbers)

**Example:**
```
10 >> 1 = 00001010 >> 1 = 00000101 = 5 (10 / 2^1)
20 >> 2 = 00010100 >> 2 = 00000101 = 5 (20 / 2^2)
```

### 7. Unsigned Right Shift (>>>)
- Shifts bits to the right, fills with 0 from left
- `a >>> n` unsigned right shift

## Common Bit Manipulation Problems

### 1. Check if a number is Even or Odd
```java
boolean isEven(int n) {
    return (n & 1) == 0; // Even if LSB is 0
}
```

### 2. Check if a number is Power of 2
```java
boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

### 3. Count Set Bits (Hamming Weight)
```java
int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        count += n & 1;
        n >>= 1;
    }
    return count;
}

// Optimized version
int countSetBitsOptimized(int n) {
    int count = 0;
    while (n != 0) {
        n = n & (n - 1); // Remove rightmost set bit
        count++;
    }
    return count;
}
```

### 4. Find Single Number (XOR all elements)
```java
int findSingleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num; // XOR cancels out duplicate pairs
    }
    return result;
}
```

### 5. Swap two numbers without temp variable
```java
void swap(int a, int b) {
    a = a ^ b;
    b = a ^ b; // b = (a^b) ^ b = a
    a = a ^ b; // a = (a^b) ^ a = b
}
```

### 6. Find Missing Number
```java
int findMissingNumber(int[] nums, int n) {
    int expectedXOR = 0;
    int actualXOR = 0;

    for (int i = 1; i <= n; i++) {
        expectedXOR ^= i;
    }

    for (int num : nums) {
        actualXOR ^= num;
    }

    return expectedXOR ^ actualXOR;
}
```

### 7. Reverse Bits
```java
int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result = (result << 1) | (n & 1);
        n >>= 1;
    }
    return result;
}
```

### 8. Get ith bit
```java
boolean getBit(int n, int i) {
    return (n & (1 << i)) != 0;
}
```

### 9. Set ith bit
```java
int setBit(int n, int i) {
    return n | (1 << i);
}
```

### 10. Clear ith bit
```java
int clearBit(int n, int i) {
    return n & ~(1 << i);
}
```

### 11. Toggle ith bit
```java
int toggleBit(int n, int i) {
    return n ^ (1 << i);
}
```

### 12. Find position of rightmost set bit
```java
int rightmostSetBit(int n) {
    return n & -n; // Two's complement trick
}
```

## Advanced Bit Manipulation

### 1. Bit Manipulation for Subsets Generation
```java
void generateSubsets(int[] arr) {
    int n = arr.length;
    int totalSubsets = 1 << n; // 2^n

    for (int mask = 0; mask < totalSubsets; mask++) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("}");
    }
}
```

### 2. Bit Manipulation for Permutations
```java
void generatePermutations(int[] arr) {
    int n = arr.length;
    int totalPerms = 1 << n;

    for (int mask = 0; mask < totalPerms; mask++) {
        if (Integer.bitCount(mask) == n) { // All bits set
            // Process permutation represented by mask
        }
    }
}
```

### 3. Bit Manipulation in Dynamic Programming
```java
// Subset Sum DP with bit manipulation
boolean subsetSum(int[] arr, int target) {
    int n = arr.length;
    int maxSum = Arrays.stream(arr).sum();
    if (target > maxSum) return false;

    boolean[] dp = new boolean[target + 1];
    dp[0] = true;

    for (int num : arr) {
        for (int j = target; j >= num; j--) {
            if (dp[j - num]) {
                dp[j] = true;
            }
        }
    }

    return dp[target];
}
```

## Interview Problems

### 1. Single Number II
Given an array where every element appears three times except one, find the single element.

```java
int singleNumber(int[] nums) {
    int ones = 0, twos = 0;
    for (int num : nums) {
        ones = (ones ^ num) & ~twos;
        twos = (twos ^ num) & ~ones;
    }
    return ones;
}
```

### 2. Maximum XOR of Two Numbers
Find two numbers in array with maximum XOR.

### 3. Bitwise AND of Numbers Range
Given range [m, n], find bitwise AND of all numbers in range.

```java
int rangeBitwiseAnd(int m, int n) {
    while (n > m) {
        n = n & (n - 1); // Remove rightmost set bit
    }
    return m & n;
}
```

### 4. Counting Bits
Given n, return array where ans[i] is number of 1's in binary representation of i.

```java
int[] countBits(int n) {
    int[] ans = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        ans[i] = ans[i >> 1] + (i & 1);
    }
    return ans;
}
```

## Bit Manipulation Tricks

### 1. Check if number is power of 4
```java
boolean isPowerOfFour(int n) {
    return n > 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
}
```

### 2. Add two numbers without +
```java
int add(int a, int b) {
    while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    return a;
}
```

### 3. Multiply by 7 without *
```java
int multiplyBy7(int n) {
    return (n << 3) - n; // 8n - n = 7n
}
```

### 4. Find absolute value without Math.abs
```java
int abs(int n) {
    int mask = n >> 31; // -1 for negative, 0 for positive
    return (n ^ mask) - mask;
}
```

### 5. Check if two numbers have opposite signs
```java
boolean oppositeSigns(int x, int y) {
    return (x ^ y) < 0;
}
```

## Performance Comparison

| Operation | Time Complexity | Notes |
|-----------|----------------|-------|
| Check even/odd | O(1) | Single bit operation |
| Count set bits | O(log n) | Brian Kernighan's algorithm |
| Power of 2 check | O(1) | Single operation |
| Find missing number | O(n) | XOR all elements |

## Practice Problems

1. **Number of 1 Bits** (LeetCode 191)
2. **Power of Two** (LeetCode 231)
3. **Missing Number** (LeetCode 268)
4. **Single Number** (LeetCode 136)
5. **Single Number II** (LeetCode 137)
6. **Bitwise AND of Numbers Range** (LeetCode 201)
7. **Counting Bits** (LeetCode 338)
8. **Reverse Bits** (LeetCode 190)
9. **Maximum XOR of Two Numbers** (LeetCode 421)
10. **Find the Difference** (LeetCode 389)

## Key Takeaways

- Bit manipulation is fast and memory efficient
- XOR is associative and commutative: `a ^ b ^ c = c ^ a ^ b`
- XOR with self gives 0: `a ^ a = 0`
- XOR with 0 gives the number: `a ^ 0 = a`
- `n & (n-1)` clears the rightmost set bit
- `n & -n` gives the rightmost set bit
- Left shift multiplies by 2, right shift divides by 2
- Use bit manipulation for optimization in competitive programming

Mastering bit manipulation will significantly improve your problem-solving skills!
