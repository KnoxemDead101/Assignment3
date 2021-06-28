public class LizardFolk extends Enemies{
    @Override
    public Enemies generateEnemy() {
        return null;
    }

    @Override
    public void takeDamage(float modifier) {

    }

    @Override
    public float getAttack() {
        return attackModifier;
    }

    @Override
    public float getDefense() {
        return defenseModifier;
    }

    @Override
    public void hero_stats() {
        System.out.println("LizardFolk " + hitPoints);
        System.out.println("LizardFolk " + attackModifier);
        System.out.println("LizardFolk " + defenseModifier);
    }

    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
