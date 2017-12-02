package Day2;

public class Day2Part2 {

    private Double finalSum = 0.0;

    public static void main(String[] args) {
        Day2Part2 d2p2 = new Day2Part2();
        d2p2.stringModulus();
    }

    private void stringModulus(){
        puzzleInput puzzleInput = new puzzleInput();
        String[] result = puzzleInput.puzzleInput().split("[\\n+]");
        for (String s : result){
            String[] internalResult = s.split("\\s+");
            for (String loopInternal : internalResult){
                for (String loopInternal2 : internalResult){
                    if (loopInternal == loopInternal2){ continue;}
                    else {
                        Double remainder = Double.valueOf(loopInternal) / Double.valueOf(loopInternal2);
                        if (remainder % 1 == 0){
                            System.out.println(loopInternal + " divided by " + loopInternal2 + " is " + remainder);
                            finalSum += remainder;
                        }
                    }
                }
            }
        }
        System.out.println("Final Sum : " + finalSum);
    }
}
