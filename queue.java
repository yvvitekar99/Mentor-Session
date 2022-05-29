class Queue {
       static int arr[];
       static int size;
       static int rear;
 
       Queue(int size) {
           this.size = size;
           arr = new int[size];
           rear = -1;
       }
 
       public static boolean isEmpty() {
           return rear == -1;
       }
 
       public static boolean isFull() {
           return rear == size-1;
       }
 
       public static void enqueue(int data) {
           if(isFull()) {
               System.out.println("Overflow");
               return;
           }
 
           arr[++rear] = data;
       }
 
    
       public static int dequeue() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
           int front = arr[0];
           for(int i=0; i<rear; i++) {
               arr[i] = arr[i+1];
           }
              rear--;
           return front;
       }
 
       public static int front() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
          
           return arr[0];
       }

   }
