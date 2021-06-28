import java.util.Random;
public class Wizard extends Hero {
    //attack set between 5 and 10. Defense is .1 and .3 Hit points are multiplied by .35
    public Wizard () {
        super();
    }
    public Wizard (int hitPoints, float attack, float defense) {
        super(hitPoints, attack, defense);
    }
    @Override
    public int getHitPoints() {
        return hitPoints;
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
        return (int) (2.0 * modifier * attack) + 5;
    }
    @Override
    public void takeDamage(float modifier) {

    }
    /*
    @Override
    public float generate_attack(float min, float max) {
        Random generator = new Random();
        float stat = (float) ((generator.nextFloat() * (max - min)) + min);
        return stat;
    }
     */
    @Override
    public void hero_stats() {
        System.out.println("Wizard hitpoints " + hitPoints);
        System.out.println("Wizard attack " + attack);
        System.out.println("Wizard defense " + defense);
    }

    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
