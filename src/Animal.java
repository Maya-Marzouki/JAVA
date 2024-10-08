//package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;


    public Animal() {
        family = "";
        name = "";
        age = 0;
        isMammal = false;
    }


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }


    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public String toString() {
        return "Nom: " + name + ", âge: " + age + ", est un mammifère: " + isMammal;
    }
}
