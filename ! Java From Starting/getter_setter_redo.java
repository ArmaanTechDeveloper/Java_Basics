class getset {
    private int length;
    private int breadth;

    public void setLength(int l) {
        this.length = l;
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int b) {
        this.breadth = b;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class getter_setter_redo {
    public static void main(String[] args) {
        getset ob = new getset();
        ob.setLength(20);
        ob.setBreadth(10);
        System.out.println(" The length entered is : " + ob.getLength());
        System.out.println(" The breadth entered is : " + ob.getBreadth());
    }
}
