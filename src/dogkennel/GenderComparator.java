package dogkennel;

import java.util.Comparator;

public class GenderComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
