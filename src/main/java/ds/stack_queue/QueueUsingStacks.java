package ds.stack_queue;

import java.util.Stack;

/** Created by HARISH on 11- 07- 2020 */
public class QueueUsingStacks {
  private Stack<String> s1 = new Stack<>();
  private Stack<String> s2 = new Stack<>();

  public static void main(String[] args) {
    QueueUsingStacks queue = new QueueUsingStacks();
    queue.put("A");
    queue.put("B");
    queue.put("C");

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

  public void put(String s) {
    s1.push(s);
  }

  public String poll() {
    if (s1.isEmpty()) {
      throw new NullPointerException("Queue is Empty");
    }
    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }
    String s = s2.pop();
    while (!s2.isEmpty()) {
      s1.push(s2.pop());
    }
    return s;
  }

  public boolean isEmpty() {
    return s1.isEmpty();
  }

  public int size() {
    return s1.size();
  }
}
