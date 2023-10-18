/**
 * dokter
 */
public class dokter extends user {
    public dokterType type;

    public enum dokterType{
        UMUM, SPESIALIS
    }

    public dokter(String name, int ID, dokterType type){
        super(name, ID, status.DOKTER);
        this.type = type;
    }

    /**
     * Melakukan override terhadap method call() yang ada di class user
     */
    public void call(){
        System.out.println("Dr." + this.name + " calling for help");
    }

    /**
     * Melakukan override terhadap method getID() yang ada di class user dan overloading untuk method call() di class ini
     * @param roomNumber
     */
    public void call(String roomNumber){
        System.out.println("Dr." + this.name + " calling for help in room " + roomNumber);
    }
}
