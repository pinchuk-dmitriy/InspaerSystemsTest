public class List<T> {

    Node<T> head;
    Node<T> lastNode;

    public static int size = 0;

    public void addFront(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;

        if(this.head == null) {
            head = newNode;
            lastNode = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        changed();
    }

    public void addBack(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;

        if(this.head == null) {
            head = newNode;
        } else {
            lastNode.next = newNode;
        }
        lastNode = newNode;

        changed();
    }

    public void printList()
    {
        Node<T> node = this.head;
        while (node != null)
        {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public T getByValue(T value)
    {
        Node<T> node = this.head;
        while (node != null)
        {
            if(node.value.equals(value)) {
                return node.value;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    public T getByIndex(int index)
    {
        Node<T> node = this.head;
        int counter = 0;

        while (node != null)
        {
            if(counter == index) {
                return node.value;
            } else {
                node = node.next;
                counter++;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    private void changed(){
        System.out.println("List has been changed!");
        size++;
    }

    private class Node<T> {
        T value;
        Node<T> next;
    }
}
