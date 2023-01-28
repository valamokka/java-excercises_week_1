import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<int[]> testArrays = List.of(new int[]{1,2,2,2,2}, new int[]{-1,2,22,2,-2}, new int[]{-4,2,22,2,-2}, new int[]{4,2,22,2,2}, new int[5]);
        List<Integer> testResults = List.of(1, -1, 0, 0, 0);

        for (int i = 0; i < testArrays.size(); i++) {
            if (findTheOdd(testArrays.get(i)) == testResults.get(i)) {
                System.out.println("A(z) " + (i+1) + ". teszten átment a kódod. Gratulálok!");
            } else {
                System.out.printf("A(z) %d. teszten elbukott a kódod. A helyes megoldás: %d, a te megoldásod: %d%n",
                        i+1, testResults.get(i), findTheOdd(testArrays.get(i)));
            }
        }


    }

    public static int findTheOdd(int[] numberArray) {
	if (numberArray.length == 0) {
	    return 0;
	}

        int odd = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 != 0) {
                if (odd == 0) {
                    odd = numberArray[i];
                } else {
                    return 0;
                }
            }
        }
        return odd;
    }
}
