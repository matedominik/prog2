class Stack {
    int stack[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }
    
    void push(int val) {
        if(tos == 9)
            System.out.println("Stack is full");
        else
            stack[++tos] = val;
    }

    int pop() {
        if(tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stack[--tos];
    }
}

class StackTest {
    public static void main(String[] args) {

        Stack st1 = new Stack();

        for(int i = 0; i < 10; ++i) st1.push(i);

        for(int i = 0; i < 10; ++i)
            System.out.println(st1.pop());
    }
}
