package org.example.applications;

import org.example.CircularQueue;
import org.example.LinkedCircularQueue;

public class JosephusProblem {
    public static <E> E solve(E[] participants, int k) {
        if (participants.length == 0)
            return null;
        CircularQueue<E> queue = buildQueue(participants);
        while (queue.size() > 1) {
            for (int i = 0; i < k-1; i++) {
                queue.rotate();
            }
            queue.dequeue();
        }
        return queue.dequeue();
    }
    private static <E> CircularQueue<E> buildQueue(E[] array) {
        CircularQueue circularQueue = new LinkedCircularQueue();
        for (E e : array) {
            circularQueue.enqueue(e);
        }
        return circularQueue;
    }
}

