package main.java.com.nagarro.remotelearning;

public class GameCharacter {
    private int healthPoints;
    private int attackStrength;

    public GameCharacter(int healthPoints, int attackStrength) {
        this.healthPoints = healthPoints;
        this.attackStrength = attackStrength;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }
}

