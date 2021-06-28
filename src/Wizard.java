import java.util.Random;
public class Wizard extends Hero {
    private int hitPoints = 100;
    private float attack;
    private float defense;
    //attack set between 5 and 10. Defense is .1 and .3 Hit points are multiplied by .35

    public Wizard () {
        super();
    }
    public Wizard (int hitPoints, float attack, float defense) {
        super(hitPoints, attack, defense);

    }
    @Override
    public int getHitPoints() {
        return this.hitPoints;
    }
    @Override
    public float getAttack() {
        return this.attack;
    }
    @Override
    public float getDefense() {
        return this.defense;
    }
    @Override
    public int doAttack(float modifier) {
        return 0;
    }
    @Override
    public void takeDamage(float modifier) {
    }
    @Override
    public float generate_attack(float min, float max) {
        Random generator = new Random();
        float stat = (float) ((generator.nextFloat() * (max - min)) + min);
        return stat;
    }
    @Override
    public void hero_stats() {
        System.out.println("Wizard hitpoints " + hitPoints);
        System.out.println("Wizard attack " + attack);
        System.out.println("Wizard defense " + defense);
    }
}
