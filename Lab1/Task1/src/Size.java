import java.util.Objects;

public class Size {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public Size(){
        this(0, 0);
    };

    public Size(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return length == size.length && width == size.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return String.format("Length: %s; Width: %s", length, width);
    }
}
