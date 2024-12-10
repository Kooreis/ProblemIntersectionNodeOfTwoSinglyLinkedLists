Here is a C# console application that finds the intersection node of two singly linked lists:

```C#
using System;
using System.Collections.Generic;

public class Node
{
    public int Value { get; set; }
    public Node Next { get; set; }
}

public class Program
{
    static void Main(string[] args)
    {
        Node node1 = new Node { Value = 1 };
        Node node2 = new Node { Value = 2 };
        Node node3 = new Node { Value = 3 };
        Node node4 = new Node { Value = 4 };
        Node node5 = new Node { Value = 5 };

        Node list1 = node1;
        node1.Next = node2;
        node2.Next = node3;

        Node list2 = node4;
        node4.Next = node5;
        node5.Next = node2;

        Node intersection = GetIntersection(list1, list2);

        if (intersection != null)
        {
            Console.WriteLine("The intersection node is: " + intersection.Value);
        }
        else
        {
            Console.WriteLine("There is no intersection node.");
        }
    }

    public static Node GetIntersection(Node headA, Node headB)
    {
        HashSet<Node> nodesInB = new HashSet<Node>();

        while (headB != null)
        {
            nodesInB.Add(headB);
            headB = headB.Next;
        }

        while (headA != null)
        {
            if (nodesInB.Contains(headA))
            {
                return headA;
            }

            headA = headA.Next;
        }

        return null;
    }
}
```

This program creates two linked lists that intersect at node2. It then calls the `GetIntersection` method to find the intersection node. The `GetIntersection` method uses a `HashSet` to store all nodes in the second list, then it iterates through the first list and returns the first node that also appears in the second list. If no such node exists, it returns `null`.