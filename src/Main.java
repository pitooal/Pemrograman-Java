import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int inputSelesai = 0;
        while (inputSelesai == 0) {
            System.out.print("Masukkan nama ke-" + (mahasiswa.size()+1) + ": ");
            String inputNama = input.nextLine();
            try {
                if (inputNama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                }

                if (inputNama.equals("selesai")) {
                    System.out.println("Daftar mahasiswa yang di inputkan:");
                    for (int i = 0; i < mahasiswa.size(); i++) {
                        System.out.println("- " + mahasiswa.get(i));
                    }
                    inputSelesai = 1;
                } else {
                    mahasiswa.add(inputNama);
                }
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}