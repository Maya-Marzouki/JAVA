//package tn.esprit.gestionzoo.entities;

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
        nbAnimals = 0;
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
        if (isZooFull()) {
            System.out.println("Erreur : Le zoo est plein, impossible d'ajouter l'animal.");
            return false;
        }

        if (searchAnimal(animal) == -1) {
            animals[nbAnimals] = animal;
            nbAnimals++;
            return true;
        } else {
            System.out.println("Erreur : L'animal existe déjà dans le zoo.");
            return false;
        }
    }

    private boolean isZooFull() {
        return false;
    }

    public int searchAnimal(Animal animal) {
        //int pos=-1;
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int pos = searchAnimal(animal);

        if (pos != -1) {
            for (int i = pos; i < nbAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbAnimals - 1] = null;

            nbAnimals--;

            return true;
        } else {
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
    public String getName() {
        return name;
    }
}