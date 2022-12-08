package decisiontree;
import java.sql.SQLException;

public class proses10 {
    public static void proses10() throws SQLException {
    hitungEva.hitung8();
    System.out.println("========================================");
    System.out.println("Dikarenakan data dari cabang tersebut memiliki label homogen good, maka cabang kanan Lugage_boot Small akan dinyatakan sebagai leaf good");

    System.out.println("\n");
    System.out.println("root");
    System.out.println("|");
    System.out.println("|-- Safety [Low] unacc");
    System.out.println("|-- Safety [Med||High]");
    System.out.println("    |");
    System.out.println("    |-- Safety [Med]");
    System.out.println("    |    |");
    System.out.println("    |    |-- Luggage_Boot [Small]");
    System.out.println("    |    |     |");
    System.out.println("    |    |     |-- Person [2] unacc");
    System.out.println("    |    |     |-- Person [4, More] acc");
    System.out.println("    |    |  ");
    System.out.println("    |    |-- Luggage_Boot [Med,Big] good");
    System.out.println("    |");
    System.out.println("    |");
    System.out.println("    |-- Safety [High]");
    System.out.println("    |    |  ");
    System.out.println("    |    |-- Luggage_Boot [Small] good");
    System.out.println("    |    |-- Luggage_Boot [Med,Big]");
    System.out.println("\n");
    }
}
