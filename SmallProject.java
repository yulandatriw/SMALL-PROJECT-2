import java.util.Scanner;

public class SmallProject {

    static Scanner in = new Scanner(System.in);

    //indeks method
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
	//print string method
    static void print(String data){
        System.out.print(data);
    
    }
    public static void main(String[] args) {

        System.out.println("== SISTEM PENGHITUNG NILAI AKHIR RAPORT ==");

        String nama, nim;
        print("Nama\t: ");
        nama = in.nextLine();
        print("NIM\t: ");
        nim = in.next();

        int countTugas, countUH;

        print("Ada berapa nilai tugas yang diinputkan\n=>");
        countTugas = in.nextInt();
        print("Ada berapa nilai ulangan harian yang diinputkan\n=>");
        countUH = in.nextInt();

        print("---------------------");
        print("\nMasukkan nilai" + "\n");

        //input nilai tugas
        int sumTugas = 0;
        int[]nilaiTugas = new int[countTugas];
        for(int a = 0; a < countTugas; a++){
            print("Nilai tugas " + (a+1) + "\t: ");
            nilaiTugas[a] = in.nextInt();
            sumTugas+=nilaiTugas[a];
        }
       	//input nilai ulangan harian
        int sumUH = 0;
        int[]nilaiUH = new int[countUH];
        for(int a = 0; a < countUH ; a++){
            print("Nilai ulangan harian " + (a+1) + "\t: ");
            nilaiUH[a] = in.nextInt();
            sumUH += nilaiUH[a];
        }
        double avgTugas = sumTugas/countTugas;//rata2 nilai tugas

        double avgUH = sumUH/countUH;//rata2 nilai ulangan harian

        int uas, uts;
        print("Nilai UTS\t: ");
        uts = in.nextInt();
        print("Nilai UAS\t: ");
        uas = in.nextInt();
        
        double sum = sumUH + sumTugas + uas + uts;//jumlah nilai
       
        double na = (0.4*uas + 0.3*uts + 0.15*avgTugas + 0.15*avgUH);//hitung nilai akhir

        print("=======================\n");
        
        boolean statusNilai = true;
        for(int a = 0; a < nilaiTugas.length; a++){
            if(nilaiTugas[a] < 0 || nilaiTugas[a] > 100){
                statusNilai = false;
            }   
        }
        for(int a = 0; a < nilaiUH.length; a++){
            if(nilaiUH[a] < 0 || nilaiUH[a] > 100){
                statusNilai = false;
            }   
        }
        if(uts < 0 || uts > 100){
            statusNilai = false;
        }else if( uas < 0 || uas > 100){
            statusNilai = false;
        }

        if(statusNilai == true){
            print("Nama\t: " + nama);
            print("\nNIM\t: " + nim);
            print("\nDAFTAR NILAI");
            for(int a = 0; a < countTugas; a++){
                print("\nTugas " + (a+1) + "\t: " + nilaiTugas[a]);
            }
            for(int a = 0; a < countUH ; a++){
                print("\nUH " + (a+1) + "\t: " + nilaiUH[a]);
            }
            print("\nUTS\t: " + uts);

            print("\nUAS\t: " + uas);
                
            print("\n--------------------\n");
            print("Jumlah nilai\t: " + sum);
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
