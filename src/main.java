public class main {
    public static void main(String[] args)
    {
        String[][] words2 = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Algorithm2DArrays.findStringsOfLength(words2, 3));
        System.out.println(Algorithm2DArrays.findStringsOfLength(words2, 4));

        System.out.println(Algorithm2DArrays.findStringsOfLength(words2, 6));


    }

}


