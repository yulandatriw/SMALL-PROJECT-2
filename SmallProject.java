import java.util.Scanner;
public class SmallProject {

    static Scanner in = new Scanner(System.in);
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
    static void print(String data){
        System.out.print(data);
    
    }
    static double nilaiAkhir(double uas, double uts, double sumTugas, double sumUH){
        return (0.4*uas) + (0.3*uts) + (0.15*sumTugas/2) + (0.15*sumUH/2);
    }
    public static void main(String[] args) {
        System.out.println("RAPORT");

        String nama, nim;
        print("Nama\t: ");
        nama = in.nextLine();
        print("NIM\t: ");
        nim = in.next();

        print("Masukkan nilai" + "\n");

        int sumTugas = 0;
        int[]nilai = new int[6];
        for(int a = 0; a < 2; a++){
            print("Nilai tugas " + (a+1) + "\t: ");
            nilai[a] = in.nextInt();
            sumTugas+=nilai[a];
        }
        int sumUH = 0;
        for(int a = 2; a < 4 ; a++){
            print("Nilai ulangan harian " + (a-1) + "\t: ");
            nilai[a] = in.nextInt();
            sumUH += nilai[a];
        }
        int uas, uts;

        print("Nilai UTS\t: ");
        uts = in.nextInt();
        print("Nilai UAS\t: ");
        uas = in.nextInt();
        
        nilai[4]= uts;
        nilai[5]= uas;

        double sum = 0;
        for(int a = 0; a < nilai.length; a++){
           sum+=nilai[a];
        }
       
        double na = nilaiAkhir(uas, uts, sumTugas, sumUH);

        print("====================\n");
        
        boolean statusNilai = true;
        for(int a = 0; a < nilai.length; a++){
            if(nilai[a] < 0 || nilai[a] > 100){
                statusNilai = false;
            }
        }
        if(statusNilai == true){
            print("Nama\t: " + nama);
            print("\nNIM\t: " + nim);
            print("\nDAFTAR NILAI\n");
            for(int a = 0; a < 2; a++){
                print("\nTugas " + (a+1) + "\t: " + nilai[a]);
            }
            for(int a = 2; a < 4 ; a++){
                print("\nUH " + (a-1) + "\t: " + nilai[a]);
            }
                print("\nUTS\t: " + nilai[4]);

                print("\nUAS\t: " + nilai[5]);
                
                print("\n==================");
                print("\nJumlah nilai\t: " + sum);
                print("\nNilai akhir\t: " + na);
                print("\nIndeks\t\t: ");
                indeks((int)na);
            }
        else{
            print("Maaf, nilai tidak valid");
        }
        
        if(statusNilai==true){
            if(na >= 75 && na <= 100){
                print("Anda dinyatakan LULUS");
            }else{
                print("Maaf anda TIDAK LULUS");
                
            }
        }
    }
}