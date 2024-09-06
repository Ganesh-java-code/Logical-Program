package in.ganesh.test;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String name = "abcdabcdpqr";
        char nonRepeatChar = nonRepeated(name);
        if ( nonRepeatChar != 0 ){
            System.out.println("non repeated character :: "+nonRepeatChar);
        }else{
            System.out.println("not found non repeated character :: ");
        }

    }

    private static char nonRepeated(String name) {
        int length = name.length();
        for (int i=0;i<length;i++){
            boolean isRepeated = false;
            for (int j=0;j<length;j++){
                if ( i!=j && name.charAt(i)==name.charAt(j) ){
                    isRepeated=true;
                    break;
                }
            }
            if ( !isRepeated ){
                return name.charAt(i);
            }
        }
        return 0;
    }
}

// java 8 approach
//String str = "JavaarticlesareAwesome";
//Map<Character, Long> mapCount = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
//Character c = mapCount.entrySet().stream().distinct().filter(value -> value.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
//System.out.println(c);