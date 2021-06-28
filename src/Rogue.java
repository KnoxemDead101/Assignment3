public class Rogue extends Hero {
    private int hitPoints;
    private float attack;
    private float defense;
    //attack is set between 8 and 12: defense is set between .4 and .6: health multiplied by .6
    public Rogue() {
        super();
    }
    public Rogue(int hitPoints, float attack, float defense) {
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
        modifier = (int) (Math.random() * 10);
        if (modifier < 20) {
            return (int) modifier;
        }
        return (int) modifier;
    }
    @Override
    public void takeDamage(float modifier) {
    hitPoints -= (modifier * (1-defense));
    }
/*
    @Override
    public float generate_attack(float min, float max) {
        return 0;
    }

 */
    @Override
    public void hero_stats() {
        System.out.println("Rogue " + hitPoints);
        System.out.println("Rogue " + attack);
        System.out.println("Rogue " + defense);
    }
    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
