public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(800);
        boss.setDamage(85);
        boss.weapon.setWeaponType(WeaponType.COLD);
        boss.weapon.setWeaponName("Katana");
        System.out.println("|Health : " + boss.getHp() + " |Damage: " + boss.getDamage() + " |Weapon type: " + boss.weapon.getWeaponType() + " |Weapon: " + boss.weapon.getWeaponName());

        System.out.println(boss.printinfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHp(300);
        skeleton.setDamage(30);
        skeleton.weapon.setWeaponType(WeaponType.PROPELLING);
        skeleton.weapon.setWeaponName("Knife");
        System.out.println("|| Helth: " + skeleton.getHp() + " || Damage: " + skeleton.getDamage() + " || WeaponType: " + skeleton.weapon.getWeaponType() + " || WeaponName: " + skeleton.weapon.getWeaponName());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(200);
        skeleton2.setDamage(60);
        skeleton2.weapon.setWeaponType(WeaponType.FIRE_SHOOT);
        skeleton2.weapon.setWeaponName("AWM");
        System.out.println("||| Helth: " + skeleton2.getHp() + " ||| Damage: " + skeleton2.getDamage() + " ||| Weapon Type: " + skeleton2.weapon.getWeaponType() + " ||| Weapon Name: " + skeleton2.weapon.getWeaponName());

    }
}