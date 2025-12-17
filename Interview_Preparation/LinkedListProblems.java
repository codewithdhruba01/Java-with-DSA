class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListProblems {
    // 1. Reverse Linked List - Easy
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    // 2. Merge Two Sorted Lists - Easy
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    // 3. Linked List Cycle Detection - Easy
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    // 4. Remove Nth Node From End - Medium
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Advance first pointer by n+1 steps
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the node
        second.next = second.next.next;
        return dummy.next;
    }

    // 5. Add Two Numbers - Medium
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    // 6. Intersection of Two Linked Lists - Easy
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    // 7. Palindrome Linked List - Easy
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverseList(slow.next);
        ListNode firstHalf = head;

        // Compare
        ListNode p1 = firstHalf, p2 = secondHalf;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) result = false;
            p1 = p1.next;
            p2 = p2.next;
        }

        // Restore original list (optional)
        slow.next = reverseList(secondHalf);
        return result;
    }

    // 8. Remove Duplicates from Sorted List - Easy
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // 9. Rotate List - Medium
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Find length
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Make it circular
        current.next = head;

        // Find new head position
        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // 10. Merge K Sorted Lists - Hard
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        return mergeKListsHelper(lists, 0, lists.length - 1);
    }

    private ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];

        int mid = start + (end - start) / 2;
        ListNode left = mergeKListsHelper(lists, start, mid);
        ListNode right = mergeKListsHelper(lists, mid + 1, end);

        return mergeTwoLists(left, right);
    }

    // Helper method to print linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListProblems solver = new LinkedListProblems();

        // Create test list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        solver.printList(head);

        // Test reverse
        ListNode reversed = solver.reverseList(head);
        System.out.println("Reversed list:");
        solver.printList(reversed);

        // Test palindrome (need to recreate list)
        ListNode palindromeList = new ListNode(1);
        palindromeList.next = new ListNode(2);
        palindromeList.next.next = new ListNode(2);
        palindromeList.next.next.next = new ListNode(1);

        System.out.println("Is palindrome: " + solver.isPalindrome(palindromeList));

        // Test cycle detection
        ListNode cycleList = new ListNode(1);
        cycleList.next = new ListNode(2);
        cycleList.next.next = new ListNode(3);
        cycleList.next.next.next = cycleList.next; // Create cycle

        System.out.println("Has cycle: " + solver.hasCycle(cycleList));
    }
}
