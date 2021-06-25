public abstract class Hero {
    final int max = 100;
    final int min = 50;

    private int hitPoints = (int) (Math.random() * ((max - min) + 1)) + min;
    //private float attack = (int) (Math.random() * )
    private float defense;






    public abstract int getHitPoints();
    public abstract float getAttack();
    public abstract float getDefense();
    public abstract int doAttack(float modifier);
    public abstract void takeDamage(float modifier);
}
