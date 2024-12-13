import java.util.Comparator;

public class EmployeComparatorParDep implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getDepartement().compareTo(o2.getDepartement());
    }
}
