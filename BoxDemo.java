class Box {
    double width;
    double height;
    double length;

    Box() {
        width = 0;
        height = 0;
        length = 0; 
    }

    Box(Box ob) {
        this.length = ob.length;
        this.width = ob.width;
        this.height = ob.height;
    }

    Box(double len) {
        length = width = height = len; 
    }

    Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    double volume() {
        return width * height * length;
    }

    void setDim(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }

    void setDim(double len) {
        width = length = height = len;
    }
}

class BoxDemo {

    public static void main(String[] args) {

        Box myBox1 = new Box();
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.length = 30;

        double vol = myBox1.volume();

        System.out.println("myBox1 Volume is " + vol);

        Box myBox2 = new Box(myBox1);
        System.out.println("myBox2 Volume is " + myBox2.volume());

        Box myBox3 = new Box(10.0);
        System.out.println("myBox3 Volume is " + myBox3.volume());
            
        Box myBox4 = new Box(10.0, 20.0, 30.0);
        System.out.println("myBox4 Volume is " + myBox4.volume());

        myBox4.setDim(10.0);
        System.out.println("myBox4 Volume is " + myBox4.volume());

        myBox4.setDim(10.0, 15.0, 20.0);
        System.out.println("myBox4 Volume is " + myBox4.volume());
    }
}