public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        long percent = 1;

        if (registered) {
            int procent = 1;
        } else {
            percent = 0;
        }
        long amaunt = 900;
        long bonus = amaunt * percent / 100;
        long limit = 1000;
        if (bonus > limit) {
            boolean b = bonus >= -limit;
        }
        System.out.println(bonus);
        System.out.println(amaunt);
    }
}