package main.java.com.nagarro.remotelearning;

public class Game {
    public static void main(String[] args) {
        Hero hero = new Hero(100, 10,"Chuck");
        RockSkinCyclops monsterCyclop = new RockSkinCyclops(30, 8);
        FireWizard monsterWizard = new FireWizard(50, 6);
        hero.heroAttack(monsterCyclop);
        System.out.println("Chuck's attributes: HP = " + hero.getHealthPoints() + ", XP = " + hero.getExperiencePoints());
        System.out.println("Rock skin cyclops's attributes: HP = " + monsterCyclop.getHealthPoints());
        monsterCyclop.useCyclopMagic();
        hero.heroAttack(monsterCyclop);
        System.out.println("Chuck's attributes: HP = " + hero.getHealthPoints() + ", XP = " + hero.getExperiencePoints());
        System.out.println("Rock skin cyclops's attributes: HP = " + monsterCyclop.getHealthPoints());
        monsterWizard.monsterAttack(hero);
        System.out.println("Fire wizard's attributes: HP = " + monsterWizard.getHealthPoints());
        System.out.println("Chuck's attributes: HP = " + hero.getHealthPoints() + ", XP = " + hero.getExperiencePoints());
        hero.heroAttack(monsterWizard);
        System.out.println("Chuck's attributes: HP = " + hero.getHealthPoints() + ", XP = " + hero.getExperiencePoints());
        System.out.println("Fire wizard's attributes: HP = " + monsterWizard.getHealthPoints());
    }
}
