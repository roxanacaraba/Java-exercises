package main.java.com.nagarro.remotelearning;

public class RockSkinCyclops extends Monster {

    public RockSkinCyclops(int healthPoints, int attackStrength) {
        super(healthPoints, attackStrength);
        setMonsterRace(Race.CYCLOPS);
    }
    public void useCyclopMagic() {
        this.setHealthPoints(this.getHealthPoints() + 5);
        System.out.println("Rock skin cyclops starts using magic");
    }
}
