public class ht6_2_6 {
    public static String countingSheep(int num) {
//        if (num <= 0) {
//            return "";
//        } else {
//            String sheep = "sheep...";
//            String result = null;
//            for (int i = 1; i <= num; i++) {
//                result = Integer.toString(i) + " " + sheep;
//                System.out.print(result);
//
//            }
//            return result;
//
//        }
//    }
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result + i + " " + "sheep...";

        }
         return result;
        }
    public static void main(String[] args) {
        System.out.println(countingSheep(5));

    }
}

//    StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <= num; i++) {
//                stringBuilder.append(i).append(" sheep...");
//                }
//                return stringBuilder.toString();
//                }