public class Barbarian extends Hero {
    public Barbarian() {
        super();
    }
    public Barbarian(int healthPoints, float attack, float defense) {
        super(healthPoints, attack, defense);
    }
    //attack set between 5 and 10: defense set between .1 and .3: hitpoints are multiplied by 1.15
    @Override
    public int getHitPoints() {
        return hitPoints;
    }
    @Override
    public float getAttack() {
        return attack;
    }
    @Override
    public float getDefense() {
        return defense;
    }
    @Override
    public int doAttack(float modifier) {
        float bonus = (float) (5 * (1.0 - modifier));
        return (int) (attack + bonus);
    }
    @Override
    public void takeDamage(float modifier) {
        hitPoints -= (modifier * (1 - defense));
    }
    @Override
    public void hero_stats() {
        System.out.println("Barbarian " + hitPoints);
        System.out.println("Barbarian " + attack);
        System.out.println("Barbarian " + defense);
    }
    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
