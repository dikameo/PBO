public class Kelinci {
    public String nama;
    public int umur;
    public String jeniskelamin;
    public String makanan;
    public String warna;
    public int jmlanak;
    

    void show(String nama,int umur, String jeniskelamin,String makanan,String warna, int jmlanak){
        System.out.println("Nama Kelinciku : "+nama);
        System.out.println("Umur Kelinciku : "+umur);
        System.out.println("Jenis Kelamin Kelinciku : "+jeniskelamin);
        System.out.println("Makanan Favorite Kelinciku : "+makanan);
        System.out.println("Warna Kelinciku : "+warna);
        System.out.println("Jumlah anak Kelinciku : "+jmlanak);
    }

    void aktivitas(String nama){
        System.out.println("Setiap hari "+ nama + " skelinciku selaluku ajak bermain");
    }
}
