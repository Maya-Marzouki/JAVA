public interface IGestion <T> {
    //public abstract void ajouterEmploye(T t);
    //toutes les methodes (interface) =>public abstract void
    //tous les attributs (interface) =>public int...
    public void ajouterEmploye(T t);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T t);
    public void supprimerEmploye(T t);
    public void displayEmploye();
    public void trierEmployeParId(); //Comparable
    public void trierEmployeParNomDepartementEtGrade(); //Comparator
}
