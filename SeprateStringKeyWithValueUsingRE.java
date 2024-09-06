package in.ganesh.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeprateStringKeyWithValueUsingRE {
    public static void main(String[] args) {
        String input = "DBB20071213\nFNKYLIE\nLNAMBROSE\nIDA516-5010-2954\nEXP03132028\nDCGCAN";

        // Define the regex pattern for each field
        String regex = "DBB(\\d+)\nFN(\\w+)\nLN(\\w+)\nIDA(\\d+-\\d+-\\d+)\nEXP(\\d+)\nDCG(\\w+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            // Extract the fields using the groups
            String dbb = matcher.group(1);
            String fn = matcher.group(2);
            String ln = matcher.group(3);
            String id = matcher.group(4);
            String exp = matcher.group(5);
            String dcg = matcher.group(6);

            // Print the separated fields
            System.out.println("DBB: " + dbb);
            System.out.println("FN: " + fn);
            System.out.println("LN: " + ln);
            System.out.println("ID: " + id);
            System.out.println("EXP: " + exp);
            System.out.println("DCG: " + dcg);
        } else {
            System.out.println("No match found");
        }

    }
}
