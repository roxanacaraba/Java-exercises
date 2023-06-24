package main.java.com.nagarro.remotelearning;

public class Hero extends GameCharacter {
    private String name;
    private int experiencePoints;

    public Hero(int healthPoints, int attackStrength, String name) {
        super(healthPoints, attackStrength);
        this.name = name;
        this.experiencePoints = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void heroAttack(Monster target) {
        target.setHealthPoints(target.getHealthPoints() - this.getAttackStrength());
        this.experiencePoints += 10;
        if(target.getHealthPoints() <= 0) {
            System.out.println("Hero win! The monster is dead.");
        }
        else {
            if (target.getMonsterRace() == Monster.Race.CYCLOPS) {
                System.out.println(this.getName() + " attacks rock skin cyclops");
            } else {
                System.out.println(this.getName() + " attacks fire wizard");
            }
        }
    }
}
