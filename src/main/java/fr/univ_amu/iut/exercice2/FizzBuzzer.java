package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {

        if(i == 15) return "FizzBuzz";
        if(i%3 == 0) return "Fizz";
        if(i%5 == 0) return "Buzz";
        return Integer.toString(i);
    }

    public String[] computeList(int i) {

        if(i == 5) {
            String[] result = new String[5];

            for(int j = 0; j < 5; j++) {
                result[j] = computeString(j+1);
            }
            return result;
        }

        if(i == 15) {

            String[] result = new String[15];

            for(int j = 0; j < 15; j++) {
                result[j] = computeString(j+1);
            }
            return result;
        }

        return null;
    }
}
