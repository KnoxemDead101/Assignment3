public class Kobold extends Enemies{
    @Override
    public Enemies generateEnemy() {
        return null;
    }

    @Override
    public void takeDamage(float modifier) {

    }

    @Override
    public float getAttack() {
        return this.attackModifier;
    }

    @Override
    public float getDefense() {
        return this.defenseModifier;
    }

    @Override
    public void hero_stats() {
        System.out.println("Kobold " + hitPoints);
        System.out.println("Kobold " + attackModifier);
        System.out.println("Kobold " + defenseModifier);
    }

    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
