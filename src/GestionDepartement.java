import java.util.Set;
import java.util.TreeSet;

public class GestionDepartement implements IDepartement<Departement>{

    Set<Departement> departements;

    @Override
    public void ajouterDepartement(Departement departement) {
        //HashCode & equals
        departements.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        //HashCode & equals
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        //HashCode & equals
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        //toString
        System.out.println(departements);

    }

    @Override
    public Set<Departement> trierDepartementById() {
//        //compareTo on va trier selon la methode
//        Set<Departement> tree = new TreeSet<Departement>();
//        tree.addAll(departements);
//        return tree;

        //compare
        Set<Departement> tree = new TreeSet<>(new DepartementComparatorParId());
        tree.addAll(departements);
        return tree;

    }
}
