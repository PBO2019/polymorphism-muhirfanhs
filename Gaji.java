public class Gaji {
    protected int hasil;
    protected String Id;

    public void Tarifgaji(int tarif, String Nama , String Id) {
        hasil = tarif * 30;
        System.out.println("Gaji "+ Nama + " dengan Id " + Id + " Adalah " + hasil);
    }
}
