public class source {
    public static void main(String[] args) {
        //Number generation Create a method for it?
        int max = 10;
        int min = 5;
        System.out.println((int)(Math.random() * 10) + 1);
        System.out.println((int) (Math.random() * (max - min) + 1) + min);
    }
}
