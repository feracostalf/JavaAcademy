package challenges.queuechallenge;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueChallenge {

    public QueueChallenge(){}

    public static void main(String[] args) {
        String word="civic";
        System.out.println("Is "+word +" a Paindrome: "+isPalindrome(word));
    }

    public static boolean isPalindrome(String word){
        ArrayDeque<String> queue=new ArrayDeque<>();
        Queue<String> listqueue=new LinkedList<>();

        for(String s:word.split("")){
            queue.add(s);
            listqueue.add(s);
        }

        while(!listqueue.isEmpty()){
            String fifo=listqueue.poll();
            String lifo=queue.pollLast();

            System.out.println("lifo: "+lifo+ " fifo: "+fifo );

            if(!lifo.equals(fifo)){
                return false;
            }

        }

        return true;

    }
    
}
