Here is a Java console application that finds the intersection node of two singly linked lists:

```java
import java.util.HashSet;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head1 = null, head2 = null;
        System.out.println("Enter the number of nodes in the first linked list:");
        int n1 = scanner.nextInt();
        System.out.println("Enter the elements of the first linked list:");
        if(n1 > 0) {
            head1 = new Node(scanner.nextInt());
            Node temp = head1;
            for(int i = 1; i < n1; i++) {
                temp.next = new Node(scanner.nextInt());
                temp = temp.next;
            }
        }

        System.out.println("Enter the number of nodes in the second linked list:");
        int n2 = scanner.nextInt();
        System.out.println("Enter the elements of the second linked list:");
        if(n2 > 0) {
            head2 = new Node(scanner.nextInt());
            Node temp = head2;
            for(int i = 1; i < n2; i++) {
                temp.next = new Node(scanner.nextInt());
                temp = temp.next;
            }
        }

        Node intersectNode = getIntersectionNode(head1, head2);
        if(intersectNode == null) {
            System.out.println("No intersection node found.");
        } else {
            System.out.println("Intersection node is: " + intersectNode.data);
        }
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        HashSet<Node> nodesInB = new HashSet<Node>();

        while (headB != null) {
            nodesInB.add(headB);
            headB = headB.next;
        }

        while (headA != null) {
            if (nodesInB.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }
}
```

This program first takes the number of nodes and elements of two linked lists as input. Then it finds the intersection node of the two linked lists using the `getIntersectionNode` method. If an intersection node is found, it prints the data of the intersection node. Otherwise, it prints "No intersection node found.".