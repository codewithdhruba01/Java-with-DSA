# Interview Preparation Guide

This folder contains comprehensive interview preparation materials covering the most common technical interview topics in Data Structures and Algorithms.

## 🗂️ Topics Covered

### 1. **Arrays & Strings**
   - Two pointers, sliding window
   - Prefix sums, difference arrays
   - Matrix problems
   - String manipulation

### 2. **Linked Lists**
   - Singly and doubly linked lists
   - Fast and slow pointers
   - Cycle detection
   - Merging and reversing

### 3. **Stacks & Queues**
   - Monotonic stacks/queues
   - Next greater/smaller elements
   - Valid parentheses
   - Queue implementations

### 4. **Trees & Binary Trees**
   - Tree traversals (DFS, BFS)
   - Binary search trees
   - Lowest common ancestor
   - Tree construction from traversals

### 5. **Graphs**
   - DFS and BFS
   - Shortest paths (Dijkstra, Bellman-Ford)
   - Topological sort
   - Cycle detection

### 6. **Dynamic Programming**
   - 0/1 Knapsack
   - Longest common subsequence
   - Matrix chain multiplication
   - Coin change problems

### 7. **Greedy Algorithms**
   - Activity selection
   - Huffman coding
   - Fractional knapsack
   - Job scheduling

### 8. **Backtracking**
   - N-Queens problem
   - Sudoku solver
   - Subset generation
   - Permutations and combinations

### 9. **Bit Manipulation**
   - Power of 2 checks
   - Single number problems
   - Bit masking
   - XOR operations

### 10. **System Design Basics**
   - Load balancing
   - Caching strategies
   - Database design
   - API design principles

## 📊 Problem Categories by Difficulty

### Easy Problems (Must-do)
- Two Sum
- Valid Parentheses
- Merge Two Sorted Lists
- Maximum Subarray
- Climbing Stairs
- Best Time to Buy and Sell Stock
- Contains Duplicate
- Linked List Cycle
- Reverse Linked List

### Medium Problems (Practice thoroughly)
- 3Sum
- Longest Substring Without Repeating Characters
- Container With Most Water
- Generate Parentheses
- Merge K Sorted Lists
- Binary Tree Level Order Traversal
- Word Ladder
- Course Schedule
- Longest Palindromic Substring

### Hard Problems (For advanced practice)
- Median of Two Sorted Arrays
- Regular Expression Matching
- Merge K Sorted Lists (follow-up)
- Trapping Rain Water
- Word Ladder II
- N-Queens II
- Serialize and Deserialize Binary Tree
- Largest Rectangle in Histogram

## 🎯 Interview Tips

### 1. **Communication is Key**
- Explain your thought process clearly
- Ask clarifying questions
- Discuss multiple approaches
- Analyze time/space complexity

### 2. **Problem Solving Framework**
1. **Understand the problem** - Ask questions, clarify constraints
2. **Identify patterns** - Relate to known problems
3. **Choose approach** - Discuss trade-offs
4. **Implement solution** - Write clean, bug-free code
5. **Test thoroughly** - Edge cases, boundary conditions

### 3. **Common Interview Patterns**

#### Arrays & Strings
- **Two Pointers**: Container with most water, 3Sum
- **Sliding Window**: Maximum sum subarray, longest substring
- **Prefix Sum**: Range sum queries, subarray sum equals k

#### Linked Lists
- **Fast & Slow Pointers**: Cycle detection, middle of list
- **Dummy Nodes**: Merging lists, removing nodes
- **Reversal**: Reverse in groups, palindrome check

#### Trees
- **DFS**: Path sum, maximum depth, valid BST
- **BFS**: Level order, minimum depth, right side view
- **Traversal**: Inorder, preorder, postorder variations

#### Graphs
- **DFS/BFS**: Connected components, islands, word ladder
- **Topological Sort**: Course schedule, alien dictionary
- **Shortest Path**: Dijkstra, Bellman-Ford variations

### 4. **Time Management**
- Easy: 15-20 minutes
- Medium: 25-35 minutes
- Hard: 40-50 minutes
- Leave time for testing and optimization

### 5. **Red Flags**
- Not asking clarifying questions
- Jumping straight to coding
- Poor variable names
- Not handling edge cases
- Not analyzing complexity

## 🛠️ Coding Best Practices

### 1. **Clean Code**
```java
// Good: Clear variable names, comments
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}
```

### 2. **Handle Edge Cases**
```java
public boolean isValid(String s) {
    if (s == null || s.length() == 0) return true;
    if (s.length() % 2 != 0) return false;

    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) return false;
            char top = stack.pop();
            if (!isMatchingPair(top, c)) return false;
        }
    }
    return stack.isEmpty();
}
```

### 3. **Time/Space Complexity Analysis**
```java
// O(n) time, O(1) space (excluding output)
public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    // Left products
    result[0] = 1;
    for (int i = 1; i < n; i++) {
        result[i] = result[i-1] * nums[i-1];
    }

    // Right products
    int right = 1;
    for (int i = n-1; i >= 0; i--) {
        result[i] *= right;
        right *= nums[i];
    }

    return result;
}
```

## 📚 Company-specific Preparation

### **FAANG Companies**
- Focus on system design
- Deep understanding of algorithms
- Optimization questions
- Large-scale problem solving

### **Product Companies** (Google, Facebook, etc.)
- Data structures mastery
- Problem-solving skills
- Coding efficiency
- Behavioral questions

### **Service Companies** (Amazon, Microsoft)
- Core CS fundamentals
- Practical coding skills
- System design basics
- Leadership principles

## 🔄 Mock Interview Practice

### 1. **Weekly Schedule**
- Monday: Arrays & Strings (2 hours)
- Tuesday: Linked Lists & Trees (2 hours)
- Wednesday: Graphs & DP (2.5 hours)
- Thursday: System Design (1.5 hours)
- Friday: Mock Interview (1 hour)
- Weekend: Weak topic revision (2 hours)

### 2. **Progress Tracking**
- Maintain a problem log
- Track weak areas
- Review mistakes regularly
- Focus on improvement

### 3. **Resources**
- LeetCode (300+ problems)
- GeeksforGeeks
- HackerRank
- CodeSignal
- Pramp (free mock interviews)

## 🎯 Success Metrics

### Target Scores
- LeetCode: 150+ easy, 100+ medium, 20+ hard
- Consistent problem-solving speed
- 85%+ accuracy in practice
- Clear communication in mock interviews

### Interview Performance
- Explain approach clearly
- Code without major bugs
- Handle follow-up questions
- Demonstrate problem-solving skills

## 🚀 Final Preparation Checklist

### 1 Week Before Interview
- [ ] Review all major algorithms
- [ ] Practice 2-3 mock interviews
- [ ] Review system design basics
- [ ] Prepare questions for interviewer
- [ ] Get good night's sleep

### Day Before Interview
- [ ] Light practice (1-2 easy problems)
- [ ] Review resume and projects
- [ ] Prepare professional attire
- [ ] Relax and build confidence

### Interview Day
- [ ] Arrive 10-15 minutes early
- [ ] Be confident and communicative
- [ ] Ask questions when stuck
- [ ] Thank interviewer afterward

## 📞 Follow-up

### After Interview
- Send thank-you email within 24 hours
- Reflect on performance
- Continue practicing weak areas
- Prepare for next interviews

### Rejection Handling
- Don't take it personally
- Ask for feedback if possible
- Identify improvement areas
- Keep practicing and applying

## 💡 Mindset

- **Growth Mindset**: Every interview is learning opportunity
- **Consistency**: Practice daily, not just before interviews
- **Patience**: Getting a job takes time and multiple attempts
- **Confidence**: You got this! Keep pushing forward

Remember: Interview preparation is a marathon, not a sprint. Stay consistent, keep learning, and you'll succeed! 🚀
