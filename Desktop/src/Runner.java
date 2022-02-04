public class Runner {

    public static void main(String[] args) {
        SelfCounter selfCounter1 = new SelfCounter();
        SelfCounter selfCounter2 = new SelfCounter();
        SelfCounter selfCounter3 = new SelfCounter();
        SelfCounter selfCounter4 = new SelfCounter();
        SelfCounter selfCounter5 = new SelfCounter();
        System.out.println(SelfCounter.counter);


        List<Integer> list = new List<>();
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        list.addFront(4);
        list.addFront(5);
        list.printList();
        System.out.println("List size: " + list.size());
        System.out.println("List element by value: " + list.getByValue(3).intValue());
        System.out.println("List element by index: " + list.getByIndex(2).intValue());

    }

}
