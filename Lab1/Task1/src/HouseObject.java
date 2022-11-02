public abstract class HouseObject implements Comparable<Size> {

    protected Size size;
    public int compareTo(HouseObject c2) {
        return this.size.compareTo(c2.size);
    }
}
