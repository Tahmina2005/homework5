public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setHealth(250);
        boss.setProtection("Distance protection");
            System.out.println("Boss health " + boss.getHealth() + " " +
                "Boss damage " + boss.getDamage() + " " + boss.getProtection());




    }
}
