package projectuts;
public class cPembeli {
    private String nama;
    private String alamat;
    cPembeli(){
        System.out.println("Default construktor pembeli...");
    }
    cPembeli(String n, String a){
        nama=n; alamat=a;
        System.out.println("object "+nama+"dibuat...");
    }
    public String getNama(){ return nama; }
    public String getAlamat() { return alamat; }
}