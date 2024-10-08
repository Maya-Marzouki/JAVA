//package tn.esprit.gestionzoo.main;

public class MainClass {
    private static Zoo myZoo;

    public static void main(String[] args) {
        // Création de quelques animaux
        Animal lion = new Animal("Carnivore", "Lion", 5, true);
        Animal chat = new Animal("Carnivore", "Chat", 2, true);
        Animal cheval = new Animal("Herbivore", "Cheval", 6, true);
        Animal elephant = new Animal("Herbivore", "Elephant", 10, true);
        Animal tigre = new Animal("Carnivore", "Tigre", 4, true);

        // Création des zoos
        Zoo myzoo = new Zoo("belvedere", "tunis", 25);
        Zoo zoo = new Zoo("frigya", "tunis", 25);

        // Affichage de la famille et de l'âge du lion
        System.out.println(lion.getFamily());
        System.out.println(lion.getAge());

        // Ajout d'animaux dans le zoo
        myzoo.addAnimal(lion);
        myzoo.addAnimal(chat);
        myzoo.addAnimal(cheval);
        myzoo.addAnimal(elephant);
        myzoo.addAnimal(tigre);

        // Tentative d'ajout du lion une deuxième fois (refusée)
        boolean resultAj = myzoo.addAnimal(lion);
        System.out.println("Ajout d'un lion en doublon a réussi ? " + resultAj);

        // Ajout d'animaux supplémentaires (jusqu'à 25)
        for (int i = 0; i < 20; i++) {
            Animal newAnimal = new Animal("RandomFamily", "Animal" + i, i, true);
            myzoo.addAnimal(newAnimal);
        }

        // Tentative d'ajout d'un 26ème animal
        Animal extraAnimal = new Animal("ExtraFamily", "ExtraAnimal", 1, false);
        boolean result = myzoo.addAnimal(extraAnimal);

        // Affichage du zoo et du résultat de l'ajout
        System.out.println(myzoo.toString());
        System.out.println("Ajout du 26ème animal a réussi ? " + result);

        // Affichage des animaux du zoo
        System.out.println("Liste des animaux dans le zoo:");
        myzoo.displayAnimals();

        // Recherche de l'animal Lion dans le zoo
        System.out.println("Recherche de l'animal Lion:");
        int indexLion = myzoo.searchAnimal(lion);
        System.out.println("Indice du Lion: " + indexLion);

        // Création d'un animal identique au Lion
        Animal lion2 = new Animal("Carnivore", "Lion", 5, true);

        // Recherche du deuxième animal identique au Lion
        System.out.println("Recherche du deuxième animal Lion:");
        int indexLion2 = myzoo.searchAnimal(lion2);
        System.out.println("Indice du deuxième Lion: " + indexLion2);

        // Retrait de l'animal Lion du zoo
        myzoo.removeAnimal(lion);
        System.out.println(myzoo.toString());

        // Ajout d'animaux dans un autre zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(chat);
        zoo.addAnimal(cheval);
        System.out.println(zoo.toString());

        // Comparaison des deux zoos
        System.out.println(Zoo.comparerZoo(myzoo, zoo));

        // Vérification si le zoo est plein
        System.out.println("Le zoo est-il plein ? " + myzoo.isZooFull(myzoo));

        // Ajout d'animaux jusqu'à remplir le zoo
        for (int i = 0; i < 22; i++) {
            Animal newAnimal = new Animal("RandomFamily", "Animal" + i, i, true);
            myZoo.addAnimal(newAnimal);
        }

        // Vérification si le zoo est plein après ajout
        System.out.println("Le zoo est-il plein après ajout ? " + myZoo.isZooFull(myZoo));

        // Affichage final du zoo
        System.out.println(myzoo.toString());
        // Suppression de l'animal Lion
        boolean removeSuccess = myzoo.removeAnimal(lion);
        System.out.println("Suppression du lion réussie ? " + removeSuccess);

        // Affichage après suppression
        System.out.println("Zoo après suppression du lion:");
        System.out.println(myzoo.toString());

        // Tentative de suppression d'un animal non présent dans le zoo
        Animal girafe = new Animal("Herbivore", "Girafe", 7, true);
        removeSuccess = myzoo.removeAnimal(girafe);
        System.out.println("Suppression d'une girafe (non présente) réussie ? " + removeSuccess);
        // Affichage final du zoo
        System.out.println("Zoo final:");
        // Création de deux zoos
        Zoo zoo1 = new Zoo("Zoo Belvedere", "Tunis");
        Zoo zoo2 = new Zoo("Zoo Frigya", "Hammamet");

        // Ajout d'animaux dans les zoos
        zoo1.addAnimal(new Animal("Carnivore", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Carnivore", "Tigre", 4, true));

        zoo2.addAnimal(new Animal("Herbivore", "Elephant", 10, true));
        zoo2.addAnimal(new Animal("Herbivore", "Cheval", 6, true));
        zoo2.addAnimal(new Animal("Carnivore", "Panthère", 3, true));
        // Comparaison des deux zoos
        Zoo plusGrandZoo = Zoo.comparerZoo(zoo1, zoo2);

        if (plusGrandZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + plusGrandZoo.name);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
        System.out.println(myzoo.toString());

        // Ajout d'animaux jusqu'à ce que le zoo soit plein
        for (int i = 0; i < 22; i++) {
            Animal newAnimal = new Animal("RandomFamily", "Animal" + i, i, true);
            zoo.addAnimal(newAnimal);
        }

        // Tentative d'ajouter un animal dans un zoo plein
        Animal extraA = new Animal("Carnivore", "Panthère", 3, true);
        zoo.addAnimal(extraAnimal);  // Cela devrait afficher une erreur puisque le zoo est plein

        try {
            // Test de la classe Animal avec un âge négatif
            lion = new Animal("Carnivore", "Lion", -5, true);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Afficher l'erreur
        }

        try {
            // Test de la classe Zoo avec un nom vide
            zoo = new Zoo("", "Tunis");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Afficher l'erreur
        }

        System.out.println("Ajout réussi : " + elephant);
        System.out.println("Zoo : " + myZoo.getName());
    }
}
