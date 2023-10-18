/**
 * Class abstrak untuk user, sehingga dapat dipakai kedepannya oleh pasien dan dokter
 */
abstract class user { 
    public String name;
    private int ID;
    public static status status;

    public user(String name, int ID, status status) {
        this.name = name;
        this.ID = ID;
        status = status;
    }

    abstract void call();

    public String getID() {
        return Integer.toString(this.ID);
    }
}
