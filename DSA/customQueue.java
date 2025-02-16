package DSA;

public class customQueue {
    protected int[] data;
    private static final int defaultSize = 10;

    int end = 0;

    public customQueue(){
        this(defaultSize);
    }

    public customQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        if(end == data.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(end == 0){
            return true;
        }
        return false;
    }

    public void insert(int n){
        if(isFull()){
            int[] temp = new int[data.length * 2]; // create an temp aray of double the size

            for(int i=0;i<data.length;i++){ // copy all the elements to temp array
                temp[i] = data[i];
            }

            data = temp; // assign temp to data array
            data[end] = n;
            end++;
        }
        else{
            data[end] = n;
            end++;
        }
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        else{
            int removed = data[0];
            for(int i=1;i<data.length;i++){
                data[i-1] = data[i];
            }
            end--;
            return removed;
        }
    }

    public int front(){
        return data[0];
    }

    public void display(){
        System.out.print("The Queue:");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }


}

class queue{
    public static void main(String[] args) throws Exception {
        customQueue queue = new customQueue(5);
        queue.insert(12);
        queue.insert(22);
        queue.insert(32);
        queue.insert(42);
        queue.insert(52);
        queue.insert(62);
        queue.insert(72);
        

        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        queue.display();
        System.out.println(queue.front());
    }
}


