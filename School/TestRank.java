import java.util.Scanner;

class Record {
    Scanner sc = new Scanner(System.in);
    String name[] = new String[3];
    int mk[] = new int[3];

    Record() {};

    void readValues() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name ! ");
            this.name[i] = sc.next();
            System.out.println("Enter the rank of the student enter above ! ");
            this.mk[i] = sc.nextInt();
        }
    }

    void display() {
        for (int i = 0; i < name.length; i++) {
            System.out.println(" Name :  " + name[i] + "  Rank :  " + mk[i]);
        }
    }
}

class Rank extends Record{
    int index;
    void highest(){
        int temphigh = mk[0];
        for (int i = 0; i < name.length; i++){
            if(temphigh > mk[i]){
                temphigh = mk[i];
                this.index = i;
            }
        }
    }
    void display(){
        System.out.println(" Highest Rank : "+mk[index]+" name : "+name[index]);
        super.display();
    }
}

public class TestRank{
    public static void main(String[] args) {
        Rank ob = new Rank();
        ob.readValues();
        ob.highest();
        ob.display();
    }
}