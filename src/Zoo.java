public class Zoo {
    public String name;
    public String city;
    public final int NB_CAGES;
    public Animal[] animals;
    public int nbAnimals;

    public Zoo(String zooBelvedere, String tunis) {
        name = "";
        city = "";
        NB_CAGES = 25;
        animals = new Animal[NB_CAGES];
        nbAnimals = 0; // Initialisation du compteur d'animaux
    }

    public Zoo(String name, String city, int nbCage) {
        this.name = name;
        this.city = city;
        this.NB_CAGES = 25;
        animals = new Animal[NB_CAGES];
        nbAnimals = 0;
        System.out.println("--->" + this.animals.length);
    }

    public void dispalyZoo() {
        System.out.println(name);
        System.out.println(city);
        System.out.println("Nombre de cages : " + NB_CAGES);
        System.out.println("Nombre d'animaux : " + nbAnimals);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }

        }
    }

    public String toString() {
        String ch1 = "", ch2 = "";
        ch1 = "Name: " + name + ", city:" + city +
                ", nbr cages:" + NB_CAGES + ", nb animals:" + nbAnimals + "\n";
        for (int i = 0; i < nbAnimals; i++) {
            ch2 += animals[i].toString() + "\n";
        }
        return ch1 + ch2;
    }

    public boolean addAnimal(Animal animal) {
        // Vérification si l'animal existe déjà dans le zoo
        if (searchAnimal(animal) == -1) {
            // Vérification si le zoo n'a pas atteint sa capacité maximale
            if (nbAnimals < NB_CAGES) {
                animals[nbAnimals] = animal; // Ajout de l'animal dans le zoo
                nbAnimals++; // Incrémentation du nombre d'animaux
                return true;
            } else {
                System.out.println("Error: Can't add animal to Zoo. Zoo is full.");
                return false;
            }
        } else {
            System.out.println("Error: Animal already exists in the Zoo.");
            return false;
        }
    }
/*
    ///INSTRUCTION17
    public boolean addAnimal(Animal animal) {
        // Vérifier si le zoo est plein avant d'ajouter un animal
        if (isZooFull()) {
            System.out.println("Erreur : Le zoo est plein, impossible d'ajouter l'animal.");
            return false;
        }

        // Vérifier si l'animal n'existe pas déjà dans le zoo
        if (searchAnimal(animal) == -1) {
            animals[nbAnimals] = animal;
            nbAnimals++;
            return true;
        } else {
            System.out.println("Erreur : L'animal existe déjà dans le zoo.");
            return false;
        }
    }
    */

    public int searchAnimal(Animal animal) {
        //int pos=-1;
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        // Recherche de l'animal dans le tableau des animaux
        int pos = searchAnimal(animal);

        // Si l'animal est trouvé
        if (pos != -1) {
            // Décalage des animaux pour combler l'espace vide
            for (int i = pos; i < nbAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            // Dernier élément du tableau devient null
            animals[nbAnimals - 1] = null;

            // Décrémente le nombre d'animaux
            nbAnimals--;

            // Retourne true pour indiquer que la suppression a réussi
            return true;
        } else {
            // Si l'animal n'est pas trouvé, retourne false
            System.out.println("Animal non trouvé dans le zoo.");
            return false;
        }
    }

    public static Zoo comparerZoo(Zoo Z1, Zoo Z2) {
        if (Z1.nbAnimals > Z2.nbAnimals) {
            System.out.println("z1 est plus grand");
            return Z1;
        } else if (Z1.nbAnimals < Z2.nbAnimals) {
            System.out.println("z2 est plus grand");
            return Z2;
        } else {
            System.out.println("les deux zoo ont le meme nombre d'animaux");
        }
        return null;
    }
    public boolean  isZooFull (Zoo zoo) {
        if(zoo.nbAnimals >= NB_CAGES) {

            System.out.println("le zoo est plein");
            return true;
        }
        else
        { System.out.println("le zoo n' est pas plein");
            return false;
        }
    }
    public void displayAnimals() {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }



}