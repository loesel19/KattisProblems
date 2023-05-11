import java.util.Scanner;

public class Problems {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    }

    /**
     * This method will get the input dimensions
     * @param input : the system input scanner
     * @return : an integer array of length two containing N, the number of problems and Q, the number of actions on
     *              those problems
     */
    public int[] GetDeterminants(Scanner input){
        int[] arrDeterminants = new int[2];
        arrDeterminants[0] = input.nextInt();
        arrDeterminants[1] = input.nextInt();
        return arrDeterminants;
    }
}
