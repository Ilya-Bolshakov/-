import java.util.Objects;

public class Door extends HouseObject implements CloseableToKey {

    private boolean isClosed;

    public Door() {
        this(0,0);
    }

    public Door(boolean isClose) {
        this(0, 0);
        isClosed = isClose;
    }

    public Door(int length, int width) {
        this.size = new Size(length, width);
    }

    public void closeToKey() {
        isClosed = true;
    }

    public void openToKey() {
        this.isClosed = false;
    }

    public boolean doorIsClosed() {
        return isClosed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return isClosed == door.isClosed && size.equals(door.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isClosed, size);
    }

    @Override
    public String toString() {
        return "Door{" +
                "isClosed=" + isClosed +
                ", size=" + size +
                '}';
    }

    @Override
    public int compareTo(Size o) {
        return this.size.compareTo(o);
    }
}
