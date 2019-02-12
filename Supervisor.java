public class Supervisor extends Pegawai {
    protected int tarif = 100000;
    protected String Nama;

    public int getTarif() {
        return tarif;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNama() {
        return Nama;
    }
}
