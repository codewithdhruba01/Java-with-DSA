# What is a String in Java?

* A **String** is a **sequence of characters** (like text).
* In Java, String is a **class** in `java.lang` package.
* Strings are **immutable** → once created, they cannot be changed (new object is created if you modify it).

Example:

```java
String s = "Hello";
```

Internally memory me ye aise store hota hai:

```
H  e  l  l  o
```

Yani:

```java
char[] arr = {'H','e','l','l','o'};
```

But difference ye hai ki `String` ek **object** hai, normal array nahi.

---

## 2. String Immutable Kyu Hota Hai

**Immutable** matlab — ek baar string ban gayi, uske characters **change nahi kar sakte**.

### Reason (internally):

* Jab tum likhte ho `String s = "Hello";`, to Java usse **String Pool** me store karta hai.
* Agar koi aur likhta hai `String s2 = "Hello";`, to **wo same memory address** use karega.
  (Java nayi memory allocate nahi karta)

Agar string mutable hoti, to ek change dusre variable me bhi reflect ho jata — jo galat hota.

Example:

```java
String s1 = "Java";
String s2 = "Java"; // same memory pool location

s1 = s1 + "Lang";  // new object banta hai
```

Yani `s1` ab ek **new object** point karta hai,
`"JavaLang"` ke liye ek nayi memory allocate hoti hai.

---

## 3. String Pool (Interning) Concept

Java memory ke andar ek **String Constant Pool (SCP)** hota hai.
Ye heap ke andar ka ek special area hai jaha **unique strings** store hoti hain.

Example:

```java
String a = "Hello";
String b = "Hello";
```

Dono ka reference same hoga, kyunki `"Hello"` already pool me tha.
Java firse naya object nahi banata.

Lekin:

```java
String c = new String("Hello");
```

> Ye **heap me alag object** banata hai, pool me nahi.

---

## 4. Kaise String Compare Hoti Hai

### (a) `==` Operator:

Ye **reference address** check karta hai (yaani dono same memory location point karte hain ya nahi).

```java
String a = "Hello";
String b = "Hello";
System.out.println(a == b); // true (same pool object)
```

```java
String x = new String("Hello");
String y = new String("Hello");
System.out.println(x == y); // false (different objects)
```

---

### (b) `equals()` Method:

Ye **content (value)** compare karta hai, **address nahi**.

```java
System.out.println(x.equals(y)); // true
```

Working internally:

```java
public boolean equals(Object obj) {
    if (this == obj) return true; // same object
    if (obj instanceof String) {
        String another = (String) obj;
        int n = value.length;
        if (n == another.value.length) {
            for (int i = 0; i < n; i++) {
                if (value[i] != another.value[i]) return false;
            }
            return true;
        }
    }
    return false;
}
```

> Matlab Java internally **character by character** comparison karta hai.


### (c) `compareTo()` Method:

Lexicographical (dictionary order) me compare karta hai.

Internally working:

* Har character ka **Unicode (ASCII)** value check hota hai.
* Jaha difference milta hai, wahin comparison stop hota hai.

Example:

```java
"hello".compareTo("chello");
```

Step by step:

* 'h' (104) – 'c' (99) = +5
  > positive → `"hello"` bada hai `"chello"` se.

---

## 5. Important Methods (with Theory)

### (a) `length()`

Returns number of characters.
Internally:

```java
public int length() {
    return value.length; // value[] = char array
}
```

---

### (b) `charAt(int index)`

Particular position ka character deta hai.

Internally:

```java
public char charAt(int index) {
    return value[index];
}
```

---

### (c) `substring(int start, int end)`

Original string ka ek part (new object) banata hai.

Example:

```java
"HelloWorld".substring(0,5); // "Hello"
```

Internally:

* Naya character array banata hai `[0..5)` tak ka part leke
* Original string ko modify nahi karta

---

### (d) `concat(String str)`

Dono strings ko jodta hai, aur ek **new String object** banata hai.

```java
"Hello".concat("World"); // new object "HelloWorld"
```

---

### (e) `replace(old, new)`

Har character ya substring ko replace karta hai.
Internally ek **loop** chalake new string banata hai.

---

### (f) `trim()`

Remove karta hai **leading aur trailing spaces** (beech ke spaces nahi).

Example:

```java
"  Java  ".trim(); // "Java"
```

---

### (g) `split(String regex)`

String ko **array of strings** me todta hai (regex ke base pe).

```java
String s = "A,B,C";
String[] arr = s.split(",");
```

Internally ye regex pattern se matching karke ek array return karta hai.

---

### (h) `toUpperCase()` / `toLowerCase()`

Character ke Unicode values convert karta hai:

* 'a' (97) → 'A' (65)
* 'b' (98) → 'B' (66)

---

### (i) `contains(CharSequence seq)`

String me substring present hai ya nahi check karta hai.
Internally `indexOf(seq) != -1` check karta hai.

---

### (j) `matches(String regex)`

Regex ke pattern ke against pura string match karta hai.
Ye internally `Pattern` aur `Matcher` class use karta hai.

---

## 6. StringBuilder / StringBuffer (Mutable Strings)

### Problem:

`String` immutable hone ki wajah se har modification nayi memory banata hai.

Example:

```java
String s = "Hello";
s = s + "World"; // new object banta hai
```

### Solution:

Use **StringBuilder** ya **StringBuffer**.

Ye dono internally ek **char[] array** rakhte hain, jisme content change hota hai bina naya object banaye.

Example:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```

Internally:

* Same char[] array me “ World” characters add ho jate hain.
* Memory efficient & fast.

---

## 7. String Internally Kaise Store Hoti Hai

Simplified internal structure:

```java
public final class String implements java.io.Serializable, Comparable<String> {
    private final char value[]; // actual character array
    private final int hash;     // cache for hashcode
}
```

* `value[]` → store karta hai characters
* `hash` → ek baar calculate hone ke baad cache hota hai (performance ke liye)

---

## 8. Summary Table

| Concept       | Description                    | Working                      |
| ------------- | ------------------------------ | ---------------------------- |
| Immutable     | Once created, can’t be changed | New object created on change |
| ==            | Compare memory address         | Same reference or not        |
| equals()      | Compare content                | Character by character       |
| compareTo()   | Dictionary order               | Unicode subtraction          |
| concat()      | Join strings                   | Creates new object           |
| substring()   | Part of string                 | Creates new object           |
| length()      | Returns size                   | value[].length               |
| trim()        | Remove spaces                  | Iterates from both ends      |
| split()       | Divide by regex                | Returns string array         |
| toUpperCase() | Convert to upper case          | Unicode conversion           |
| StringBuilder | Mutable version                | Changes same object          |
| String Pool   | Memory optimization            | Reuses literals              |
