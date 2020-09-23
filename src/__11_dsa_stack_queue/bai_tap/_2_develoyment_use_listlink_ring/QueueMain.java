package __11_dsa_stack_queue.bai_tap._2_develoyment_use_listlink_ring;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(0);
        System.out.println(queue.dislayQueue());
        queue.enQueue(1);
        System.out.println(queue.dislayQueue());
        queue.enQueue(2);
        System.out.println(queue.dislayQueue());
        queue.enQueue(3);
        System.out.println(queue.dislayQueue());
        queue.deQueue();
        System.out.println(queue.dislayQueue());
    }
}
