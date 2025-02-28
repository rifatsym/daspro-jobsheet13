import java.util.Scanner;

public class KRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Menu Awal
            while (true) {
                System.out.println("\n=== Menu ===");
                System.out.println("1. Tambah Data KRS");
                System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
                System.out.println("3. Analisis Data KRS");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = sc.nextInt();
                sc.nextLine();
    
                if (pilihan == 1) {
                    tambahDataKRS(sc);
                } else if (pilihan == 2) {
                    System.out.println("Fitur Tampilkan Daftar KRS belum tersedia.");
                } else if (pilihan == 3) {
                    System.out.println("Fitur Analisis Data KRS belum tersedia.");
                } else if (pilihan == 4) {
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                } else {
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
    }

    // Metode untuk Menambah Data KRS Mahasiswa
    static void tambahDataKRS(Scanner sc) {
        while (true) {
            System.out.println("\n=== Tambah Data KRS ===");

            // Input data mahasiswa
            System.out.print("Nama Mahasiswa: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();

            int totalSKS = 0;

            // Input data mata kuliah
            while (true) {
                System.out.print("Kode Mata Kuliah: ");
                String kodeMK = sc.nextLine();
                System.out.print("Nama Mata Kuliah: ");
                String namaMK = sc.nextLine();
                System.out.print("Jumlah SKS (1-3): ");
                int sks = sc.nextInt();
                sc.nextLine();

                // Validasi SKS
                if (sks < 1 || sks > 3) {
                    System.out.println("Jumlah SKS tidak valid! Harus antara 1 dan 3.");
                    continue;
                }

                if (totalSKS + sks > 24) {
                    System.out.println("Total SKS melebihi batas (24 SKS). Tidak dapat menambahkan mata kuliah ini.");
                    break;
                }

                totalSKS += sks;
                System.out.println("Mata kuliah berhasil ditambahkan.");

                System.out.print("Tambah mata kuliah lain? (y/t): ");
                String tambahLagi = sc.nextLine();
                if (!tambahLagi.equalsIgnoreCase("y")) {
                    break;
                }
            }

            System.out.println("Total SKS yang diambil: " + totalSKS);

            System.out.print("\nKembali ke menu utama? (y/t): ");
            String kembaliMenu = sc.nextLine();
            if (kembaliMenu.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
