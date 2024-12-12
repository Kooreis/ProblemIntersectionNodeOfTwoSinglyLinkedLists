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