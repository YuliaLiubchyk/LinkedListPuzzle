public class FindInfiniteLoop {
    /**
     * You are asked that if you have a linked list
     * in which you can traverse only in one direction,
     * and if that linked list has a loop in it, how you will detect it
     * */

    private static boolean doesLoopExist(Node head){
        //write code here!
        return true;
    }

    public static void main(String args[]) {
        Node headWithoutLoop = null;
        for (int i = 10; i > 0; i--) {
            headWithoutLoop = new Node(" " + null, headWithoutLoop);
        }

        System.out.println("Loop Existence : " + doesLoopExist(headWithoutLoop));
        //create loop
        headWithoutLoop.next.next.next.next.next = headWithoutLoop;

        System.out.println("Loop Existence : " + doesLoopExist(headWithoutLoop));
    }
}
