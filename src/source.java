import java.util.Random;
public class source {
    public static void main(String[] args) {
        int health_test;
        float attack_test;
        float defense_test;
        int damage = (int) (Math.random() * 100);
        //System.out.println(damage);
        //test values
        health_test = (int) generate_stats(50, 100);
        attack_test = generate_stats(5.0f, 10.0f);
        defense_test = generate_stats(.1f, .3f);

        //test object
        Wizard wizard1 = new Wizard(health_test, attack_test, defense_test);
        Barbarian barbarian = new Barbarian(420, 69.69f, 17.38f);
        wizard1.hero_stats();
        barbarian.hero_stats();
    }
    //generates an attack stat per each hero type object based off of the spec
    //parameters represent the max damage number it can be set to and the lowest it can be set to
    public static float generate_stats(float min, float max) {
        Random generator = new Random();
        float stat = (float) ((generator.nextFloat() * (max - min)) + min);
        return stat;
    }
    //Display stats
}
