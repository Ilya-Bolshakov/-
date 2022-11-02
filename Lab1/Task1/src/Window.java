import java.util.Objects;

public class Window extends HouseObject implements CloseableToKey {
    private boolean isClosed;


    public Window() {
        this(0,0);
        isClosed = false;
    }
    public Window(boolean isClose) {
        this(0,0);
        isClosed = isClose;
    }

    public Window(int length, int width) {
        this.size = new Size(length, width);
    }

    public void closeToKey() {
        isClosed = true;
    }

    public void openToKey() {
        this.isClosed = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return isClosed == window.isClosed && size.equals(window.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, isClosed);
    }

    @Override
    public String toString() {
        return "Window{" +
                "size=" + size +
                ", isClosed=" + isClosed +
                '}';
    }

    @Override
    public int compareTo(Size o) {
        return this.size.compareTo(o);
    }
}
