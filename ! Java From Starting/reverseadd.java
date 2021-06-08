public class reverseadd {
    public static void main(String[] args) {
        String element = "THE";
        String join = "";
        String outputFinal;
        char[] try1 = element.toCharArray();
 
        for (int i = try1.length - 2; i >= 0; i--){
            join = join + try1[i];
        }
        outputFinal = element + join;
        System.out.println(outputFinal);
    }
}
        

