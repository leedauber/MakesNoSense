public class B {
    protected int data;

    public B() {
        this(0);
    }

    public B(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new String("Value of data in B is: " + Integer.toString(data));
    }
}