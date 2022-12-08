package decisiontree;

import java.sql.SQLException;

public class proses2 {

    public static void proses2() throws SQLException {
        System.out.println("============== Safety ==============");
        hitungGini hitungSafetykiri = new hitungGini();
        hitungSafetykiri.Kondisisatu("Safety", "'low'");
        System.out.println("========================================");
        System.out.println("Dikarenakan data dari cabang tersebut memiliki lael homogen unacc, maka cabang kiri Safety Low akn dinyatakan sebagai leaf unacc");

        System.out.println("root");
        System.out.println("|");
        System.out.println("|-- Safety Low [unacc]");
        System.out.println("|-- Safety Med||High");
        System.out.println("\n");

    }

}