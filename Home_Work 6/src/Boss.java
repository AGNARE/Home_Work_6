public class Boss extends GameEntity{
    Weapon weapon = new Weapon();
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printinfo (){
        return "|| Health: " + getHp() + "|| Damage: " + getDamage() + "|| Weapon Type: " + weapon.getWeaponType() + "|| Weapon Name: " + weapon.getWeaponName();
    }
}
