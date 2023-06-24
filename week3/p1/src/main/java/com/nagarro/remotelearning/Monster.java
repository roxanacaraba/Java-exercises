package main.java.com.nagarro.remotelearning;

public class Monster extends GameCharacter {

    enum Race {CYCLOPS, WIZARDS};
    private Race monsterRace;
    public Monster(int healthPoints, int attackStrength) {
        super(healthPoints, attackStrength);
    }

    public Race getMonsterRace() {
        return this.monsterRace;
    }

    public void setMonsterRace(Race monsterRace) {
        this.monsterRace = monsterRace;
    }

    public void monsterAttack(Hero target) {
        target.setHealthPoints(target.getHealthPoints() - this.getAttackStrength());
        if(target.getHealthPoints() <= 0) {
            System.out.println("Game over! " + target.getName() + " is dead.");
        }
        else {
            if(this.monsterRace == Race.CYCLOPS) {
                System.out.println("Rock skin cyclops attacks " + target.getName());
            }
            else {
                System.out.println("Fire wizard attacks " + target.getName());
            }
        }
    }
}
