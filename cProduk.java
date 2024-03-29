package projectuts;
public class cProduk {
    private String nama, kode;
    private int harga, stok;
    cProduk(){
       System.out.println("Construktor default...");
    }
    cProduk(String n, int h,int s){
       nama=n; harga=h; stok=s;
       System.out.println("Object "+nama+" dibuat...");
    }
    public void setHarga(int h){ harga=h; }
    public void setStok(int s){ stok=s; }
    public String setNama(){ return nama; }
    public int getHarga(){ return harga; }
    public int getStok(){ return stok; }
    public String getNama(){ return nama; }
    public String ToString(){
    return nama+" harga: "+harga+" Stok: "+stok; 
   }
}