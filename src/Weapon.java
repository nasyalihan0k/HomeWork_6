public class Weapon {
    private WeaponType typeOfWeapon;
    private String weapons;

    public Weapon(WeaponType typeOfWeapon, String weapons){
        this.typeOfWeapon = typeOfWeapon;
        this.weapons = weapons;
    }

    public WeaponType getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(WeaponType typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }
}