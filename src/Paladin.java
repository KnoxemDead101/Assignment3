public class Paladin extends Hero {
    public Paladin() {
        super();
    }
    public Paladin (int hitPoints, float attack, float defense) {
        super(hitPoints, attack, defense);
    }

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
        return (int) ((attack * modifier) + (0.5 * attack));
    }
    @Override
    public void takeDamage(float modifier) {

    }
    @Override
    public void hero_stats() {
        System.out.println("Paladin " + hitPoints);
        System.out.println("Paladin " + attack);
        System.out.println("Paladin " + defense);
    }

    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
