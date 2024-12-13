public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String departement;
    private int grade;

    public Employe() {}

    public Employe(int id, String nom, String prenom, String departement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.grade = grade;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        //if (obj instanceof Employe){
        //    Employe emp = (Employe) obj;//DOWNCAST EXPLICITE
        //}
        // OU BIEN
        if (obj instanceof Employe emp) //DOWNCAST IMPLICITE
            return this.id == emp.id && this.nom.equals(emp.nom);
        return false;
    }

    @Override
    public int hashCode() { //Nestaamalha wakteli aandi Set/Map
        int code = 76;
        code += 30 * id;
        code += 87 / nom.hashCode(); //khater code howa entier w ena bch nzidou 'nom' string donc nzid .hashCod()
        return code ;
//        de preference nzidou des valeurs pour etre plus sure
//        sinon nhotouha toula hedhi:
//        return id + nom.hashCode();
    }

    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
        //return this.nom.compareTo(o.nom);//KHATER - operateur mathematique nestaamlouh maa int
        // donc nhotou ^^
    }

}