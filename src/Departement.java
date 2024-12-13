public class Departement implements Comparable<Departement> {
    int id;
    String nom;
    int nbEmployees;

    public Departement() {
    }

    public Departement(int id, String nom, int nbEmployees) {
        this.id = id;
        this.nom = nom;
        this.nbEmployees = nbEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEmployees() {
        return nbEmployees;
    }

    public void setNbEmployees(int nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployees=" + nbEmployees +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj instanceof Departement dep) //DOWNCAST IMPLICITE
            return this.id == dep.id && this.nom.equals(dep.nom);
        return false;
    }
    @Override
    public int hashCode() {
        //return 10;//ki aamalna haka tous les objets wala l code mteehom 10
        //return id + nom.hashCode();//haka fama possibilite enou code mouch unique=>ijina code mara okhra
        //donc pour eviter cela:
        int code = 87;
        code += 76 * id;
        code += 42 / nom.hashCode();
        return code;
    }

    @Override
    public int compareTo(Departement o) {
        return 0;
    }
}
