import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employe, Departement> affectation;

    //COnstructeur par defaut:
    public AffectationHashMap() {
        affectation = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        //hashCode & equals (Employe)
        affectation.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        //toString (Employe + Departement)
        System.out.println(affectation);
    }

    public void supprimerEmploye (Employe e){
        //hashCode & equals (Employe)
        affectation.remove(e);
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        //hashCode & equals (Employe) + equals (Departement)
        affectation.remove(e, d);
    }

    public void afficherEmployes(){
        //Parcours
//        for(Employe e : affectation.keySet()){
//            System.out.println(e);
//        }
        //OU BIEN
        //toString (Employe)
        System.out.println(affectation.keySet());
    }

    public void afficherDepartements(){
        //Parcours
//        for (Departement d : affectation.values()) {
//            System.out.println(d);
//        }
        //OU BIEN
        //toString (Departement)
        System.out.println(affectation.values());
    }

    public boolean rechercherEmploye (Employe e){
        //hashCode & equals (Employe)
        return affectation.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        //hashCode & equals (Departement)
        return affectation.containsValue(d);
    }

    public Map<Employe, Departement> trierMap(){

        //Comaparable
        Map<Employe, Departement> tree = new TreeMap<>();
        tree.putAll(affectation);

        //Comparator
        Map<Employe, Departement> tree1 = new TreeMap<>();
        tree1.putAll(affectation);

        return tree;
    }
}
