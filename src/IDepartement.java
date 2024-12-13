import java.util.Set;

public interface IDepartement <T> {
    public void ajouterDepartement(T t);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public void displayDepartement();
    public Set<Departement> trierDepartementById();

}
