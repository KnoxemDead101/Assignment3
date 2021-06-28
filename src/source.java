import java.util.Random;
public class source {
    public static void main(String[] args) {








    }
    //generates an attack stat per each hero type object based off of the spec
    //parameters represent the max damage number it can be set to and the lowest it can be set to
    public static float generate_attack(float min, float max) {
        Random generator = new Random();
        float stat = (float) ((generator.nextFloat() * (max - min)) + min);
        return stat;
    }
    //Display stats
}
