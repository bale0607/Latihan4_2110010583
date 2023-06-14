package penilaian;

public class Main {
    public static void main(String[] args) {
       NilaiAkhir iqbal = new NilaiAkhir ("Iqbal Nurrahmad Pratama","2110010583",70,85,85); 
    
    
        System.out.println("Nama Mahasiswa: "+iqbal.getNama());
        System.out.println("NPM Mahasiswa: "+iqbal.getNpm());
        System.out.println("Nilai Akhir: "+iqbal.hitungNilaiAkhir());
    
    
    }
}
