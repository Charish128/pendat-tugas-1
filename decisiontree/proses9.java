package decisiontree;

import java.sql.SQLException;

public class proses9 {
    public static void  proses9 () throws SQLException{
        System.out.println("=============== Buying ==============");
        hitungGini hitungBuyingLow = new hitungGini();
        hitungBuyingLow.Kondisidua4("Buying", "'Low'", "Safety", "'high'");
        System.out.println("====================================");
        hitungGini hitungBuyingMedHigh = new hitungGini();
        hitungBuyingMedHigh.Kondisidua3("Buying", "'med'","Buying", "'high'","Safety", "'high'");
        hitungGini gainBuying = new hitungGini();
        gainBuying.gain();
        hitungGini giniBuying = new hitungGini();
        final double giniDBuyingMedHigh = giniBuying.giniDelta5();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Maintenance ==============");
        hitungGini hitungMaintenanceLow = new hitungGini();
        hitungMaintenanceLow.Kondisidua4("Maintenance", "'Low'", "Safety", "'high'");
        System.out.println("====================================");
        hitungGini hitungMaintenanceMedHigh = new hitungGini();
        hitungMaintenanceMedHigh.Kondisidua3("Maintenance", "'med'","Maintenance", "'high'","Safety", "'high'");
        hitungGini gainMaintenance = new hitungGini();
        gainMaintenance.gain();
        hitungGini giniMaintenance = new hitungGini();
        final double giniDMaintenanceMedHigh = giniMaintenance.giniDelta5();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Doors ==============");
        hitungGini hitungDoors3 = new hitungGini();
        hitungDoors3.Kondisidua4("Doors", "'3'", "Safety", "'high'");
        System.out.println("====================================");
        hitungGini hitungDoors4more = new hitungGini();
        hitungDoors4more.Kondisidua3("Doors", "'4'","Doors", "'more'","Safety", "'high'");
        hitungGini gainDoors = new hitungGini();
        gainDoors.gain();
        hitungGini giniDoors = new hitungGini();
        final double giniDDoors4more= giniDoors.giniDelta5();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Person ==============");
        hitungGini hitungPerson3 = new hitungGini();
        hitungPerson3.Kondisidua4("Person", "'2'", "Safety", "'high'");
        System.out.println("====================================");
        hitungGini hitungPerson4more = new hitungGini();
        hitungPerson4more.Kondisidua3("Person", "'4'","Person", "'More'","Safety", "'high'");
        hitungGini gainPerson = new hitungGini();
        gainPerson.gain();
        hitungGini giniPerson = new hitungGini();
        final double giniDPerson4more= giniPerson.giniDelta5();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Lugage_boot ==============");
        hitungGini hitungLugage_bootSmall = new hitungGini();
        hitungLugage_bootSmall.Kondisidua4("Lugage_boot", "'small'", "Safety", "'high'");
        System.out.println("====================================");
        hitungGini hitungLugage_bootMedBig = new hitungGini();
        hitungLugage_bootMedBig.Kondisidua3("Lugage_boot", "'med'","Lugage_boot", "'big'","Safety", "'high'");
        hitungGini gainLugage_boot = new hitungGini();
        gainLugage_boot.gain();
        hitungGini giniLugage_boot = new hitungGini();
        final double giniDLugage_boot= giniLugage_boot.giniDelta5();
        System.out.println("====================================");
        System.out.println("\n\n");

        System.out.println("=============== Safety ==============");
        hitungGini hitungSafetyMedHigh = new hitungGini();
        hitungSafetyMedHigh.Kondisidua4("Safety", "'low'", "Safety", "'high'");
        System.out.println("====================================");
        hitungGini hitunSafetyMedHigh = new hitungGini();
        hitunSafetyMedHigh.Kondisidua3("Safety", "'med'","Safety", "'high'","Safety", "'high'");
        hitungGini gainSafety = new hitungGini();
        gainSafety.gain();
        hitungGini giniSafety = new hitungGini();
        final double giniDSafety= giniSafety.giniDelta5();
        System.out.println("====================================");
        System.out.println("\n");

        System.out.println("Atribut Iterasi 9 yang terbesar adalah  : Lugage_Boot");
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
        System.out.println("    |    |-- Luggage_Boot [Small]");
        System.out.println("    |    |-- Luggage_Boot [Med,Big]");
        System.out.println("\n");
    }
    
}
