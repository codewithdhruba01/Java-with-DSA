# **Binary Number System in Java**
Binary Number System ek number system hai jo **base 2** par kaam karta hai aur isme sirf do digits hote hain – 0 aur 1. Computer ke andar saare calculations aur data processing binary me hi hoti hai, kyunki computer ke electronic circuits sirf do states ko samajhte hain: ON (1) aur OFF (0). Binary number ke har digit ko **bit** kaha jata hai. Java me binary number ko represent karne ke liye `0b` prefix use hota hai. Java me built-in methods jaise `Integer.toBinaryString()` aur `Integer.parseInt(..., 2)` ka use karke binary aur decimal ke beech conversion kiya ja sakta hai.

Isliye isse **Base-2 Number System** bhi kaha jata hai.

## Binary Kyu Use Hota Hai?

Computer ke andar saare calculations, processing, data storage, aur operations **electrical signals** (ON/OFF) ke basis par hote hain.

* ON = 1
* OFF = 0

Isliye computer naturally binary system ko samajhta hai.
Java, C, Python ya koi bhi programming language aakhir me binary me hi kaam karti hai.

---

## Binary Number Ka Structure

Binary number ka har digit ko **bit** kaha jata hai.
Bit ka matlab: **Binary Digit**

Example:

```
1011
```

Ye 4-bit binary number hai.

---

## Place Value System (Binary)

Binary me bhi place-value system hota hai — jaise decimal me hota hai.

Rightmost digit ka value hota hai:

* 2⁰ (1)
* next: 2¹ (2)
* next: 2² (4)
* next: 2³ (8)

Example:

```
Binary: 1011
```

Calculation:
1 × 2³ = 8
0 × 2² = 0
1 × 2¹ = 2
1 × 2⁰ = 1

**Total = 8 + 0 + 2 + 1 = 11 (decimal)**

---

# Binary Number System in Java

Java binary number system ko directly support karta hai.

### 1. Binary Literal in Java

Java me binary number likhne ke liye prefix use hota hai:

```
0b   ya   0B
```

Example:

```java
int x = 0b1010;  // 10 in decimal
```

---

### 2. Decimal → Binary Conversion

Java me decimal number ko binary me convert karne ke liye built-in method hai:

```java
Integer.toBinaryString(number)
```

---

###  3. Binary → Decimal Conversion

```java
Integer.parseInt(binaryString, 2)
```

Isme '2' ka matlab hai ki ye string **base 2** me likhi hui hai.

---

# Binary Number System Ki Characteristics

1. Base = **2**
2. Digits = **0 and 1**
3. Every digit is called a **bit**
4. 8 bits = 1 byte
5. Computer internally binary me kaam karta hai
6. Java binary literals ko `0b` se support karta hai
7. Conversion methods:

   * toBinaryString()
   * parseInt(.., 2)
