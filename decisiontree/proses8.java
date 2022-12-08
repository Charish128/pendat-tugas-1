package decisiontree;

import java.sql.SQLException;

public class proses8 {
    public static void proses8() throws SQLException {
        hitungEva.hitung6();
        System.out.println("========================================");
        System.out.println("Dikarenakan data dari cabang tersebut memiliki label homogen good, maka cabang kanan Lugage_boot Med, Big akan dinyatakan sebagai leaf good");

        System.out.println("Atribut Iterasi 8 yang terbesar adalah  : Lugage_Boot");
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
        System.out.println("\n");

    }

}
