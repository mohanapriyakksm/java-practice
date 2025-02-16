package DSA;

public class customStack {
    protected int[] data;
    private static final int defaultSize = 10;

    int ptr = -1;

    public customStack(){
        this(defaultSize);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public void push(int n){
        if(isFull()){  // make the stack dynamic // tc-> O(N)
           
            int[] temp = new int[data.length * 2]; // create an temp aray of double the size

            for(int i=0;i<data.length;i++){ // copy all the elements to temp array
                temp[i] = data[i];
            }

            data = temp; // assign temp to data array
            ptr++;
            data[ptr] = n;
        }
        ptr++;
        data[ptr] = n;
    }

    public int pop() throws Exception {
        if(isEmpty()){
           throw new Exception ("Stack is empty, can not pop!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        // return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception ("Stack is empty,can not peek!");
         }
         return data[ptr];
    }

    public void display(){
        System.out.print("The Stack:");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public boolean isFull(){
        if(ptr == data.length - 1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }

}

class stack{
    public static void main(String[] args) throws Exception {
        customStack stack = new customStack(5);
        stack.push(12);
        stack.push(26);
        stack.push(42);
        stack.push(56);
        stack.push(28);
        stack.push(38);

        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        stack.display();
        System.out.println(stack.peek());
    }
}

