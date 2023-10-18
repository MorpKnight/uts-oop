class Main{
    public static void main(String[] args) {
        pasien newPasien = new pasien("null", 0, jenisKamar.VIP);
        System.out.println(newPasien.name);
        newPasien.call();
        System.out.println(newPasien.getID());

        dokter Dokter = new dokter("null", 1, dokter.dokterType.SPESIALIS);
        Dokter.call("X301");
    }
}