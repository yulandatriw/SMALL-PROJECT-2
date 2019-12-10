import java.util.Scanner;

public class SmallProject {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		print("==RAPORT==\n");

		String nama, nim;
        int nilaiUTS, nilaiUAS;
        int[]nilai = new int[4];
        
        nilaiUTS = in.nextInt();

		print("Nama\t:");
		nama = in.nextLine(); 
		nama = in.nextLine();
		
		print("NIM\t:");
		nim = in.next();

		for(int a = 0; a < nilai.length; a++) {
			print("Nilai ke-" + (a+1) + "\n");
			
			print("Nilai\t:");
			nilai[a] = in.nextInt();
		}

		print("\n=====================================\n");
		
		System.out.println("Nama\t: " +nama);
		System.out.println("NIM\t: " +nim);
		
		int kkm = 75;
		double sum = 0;
		print("\n");
		for(int a = 0; a < nilai.length; a++) {
			System.out.println("Nilai\t: " +nilai[a]);
			print("Indeks\t: ");
			indeks(nilai[a]);
			sum += nilai[a];
		}
		print("=====================================\n");
		print("Rata rata = "+sum/nilai.length);
		int min, max;
		
		min = nilai[0];
		max = nilai[0];
		
		for(int a = 0; a < nilai.length; a ++) {
				if(max < nilai[a]) {
					max = nilai[a];
				}if(min > nilai[a]) {
					min = nilai[a];
				}
			}
		System.out.println("\nNilai Maksimum\t:" + max);
		System.out.println("Nilai Minimum\t:" + min);
		
		boolean or = true;
		for(int a = 0; a < nilai.length; a ++) {
			if(nilai[a]>=kkm && nilai[a]<=100) {
				or = true;
			}else if(nilai[a]>=0 && nilai[a]<kkm) {
				or = false;
			}else
				print("INVALID");
		}
		if(or == true) {
			print("Anda dinyatakan LULUS");
		}else if(or == false) {
			print("Anda dinyatakan TIDAK LULUS");
		}
	}

	static void indeks(int i) {
		if(i < 0 || i > 100) {
			System.out.println("Maaf, input salah");
		}else if(i >= 85) {
			System.out.println("A");
		}else if(i >= 80) {
			System.out.println("A-");
		}else if(i >= 75) {
			System.out.println("B+");
		}else if(i >= 70) {
			System.out.println("B");
		}else if(i >= 65) {
			System.out.println("C+");
		}else if(i >= 60) {
			System.out.println("C");
		}else if(i >= 55) {
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}

	static void print(String data) {
		System.out.print(data);
	}
}