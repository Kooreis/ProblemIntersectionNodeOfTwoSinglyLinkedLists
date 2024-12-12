def getIntersectionNode(headA, headB):
    if headA is None or headB is None:
        return None

    a = headA
    b = headB

    while a is not b:
        a = headB if a is None else a.next
        b = headA if b is None else b.next

    return a