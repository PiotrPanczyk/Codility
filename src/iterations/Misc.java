package iterations;

public class Misc {
    public static void main (String[] args){
        System.out.println(findMaxOddNumInRange(3, 11));
    }

    private static int findMaxOddNumInRange(int rangeStart, int rangeEnd){
        int maxOddNum = 0;
        for(int i  = rangeStart; i < rangeEnd; i++){
            if(i % 2 != 0)
                maxOddNum = i;
        }
        return maxOddNum;
    }
}
