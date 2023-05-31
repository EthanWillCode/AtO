package org.launchcode.AtOwebpage.models.abilities;
import java.util.Objects;
public class Ability {

    private int id;
    private static int nextId = 1;

    private String name;
    private int energyCost;
    private ClassOfAbility classOfAbility;
    private AbilityDescription abilityDescription;

    //no args constructor
    public Ability (){
        id = nextId;
        nextId++;
    }

    //args constructor
    public Ability(String name,
                   int energyCost,
                   ClassOfAbility classOfAbility,
                   AbilityDescription abilityDescription) {
        this.name = name;
        this.energyCost = energyCost;
        this.classOfAbility = classOfAbility;
        this.abilityDescription = abilityDescription;
    }

    // Custom toString method.
    @Override
    public String toString(){
        String output = "";
        output = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Energy Cost: %s\n" +
                "Class: %s\n" +
                "Description: %s\n", id, name, energyCost, classOfAbility, abilityDescription);
        return output;
    }

    // Custom equals and hashCode methods. Two Job objects are "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ability)) return false;
        Ability ability = (Ability) o;
        return id == ability.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public ClassOfAbility getClassOfAbility() {
        return classOfAbility;
    }

    public void setClassOfAbility(ClassOfAbility classOfAbility) {
        this.classOfAbility = classOfAbility;
    }

    public AbilityDescription getAbilityDescription() {
        return abilityDescription;
    }

    public void setAbilityDescription(AbilityDescription abilityDescription) {
        this.abilityDescription = abilityDescription;
    }
}
