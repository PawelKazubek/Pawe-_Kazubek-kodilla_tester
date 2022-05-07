package lists.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWidth;
    private double stampHeight;
    private double stampSize;
    private boolean stamped;

    public Stamp(String stampName, double stampHeight, double stampWidth) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
    }
    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize = stampWidth * stampHeight;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0
                && Double.compare(stamp.stampHeight, stampHeight) == 0
                && Double.compare(stamp.stampSize, stampSize) == 0
                && stamped == stamp.stamped
                && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight, stampSize, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", stampSize=" + stampSize +
                ", stamped=" + stamped +
                '}';
    }
}
