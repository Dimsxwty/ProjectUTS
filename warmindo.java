package projectuts;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class warmindo {
    
    private static String USERNAME = "admin";
    private static String PASSWORD = "admin123";
    
  public static void main(String[] args) {    
        boolean loggedIn = false;
        do {
            System.out.println("SELAMAT DATANG DI TOKO KAMI");
            String inputUsername = JOptionPane.showInputDialog("Masukkan username:");
            String inputPassword = JOptionPane.showInputDialog("Masukkan password:");

            if (login(inputUsername, inputPassword)) {
                JOptionPane.showMessageDialog(null, "Login berhasil!");
                loggedIn = true;
                
                } else {
                JOptionPane.showMessageDialog(null, "Username atau password salah! Silakan coba lagi.");
            }
        } while (!loggedIn);
    }
    private static boolean login(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
                
                cProduk p = new cProduk();
                cProduk p2 = new cProduk("sepatu",15000,10);
                cPembeli pb = new cPembeli("Budi ","Surabaya");
                cProduk produk[] = new cProduk[3];
                cTransaksi tr = new cTransaksi();
                Scanner sc = new Scanner(System.in);
                
                produk[0]=new cProduk("Sepatu",150000,5);
        produk[1]=new cProduk("Sandal",50000,5);
        produk[2]=new cProduk("Tas",100000,5);
        
        int pilih=0;
        //Sub Menu Utama
        do{
            System.out.println("\nMenu APP");
            System.out.println("1.Produk");
            System.out.println("2.Pembeli");
            System.out.println("3.Transaksi");
            System.out.println("4.Exit");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("<<Produk>>");
                    System.out.println("  1.Tambah");
                    System.out.println("  2.Ubah");
                    System.out.println("  3.Hapus");
                    System.out.println("  4.Detail");
                    System.out.println("  Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }   
