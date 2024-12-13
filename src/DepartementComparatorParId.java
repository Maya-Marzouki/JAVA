import java.util.Comparator;

public class DepartementComparatorParId implements Comparator<Departement> {
    public int compare(Departement d1, Departement d2) {
        return d1.getId() - d2.getId();
    }
}
