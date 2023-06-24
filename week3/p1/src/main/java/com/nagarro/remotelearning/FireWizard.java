package main.java.com.nagarro.remotelearning;

public class FireWizard extends Monster {

    public FireWizard(int healthPoints, int attackStrength) {
        super(healthPoints, attackStrength);
        setMonsterRace(Race.WIZARDS);
    }

    public void useWizardMagic() {
        this.setAttackStrength(this.getAttackStrength() + 2);
        System.out.println("Fire wizard starts using magic");
    }

    public void fireAttack(Hero target) {
        target.setAttackStrength(target.getAttackStrength() - 1);
        System.out.println("Fire wizards attacks with fire " + target.getName());
    }
}
