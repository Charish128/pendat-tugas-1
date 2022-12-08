package decisiontree;

import java.sql.SQLException;

public class proses7 {
    public static void proses7() throws SQLException {
        hitungEva.hitung5();
        System.out.println("========================================");
        System.out.println("Dikarenakan data dari cabang tersebut memiliki label homogen acc, maka cabang Kanan Person 4, More akan dinyatakan sebagai leaf acc");
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
        System.out.println("    |    |-- Luggage_Boot [Med,Big]");
        System.out.println("    |");
        System.out.println("    |");
        System.out.println("    |-- Safety [High]");
        System.out.println("\n");

    }

}
