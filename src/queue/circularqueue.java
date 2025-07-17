package queue;

public class circularqueue {
    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("queue is full");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
                size++;
                return;
            } else if (rear < arr.length - 1) {   // normal case
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("queue is empty");
            } else {
                int val = arr[front];
                if (front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("queue is empty");
            }
            return arr[front];
        }

        public boolean isempty() {
            if (size == 0) return true;
            return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println(" queue is empty");
                return;
            } else if (front < rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }

            }
        }
    }
    public static void main(String[] args)throws Exception  {
            Cqa  q = new Cqa();
            q.display();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.display();
        System.out.println();
        System.out.println(q.peek());
    }
}
