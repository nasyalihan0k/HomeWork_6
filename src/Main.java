public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);



        Weapon weapon = new Weapon(WeaponType.COLD, "MK-14");
        boss.setWeapon(weapon);

        System.out.println(boss.info());

        Skeleton powerSkeleton = new Skeleton();
        powerSkeleton.setHealth(180);
        powerSkeleton.setDamage(10);
        powerSkeleton.setNumbersOfArrows(15);

        Weapon weaponFierySkeleton = new Weapon(WeaponType.HOT, "Onion");
        powerSkeleton.setWeapon(weaponFierySkeleton);
        System.out.println(powerSkeleton.info());

        Skeleton hotSkeleton = new Skeleton();
        hotSkeleton.setHealth(180);
        hotSkeleton.setDamage(10);
        hotSkeleton.setNumbersOfArrows(15);

        Weapon weaponIcySkeleton = new Weapon(WeaponType.WATER, "Onion");
        hotSkeleton.setWeapon(weaponIcySkeleton);
        System.out.println(hotSkeleton.info());
    }
}