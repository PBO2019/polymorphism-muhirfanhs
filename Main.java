public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Supervisor supevisor = new Supervisor();
        Staff staf = new Staff();
        Gaji gaji = new Gaji();
        supevisor.setNama("David");
        staf.setNama("Irfan");
        gaji.Tarifgaji(supevisor.getTarif(),supevisor.getNama(),"G121" );
        gaji.Tarifgaji(staf.getTarif(), staf.getNama(),"A321");

    }
}
