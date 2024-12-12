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