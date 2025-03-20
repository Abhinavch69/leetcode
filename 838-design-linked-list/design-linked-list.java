class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Get the value of the node at a given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Invalid index
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    // Add a node at the head of the list
    public void addAtHead(int val) {
        head = new Node(val, head);
        size++;
    }

    // Add a node at the tail of the list
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        size++;
    }

    // Add a node at a specific index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return; // Invalid index
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(val, temp.next);
        size++;
    }

    // Delete a node at a specific index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return; // Invalid index
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    // Print the linked list (for debugging purposes)
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
