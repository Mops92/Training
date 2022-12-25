import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       HashMap <Character, String> svinota = new HashMap<>();
       svinota.put('ф', "f");
       svinota.put('х', "h");

        Scanner sc = new Scanner(System.in);

        System.out.println(svinota.get(sc.next()));

    }
}