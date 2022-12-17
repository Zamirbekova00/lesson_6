public class Weapon {
    private WeaponType official;
    private String WeaponName ;

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public WeaponType getOfficial() {
        return official;
    }

    public void setOfficial(WeaponType official) {
        this.official = official;
    }
}
