public class TestBangun
{
	public static void main(String[] args)
	{
		Segitiga bangun_Segitiga = new Segitiga();
		Lingkaran bangun_Lingkaran = new Lingkaran();
		
		bangun_Segitiga.alas = 10;
		bangun_Segitiga.tinggi = 10;
		bangun_Segitiga.sisi_miring = 20;
		bangun_Lingkaran.jari2= 10;
		bangun_Lingkaran.diameter= 20;
				
		bangun_Lingkaran.cetakProperty();
		System.out.println("Luas Lingkaran: " + bangun_Lingkaran.hitungLuas());
		System.out.println("Keliling Lingkarang: " + bangun_Lingkaran.hitungKeliling());

		bangun_Segitiga.cetakProperty();
		System.out.println("Luas Segitiga: " + bangun_Segitiga.hitungLuas());
		System.out.println("Keliling Segitiga: " + bangun_Segitiga.hitungKeliling());
		}

}