public class ht6_2_3 {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean isLove = false;
//    if(flower1 % 2 == 0 && flower2 % 2 != 0) {
//        isLove = true;
//    } else if(flower2 % 2 == 0 && flower1 % 2 !=0) {
//        isLove = true;
//    } else {
//        isLove = false;
//    } return isLove;
//    }
//
//    public static void main(String[] args) {
//        boolean isLove = isLove (8, 7);
//        System.out.println(isLove);
//    }             if(
        if((flower1 + flower2) % 2 ==1) {
            isLove = true;
        }
        return isLove;
    }

    public static void main(String[] args) {
        System.out.println(isLove(6, 6));
    }

}
