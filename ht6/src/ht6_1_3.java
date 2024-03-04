public class ht6_1_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        //найти сочетание символов "рит" и индекс первой "р", затем продолжить
        //поиск с того символа


        //s = s.toLowerCase();
        String lookFor = "рит";
        for (int i = 0; i < s.length() - lookFor.length(); i++) {
            String subStr = s.substring(i, i + lookFor.length());
            if (subStr.equalsIgnoreCase(lookFor)) {
                System.out.println(i);
            }

        }

    }
}

