package Day2;

public class Day2Part1 {

    private Integer finalSum = 0;

    public static void main(String[] args) {
        Day2Part1 d2p1 = new Day2Part1();
        d2p1.stringSplitter();
    }

    private void stringSplitter(){
        puzzleInput puzzleInput = new puzzleInput();
        String[] result = puzzleInput.puzzleInput().split("[\\n+]");
        for (String s : result){
            int smallestValue = 0;
            int biggestValue = 0;
            String[] internalResult = s.split("\\s+");
            for (String internalS : internalResult){
                if (internalS == internalResult[0]){
                    smallestValue = Integer.valueOf(internalS);
                    biggestValue = Integer.valueOf(internalS);
                }
                int valueCheck = Integer.valueOf(internalS);
                if (valueCheck < smallestValue){
                    smallestValue = valueCheck;
                    continue;
                }else if (valueCheck > biggestValue){
                    biggestValue = valueCheck;
                    continue;
                }else{}
            }
            int differenceValue = biggestValue - smallestValue;
            finalSum += differenceValue;
            System.out.println("Biggest Value :" + biggestValue + "Smallest Value :" + smallestValue);
        }
        System.out.println(finalSum);
    }

}
