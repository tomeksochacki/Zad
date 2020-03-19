import java.util.Scanner;

public class Variable {

    public int getSum(int[] tab){
            return tab[0] + tab[1];
        }

        public static void main(String[] args) {
    Variable variable = new Variable();
    int[]tab = {2,1};
            System.out.println(variable.getSum(tab));


    }
}
