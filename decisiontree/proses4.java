package decisiontree;

import java.sql.SQLException;


public class proses4{

    public static void  proses4 () throws SQLException{
    System.out.println("=============== Buying ==============");
    hitungGini hitungBuyingLow = new hitungGini();
    hitungBuyingLow.Kondisidua4("Buying", "'Low'", "Safety", "'med'");
    System.out.println("====================================");
    hitungGini hitungBuyingMedHigh = new hitungGini();
    hitungBuyingMedHigh.Kondisidua3("Buying", "'med'","Buying", "'high'","Safety", "'med'");
    hitungGini gainBuying = new hitungGini();
    gainBuying.gain();
    hitungGini giniBuying = new hitungGini();
    final double giniDBuyingMedHigh = giniBuying.giniDelta2();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Maintenance ==============");
    hitungGini hitungMaintenanceLow = new hitungGini();
    hitungMaintenanceLow.Kondisidua4("Maintenance", "'Low'", "Safety", "'med'");
    System.out.println("====================================");
    hitungGini hitungMaintenanceMedHigh = new hitungGini();
    hitungMaintenanceMedHigh.Kondisidua3("Maintenance", "'med'","Maintenance", "'high'","Safety", "'med'");
    hitungGini gainMaintenance = new hitungGini();
    gainMaintenance.gain();
    hitungGini giniMaintenance = new hitungGini();
    final double giniDMaintenanceMedHigh = giniMaintenance.giniDelta2();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Doors ==============");
    hitungGini hitungDoors3 = new hitungGini();
    hitungDoors3.Kondisidua4("Doors", "'3'", "Safety", "'med'");
    System.out.println("====================================");
    hitungGini hitungDoors4more = new hitungGini();
    hitungDoors4more.Kondisidua3("Doors", "'4'","Doors", "'more'","Safety", "'med'");
    hitungGini gainDoors = new hitungGini();
    gainDoors.gain();
    hitungGini giniDoors = new hitungGini();
    final double giniDDoors4more= giniDoors.giniDelta2();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Person ==============");
    hitungGini hitungPerson3 = new hitungGini();
    hitungPerson3.Kondisidua4("Person", "'2'", "Safety", "'med'");
    System.out.println("====================================");
    hitungGini hitungPerson4more = new hitungGini();
    hitungPerson4more.Kondisidua3("Person", "'4'","Person", "'More'","Safety", "'med'");
    hitungGini gainPerson = new hitungGini();
    gainPerson.gain();
    hitungGini giniPerson = new hitungGini();
    final double giniDPerson4more= giniPerson.giniDelta2();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Lugage_boot ==============");
    hitungGini hitungLugage_bootSmall = new hitungGini();
    hitungLugage_bootSmall.Kondisidua4("Lugage_boot", "'small'", "Safety", "'med'");
    System.out.println("====================================");
    hitungGini hitungLugage_bootMedBig = new hitungGini();
    hitungLugage_bootMedBig.Kondisidua3("Lugage_boot", "'med'","Lugage_boot", "'big'","Safety", "'med'");
    hitungGini gainLugage_boot = new hitungGini();
    gainLugage_boot.gain();
    hitungGini giniLugage_boot = new hitungGini();
    final double giniDLugage_boot= giniLugage_boot.giniDelta2();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("Atribut Iterasi 4 yang terbesar adalah  : Lugage_Boot");
    System.out.println("\n");
    System.out.println("root");
    System.out.println("|");
    System.out.println("|-- Safety [Low] unacc");
    System.out.println("|-- Safety [Med||High]");
    System.out.println("    |");
    System.out.println("    |-- Safety [Med]");
    System.out.println("    |    |");
    System.out.println("    |    |-- Luggage_Boot [Small]");
    System.out.println("    |    |-- Luggage_Boot [Med,Big]");
    System.out.println("    |");
    System.out.println("    |");
    System.out.println("    |-- Safety [High]");
    System.out.println("\n");

    }
}
