package decisiontree;

import java.sql.SQLException;

public class proses {
 

    public static void main(String[] args) throws SQLException {
        hitungEva.hitung();
        System.out.println("\n\n");
        hitungEva.hitung1();
        hitungEva.hitung2();
        System.out.println("\n\n");
        hitungEva.hitung3();
        hitungEva.hitung4();
        hitungEva.hitung7();

        System.out.println("=========== ITERASI PERTAMA =========");        

        System.out.println("=============== Buying ==============");
        hitungGini hitungBuyingKiri = new hitungGini();
        hitungBuyingKiri.Kondisisatu("Buying", "'Low'");
        hitungGini hitungBuyingKanan = new hitungGini();
        hitungBuyingKanan.Kondisidua2("Buying", "'med'", "Buying", "'high'");
        hitungGini gainBuying = new hitungGini();
        gainBuying.gain();
        hitungGini giniBuying = new hitungGini();
        final double giniDBuying = giniBuying.giniDelta();
        System.out.println("====================================");
        System.out.println("\n\n");


        System.out.println("============= Maintenance ===========");
        hitungGini hitungMaintenanceKiri = new hitungGini();
        hitungMaintenanceKiri.Kondisisatu("Maintenance", "'med'");
        hitungGini hitungMaintenanceKanan = new hitungGini();
        hitungMaintenanceKanan.Kondisidua2("Maintenance", "'low'", "Maintenance", "'high'");
        hitungGini gainMaintenance = new hitungGini();
        gainMaintenance.gain();
        hitungGini giniMaintenance = new hitungGini();
        final double giniDMaintenance = giniMaintenance.giniDelta();
        System.out.println("====================================");
        System.out.println("\n\n");



        System.out.println("=============== Doors ==============");
        hitungGini hitungDoorsKiri = new hitungGini();
        hitungDoorsKiri.Kondisisatu("Doors", "'3'");
        hitungGini hitungDoorsKanan = new hitungGini();
        hitungDoorsKanan.Kondisidua2("Doors", "'4'", "Doors", "'more'");
        hitungGini gainDoors = new hitungGini();
        gainDoors.gain();
        hitungGini giniDoors = new hitungGini();
        final double giniDDoors = giniDoors.giniDelta();
        System.out.println("====================================");
        System.out.println("\n\n");


        System.out.println("=============== Person ==============");
        hitungGini hitungPersonsKiri = new hitungGini();
        hitungPersonsKiri.Kondisisatu("Person", "'2'");
        hitungGini hitungPersonsKanan = new hitungGini();
        hitungPersonsKanan.Kondisidua2("Person", "'4'", "Person", "'More'");
        hitungGini gainPersons = new hitungGini();
        gainPersons.gain();
        hitungGini giniPerson = new hitungGini();
        final double giniDPerson = giniPerson.giniDelta();
        System.out.println("====================================");
        System.out.println("\n\n");


        System.out.println("=============== Lugage_boot ==============");
        hitungGini hitungLugage_bootKiri = new hitungGini();
        hitungLugage_bootKiri.Kondisisatu("Lugage_boot", "'small'");
        hitungGini hitungLugage_bootKanan = new hitungGini();
        hitungLugage_bootKanan.Kondisidua2("Lugage_boot", "'med'", "Lugage_boot", "'big'");
        hitungGini gainLugage_boot = new hitungGini();
        gainLugage_boot.gain();
        hitungGini giniLugage_boot = new hitungGini();
        final double giniDLugage_boot = giniLugage_boot.giniDelta();
        System.out.println("====================================");
        System.out.println("\n\n");


        System.out.println("=============== Safety ==============");
        hitungGini hitungSafetyKiri = new hitungGini();
        hitungSafetyKiri.Kondisisatu("Safety", "'low'");
        hitungGini hitungSafetyKanan = new hitungGini();
        hitungSafetyKanan.Kondisidua2("Safety", "'med'", "Safety", "'high'");
        hitungGini gainSafety = new hitungGini();
        gainSafety.gain();
        hitungGini giniSafety = new hitungGini();
        final double giniDSafety = giniSafety.giniDelta();
        System.out.println("====================================");
        System.out.println("\n\n");


        
        double[] gainAtribut = {giniDBuying, giniDMaintenance, giniDPerson, giniDDoors, giniDLugage_boot, giniDSafety};
        double max_num = gainAtribut[0];
        double min_num = gainAtribut[0];
        for ( int i = 0; i < gainAtribut.length; i++){
            if (max_num < gainAtribut[i]){
                max_num = gainAtribut[i];
            }
        }
        System.out.println("Atribut terbesar adalah Safety : Safety ");
        System.out.println("\n");
        System.out.println("root");
        System.out.println("|");
        System.out.println("|-- Safety Low");
        System.out.println("|-- Safety Med||High");
        System.out.println("\n");

        System.out.println("=========== ITERASI KEDUA =============");        

        proses2.proses2();

        System.out.println("=========== ITERASI KETIGA ============");        

        proses3.proses3();

        System.out.println("=========== ITERASI KEEMPAT ============");

        proses4.proses4();

        System.out.println("=========== ITERASI KELIMA ============");

        proses5.proses5();
        System.out.println("\n");

        System.out.println("=========== ITERASI KEENAM ============");

        proses6.proses6();
        System.out.println("\n");
        
        System.out.println("=========== ITERASI KETUJUH ============");

        proses7.proses7();
        System.out.println("\n");

        System.out.println("=========== ITERASI KEDELAPAN ============");

        proses8.proses8();
        System.out.println("\n");

        System.out.println("=========== ITERASI KESEMBILAN ============");

        proses9.proses9();
        System.out.println("\n");

        System.out.println("=========== ITERASI KESEPULUH ============");

        proses10.proses10();
        System.out.println("\n");

        System.out.println("=========== ITERASI KESEBELAS ============");

        proses11.proses11();
        System.out.println("\n");


    }
}
