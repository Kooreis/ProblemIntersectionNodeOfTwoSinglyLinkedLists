Here is a Python console application that finds the intersection node of two singly linked lists:

```python
class Node:
    def __init__(self, x):
        self.val = x
        self.next = None

def getIntersectionNode(headA, headB):
    if headA is None or headB is None:
        return None

    a = headA
    b = headB

    while a is not b:
        a = headB if a is None else a.next
        b = headA if b is None else b.next

    return a

def printList(node):
    while node:
        print(node.val, end=" ")
        node = node.next
    print("\n")

if __name__ == "__main__":
    intersect_val = 8

    list1 = Node(4)
    list1.next = Node(1)
    list1.next.next = Node(intersect_val)
    list1.next.next.next = Node(4)
    list1.next.next.next.next = Node(5)

    list2 = Node(5)
    list2.next = Node(0)
    list2.next.next = Node(1)
    list2.next.next.next = list1.next.next

    print("List 1: ", end="")
    printList(list1)

    print("List 2: ", end="")
    printList(list2)

    intersect_node = getIntersectionNode(list1, list2)

    if intersect_node:
        print("Intersection at node with value: ", intersect_node.val)
    else:
        print("No intersection found")
```

This program first creates two linked lists with an intersection at a node with value 8. It then prints the two lists and the intersection node. If no intersection is found, it prints "No intersection found".