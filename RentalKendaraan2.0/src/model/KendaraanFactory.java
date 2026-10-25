package model;

import java.util.List;

public interface KendaraanFactory{
        List<String> daftarJenis();
        Kendaraan buat(String jenis, String platNomor, String merk, long tarifPerHari);
}
//[SRP] Satu tanggung jawab: membuat objek Kendaraan sesuai jenis yang dipilih.
//[OCP] Pembuatan objek harus terjadi di suatu tempat. Kita kumpulkan di SATU kelas ini,
//      sehingga Controller, View, dan Repository tetap tertutup untuk modifikasi.
