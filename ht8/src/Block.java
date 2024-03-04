public class Block {
    int width;
    int length;
    int height;

    Block(int[] array) {
        width = array[0];
        length = array[1];
        height = array[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea ()
    {
        return (2 * length * width)  + (2 * length * height) + (2 * width * height);
    }

}
