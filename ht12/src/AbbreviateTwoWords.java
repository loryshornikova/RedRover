public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String [] names = name.split(" ");
        char first = names[0].charAt(0);
        char second = names[1].charAt(0);
        first = Character.toUpperCase(first);
        second = Character.toUpperCase(second);
        return first + "." + second;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("larysa Shornikova"));
    }
}

