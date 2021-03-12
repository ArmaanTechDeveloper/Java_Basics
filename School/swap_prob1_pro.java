public class swap_prob1_pro {
    public String swappairs(String word) {
        int LengthOfWord = word.length();
        String FinalWord = "";

        if (LengthOfWord % 2 != 0) {

            for (int i = 0; i < LengthOfWord -1 ; i = i+2) {

                char ch1 = word.charAt(i + 1);
                FinalWord = FinalWord + Character.toString(ch1);
                char ch2 = word.charAt(i);
                FinalWord = FinalWord +Character.toString(ch2);
                if(ch2 == ' '){
                    FinalWord = FinalWord+" ";
                }

            }
        }
        return FinalWord;
    }

    public static void main(String[] args) {
        swap_prob1_pro ob = new swap_prob1_pro();

        System.out.println(ob.swappairs("hello there"));
    
    }
}
