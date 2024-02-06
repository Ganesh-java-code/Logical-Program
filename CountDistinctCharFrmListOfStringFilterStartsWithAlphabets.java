package in.ganesh.test;

import java.util.Arrays;
import java.util.List;

public class CountDistinctCharFrmListOfStringFilterStartsWithAlphabets {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle");
        names.forEach(str->{
            long countDistinctCharacters = countDistinctCharacters(str);
            System.out.println("String :: "+str);
            System.out.println("Distinct character count: " + countDistinctCharacters);
            System.out.println();
        });
    }
    private static long countDistinctCharacters(String str) {
        long count = 0;
        if(str.startsWith("aa")){
            count = str.chars().distinct().count();
        }
        return count;
    }
}
