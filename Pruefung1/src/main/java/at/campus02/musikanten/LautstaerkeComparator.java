package at.campus02.musikanten;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator <Musikant> {


    @Override
    public int compare(Musikant o1, Musikant o2) {
        return Double.compare(o2.spieleMusik(), o1.spieleMusik());
    }
}
