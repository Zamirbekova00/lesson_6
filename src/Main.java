public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(3);
        boss.setDamage(5);
        boss.wpn.setOfficial(WeaponType.OFFICIAL);
        boss.wpn.setWeaponName("Ak-47");

        System.out.println("Boss health: " + boss.getHealth() + " Boss damage: "
                + boss.getDamage() + " Weapon: " + boss.wpn.getOfficial() + " " + boss.wpn.getWeaponName());
    }
}

