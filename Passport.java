import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Passport {
    private int number;
    private String fullName;
    private String position;
    private boolean accessAllowed;

    public Passport(int number, String fullName, String position, boolean accessAllowed) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
        this.accessAllowed = accessAllowed;
    }

    public int getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public boolean isAccessAllowed() {
        return accessAllowed;
    }

    @Override
    public String toString() {
        return fullName + ", " + number + ", " + position + ", " + accessAllowed;
    }
}
