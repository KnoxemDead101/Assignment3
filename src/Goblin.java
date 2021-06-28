public class Goblin extends Enemies {

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
        System.out.println("Goblin " + hitPoints);
        System.out.println("Goblin " + attackModifier);
        System.out.println("Goblin " + defenseModifier);
    }
    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
