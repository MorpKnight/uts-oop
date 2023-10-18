/**
 * pasien
 */
public class pasien extends user {
    public jenisKamar typeKamar;

    public pasien(String name, int ID, jenisKamar type){
        super(name, ID, status.PASIEN);
        this.typeKamar = type;
    }

    public void call(){
        System.out.println(this.name + " call for help");
    }

    /**
     * Melakukan override terhadap method getID() yang ada di class user
     * @return String
     */
    @Override
    public String getID(){
        return "pasien ID: " + super.getID();
    }
}
