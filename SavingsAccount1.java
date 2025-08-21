public class SavingsAccount1 {
    // Class SavingsAccount
    // Merepresentasikan rekening tabungan sederhana

    // Field (data yang dimiliki objek)
    public double balance; // saldo rekening
    public String name; // nama pemilik rekening

    // Method untuk menampilkan informasi akun
    public void displayCustomer() {
        System.out.println("Nama Pemilik  : " + name);
        System.out.println("Saldo Rekening: " + balance);
    }
}