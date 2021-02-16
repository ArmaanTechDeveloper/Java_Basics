class phone {
    public void call() {
        System.out.println(" calling ... ");
    }

    public void keypad() {
        System.out.println(" Typing via keypad ... ");
    }
}

class smartphone extends phone {

    @Override
    public void call() {
        System.out.println(" calling via smartphone ....");
    }

    public void music() {
        System.out.println(" Playing music ... ");
    }
}

public class dynamic_dispatch {
    public static void main(String[] args) {
        phone ob = new smartphone(); // phone utha do na asal main hai ek smartphone
        ob.call(); // calling is done by smartphone because smartphone is better version of phone
        ob.keypad();
        // ob.music(); // throws an error because all phones are not smartphones
    }
}