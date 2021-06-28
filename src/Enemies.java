import java.util.Random;

public abstract class Enemies {
    protected int hitPoints;
    protected float defenseModifier;
    protected float attackModifier;
    final int max = 200;
    final int min = 100;
    public Enemies() {
        this.hitPoints = (int) (Math.random() * ((max - min) + 1)) + min;
        this.defenseModifier = 0.0f;
        this.attackModifier = 0.0f;
    }
    public Enemies(int hitPoints, float attackModifier, float defenseModifier) {
        this.hitPoints = hitPoints;
        this.attackModifier = attackModifier;
        this.defenseModifier = defenseModifier;
    }
    public abstract Enemies generateEnemy();
    public abstract void takeDamage(float modifier);
    public abstract float getAttack();
    public abstract float getDefense();
    public abstract void hero_stats();
    public abstract float generate_stats(float min, float max);
}
