interface IntStack {
    void push(int item);
    int pop();
}

class DynStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new stck[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length-1){
            int temo[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++)
                temp[i] stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {

        DynStack fsl = new DynStack(5);

        for (int i = 0; i < 15; i++) fsl.push(i);

        for (int i = 0; i < 15; i++)
            System.out.println(fsl.pop());
    }
}