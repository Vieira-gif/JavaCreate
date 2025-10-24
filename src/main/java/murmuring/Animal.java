package murmuring;

public abstract class Animal {
    private String name;
    private String race;
    private String familyName;
    private int age;
    private boolean isAlive;
    private int weight;
    private int calories;
    private int strength;

    public Animal(String name, int strength, int calories, int weight, boolean isAlive, int age, String familyName, String race) {
        setStrength(strength);
        setAge(age);
        setCalories(calories);
        setWeight(weight);
        setName(name);
        setFamilyName(familyName);
        setRace(race);
        setAlive(isAlive);
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public int getStrength() {
        return strength;
    }

    //SETTERS

    private void setRace(String race) {
        this.race = race;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setAlive(boolean alive) {
        isAlive = alive;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    private void setCalories(int calories) {
        this.calories = calories;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    //METHODS

    public boolean isAlive() {
        if (this.isAlive){
            return true;
        } else {
            throw new NotAlive("Animal is Dead");
        }
    }

    public void eat(int cal) {
        if (isAlive()) {
            this.setCalories(this.getCalories() + cal);
            this.setStrength(this.getStrength() + 1);
            this.setWeight(this.getWeight() + 5);
        }
    }

    public void drink() {
        if (isAlive()) {
            this.setWeight(this.getWeight() + 10);
        }
    }

    public void walk(int qtd) {
        if (isAlive()) {
            if (this.getCalories() >= 0 && this.getStrength() >= 0) {
                System.out.println("Animal is walking");
            }
        }
    }

    public void kill() {
        if (isAlive()) {
            this.setAlive(false);
        }
    }

}
