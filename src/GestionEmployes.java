import java.util.ArrayList;
import java.util.List;

public class GestionEmployes implements IGestion<Employe> {

    List<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {

    }

    @Override
    public void displayEmploye() {

    }

    @Override
    public void trierEmployeParId() {

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {

    }
}
