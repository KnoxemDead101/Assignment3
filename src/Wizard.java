public class Wizard extends Hero {
    private int hitPoints;
    private float attack;
    private float defense;


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
}
