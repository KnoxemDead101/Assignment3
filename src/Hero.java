public abstract class Hero {
    final int max = 100;
    final int min = 50;
    private int hitPoints;
    private float attack;
    private float defense;

    public Hero() {
        this.hitPoints = (int) (Math.random() * ((max - min) + 1)) + min;
        this.defense = 0.0f;
        //this.attack = 0.0f
    }
    public Hero (int hitPoints, float attack, float defense) {
        this.hitPoints = hitPoints;
        this.attack = attack;
        this.defense = defense;

    }
    public abstract int getHitPoints();
    public abstract float getAttack();
    public abstract float getDefense();
    public abstract int doAttack(float modifier);
    public abstract void takeDamage(float modifier);
    public abstract float generate_attack(float min, float max);
    public abstract void hero_stats();
}
