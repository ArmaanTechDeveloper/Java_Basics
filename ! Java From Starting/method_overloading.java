public class method_overloading {
    // we can name the different methods with same name but we have to assign
    // different parameters
    // changing the void to int does not help : it should have different parameters
    // only
    // like this way
    static void comma() {
        System.out.println(" Good morning armaan ! Hope you have a good day ");
    }

    static void comma(int a) {
        System.out.println(" Good morning armaan " + a + " hope you hva a good day ");
    }

    static void comma(int a, int b) {
        System.out.println(" Good morning armaan " + a + " " + b + " hope you have a good day ");
    }
    static void string1(String x){
        x="INDIA";
    }

    public static void main(String[] args) {
        comma();
        int x = 20, y = 30;
        comma(x);
        comma(x, y);

        // lets try to change a string using a method 
        String a = "Armaan";
        string1(a);
        System.out.println(" The value of a after string 1 running is "+a);

        // Hence string does not changes after changing it in method hence string is not an object

    }
}
