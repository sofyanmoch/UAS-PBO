public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mahasiswa = new Mahasiswa("Mochamad Sofyan", 23);
		MahasiswaLama mahasiswaLama = new MahasiswaLama("Mochamad Sofyan Alumni", 25, 2014);
		MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Mochamad Sofyan Baru", 21, 22205037);
		
		System.out.println("===== Objek Mahasiswa =====");
		mahasiswa.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Lama =====");
		mahasiswaLama.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Baru =====");
		mahasiswaBaru.displayInfo();
		System.out.print("\n");
	}

}