# Java Environment Setup Guide

This guide explains how to set up the Java Development Environment on your machine step by step.

---

## ✅ 1. Install JDK (Java Development Kit)

**JDK** includes the Java compiler, JRE, and development tools.

### 📥 Download
- **Oracle JDK:**  
  [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
- **OpenJDK:**  
  [https://jdk.java.net/](https://jdk.java.net/)

### 📝 Choose Version
- JDK 8 – for legacy projects.
- JDK 11 – Long Term Support (recommended).
- JDK 17 or newer – latest features.

### ⚙️ Install
1. Download the installer for your OS.
2. Run the installer and follow setup instructions.

**Default installation paths:**
- Windows:  
  `C:\Program Files\Java\jdk-XX`
- macOS/Linux:  
  `/Library/Java/JavaVirtualMachines/`

---

## ✅ 2. Set Environment Variables

To run Java commands globally, set these environment variables.

### (a) PATH Variable

**Windows:**
1. Open **Environment Variables** settings.
2. Under **System Variables**, select `Path` and click **Edit**.
3. Click **New** and add:
```

C:\Program Files\Java\jdk-XX\bin

````
4. Click **OK** to save.

**macOS/Linux:**
- Open Terminal and add to `.bash_profile`, `.bashrc`, or `.zshrc`:
```sh
export PATH=/Library/Java/JavaVirtualMachines/jdk-XX/Contents/Home/bin:$PATH
````

* Then run:

  ```sh
  source ~/.bash_profile
  ```

  or

  ```sh
  source ~/.zshrc
  ```

---

### (b) JAVA\_HOME Variable

**Windows:**

1. In **Environment Variables**, click **New** under **System Variables**.

   * Variable name:

     ```
     JAVA_HOME
     ```
   * Variable value:

     ```
     C:\Program Files\Java\jdk-XX
     ```
2. Click **OK**.

**macOS/Linux:**
Add to `.bash_profile`:

```sh
export JAVA_HOME=$(/usr/libexec/java_home)
```

Then:

```sh
source ~/.bash_profile
```

---

## ✅ 3. Verify Installation

Open Command Prompt or Terminal and run:

```sh
java -version
```

Example output:

```
java version "17.0.2" 2022-01-18 LTS
Java(TM) SE Runtime Environment...
```

```sh
javac -version
```

Example output:

```
javac 17.0.2
```

✅ If versions display correctly, your setup is complete!

---

## ✅ 4. Write and Run Your First Java Program

Create a file named `HelloWorld.java`:

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, Java World!");
  }
}
```

**Compile:**

```sh
javac HelloWorld.java
```

**Run:**

```sh
java HelloWorld
```

Output:

```
Hello, Java World!
```

