public class Main {
    public static void main(String[] args) {

//        Block block = new Block (new int[] {2, 4, 6});
//
//        int length = block.getLength();
//        System.out.println("Length: " + length);
//
//        int width = block.getWidth();
//        System.out.println("Width: " + width);
//
//        int height = block.getHeight();
//        System.out.println("Height: " + height);
//
//        int volume = block.getVolume();
//        System.out.println("Volume: " + volume);
//
//        int surfaceArea = block.getSurfaceArea();
//        System.out.println("Surface Area: " + surfaceArea);

        Fighter fighter1 = new Fighter ("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);

        String winner = DeclareWinner.declareWinner(fighter1, fighter2, "Lew");
        System.out.println(winner);

    }


}
