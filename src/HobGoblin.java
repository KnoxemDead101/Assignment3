public class HobGoblin extends Enemies {
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
        System.out.println("HoGoblin " + hitPoints);
        System.out.println("HoGoblin " + attackModifier);
        System.out.println("HoGoblin " + defenseModifier);
    }

    @Override
    public float generate_stats(float min, float max) {
        return 0;
    }
}
