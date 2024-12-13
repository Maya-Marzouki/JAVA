import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {

//        for (Employe e : employes) {
//            if(e.equals(employe))
//                return true;
//        } //hedha lkol je le remplace par la methode contains
        //equals
        return employes.contains(employe) && employe.getNom().equals(employe.getNom());
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        //equals
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
//        for (Employe e : employes) {
//            //toString
//            System.out.println(e);
//        }
        //toString
        System.out.println(employes);  // BCH NESTAAMALHA LEZEM TKOUN AANDI CLASS toString fel classe Employe!!!

    }

    @Override
    public void trierEmployeParId() {
        //compareTo
        Collections.sort(employes);
//                           AUTRES FONCTIONS:
//        Collections.shuffle(employes);//nkhalathom(nmachkihom
//        Collections.swap(employes, 0, 1);//permutation bin element eli fi indice 0 et indice 1
//
//        List<Employe> e = new ArrayList<>();
//        Collections.copy(employes, e);//nekhou contenu mtaa e nhotou fi employes
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        //On va utiliser la méthode: compare
        Collections.sort(employes, new EmployeComparatorParDep()
                .thenComparing(new EmployeComparatorParGrade()));
        //Ou bien pour simplifier
//        employes.sort(
//                new EmployeComparatorParDep()
//                .thenComparing(new EmployeComparatorParGrade()));
    }
}
//comparator +stream interface fonctionnel
