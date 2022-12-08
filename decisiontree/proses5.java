package decisiontree;

import java.sql.SQLException;

public class proses5 {

    public static void  proses5 () throws SQLException{

    System.out.println("=============== Buying ==============");
    hitungGini hitungBuyingLow = new hitungGini();
    hitungBuyingLow.Kondisidua5("Buying", "'Low'", "Safety","'med'", "Lugage_boot", "'small'");
    System.out.println("====================================");
    hitungGini hitungBuyingMedHigh = new hitungGini();
    hitungBuyingMedHigh.Kondisidua6("Buying", "'med'","Buying", "'high'","Safety","'med'","Lugage_boot", "'small'");
    hitungGini gainBuying = new hitungGini();
    gainBuying.gain();
    hitungGini giniBuying = new hitungGini();
    final double giniDBuyingMedHigh = giniBuying.giniDelta3();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Maintenance ==============");
    hitungGini hitungMaintenanceLow = new hitungGini();
    hitungMaintenanceLow.Kondisidua5("Maintenance", "'low'", "Safety","'med'", "Lugage_boot", "'small'");
    System.out.println("====================================");
    hitungGini hitungMaintenanceMedHigh = new hitungGini();
    hitungMaintenanceMedHigh.Kondisidua6("Maintenance", "'med'","Maintenance", "'high'","Safety","'med'","Lugage_boot", "'small'");
    hitungGini gainMaintenance = new hitungGini();
    gainMaintenance.gain();
    hitungGini giniMaintenance = new hitungGini();
    final double giniDMaintenanceMedHigh = giniMaintenance.giniDelta3();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Doors ==============");
    hitungGini hitungDoors3 = new hitungGini();
    hitungDoors3.Kondisidua5("Doors", "'3'", "Safety","'med'", "Lugage_boot", "'small'");
    System.out.println("====================================");
    hitungGini hitungDoors4more = new hitungGini();
    hitungDoors4more.Kondisidua6("Doors", "'4'","Doors", "'more'","Safety","'med'","Lugage_boot", "'small'");
    hitungGini gainDoors = new hitungGini();
    gainDoors.gain();
    hitungGini giniDoors = new hitungGini();
    final double giniDDoorsMedHigh = giniDoors.giniDelta3();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Person ==============");
    hitungGini hitungPerson2 = new hitungGini();
    hitungPerson2.Kondisidua5("Person", "'2'", "Safety","'med'", "Lugage_boot", "'small'");
    System.out.println("====================================");
    hitungGini hitungPerson4More = new hitungGini();
    hitungPerson4More.Kondisidua6("Person", "'4'","Person", "'More'","Safety","'med'","Lugage_boot", "'small'");
    hitungGini gainPerson = new hitungGini();
    gainPerson.gain();
    hitungGini giniPerson = new hitungGini();
    final double giniDPerson4More = giniPerson.giniDelta3();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Lugage_boot ==============");
    hitungGini hitungLugage_bootSmall = new hitungGini();
    hitungLugage_bootSmall.Kondisidua5("Lugage_boot", "'small'", "Safety","'med'", "Lugage_boot", "'small'");
    System.out.println("====================================");
    hitungGini hitungLugage_bootMedBig = new hitungGini();
    hitungLugage_bootMedBig.Kondisidua6("Lugage_boot", "'med'","Lugage_boot", "'big'","Safety","'med'","Lugage_boot", "'small'");
    hitungGini gainLugage_boot = new hitungGini();
    gainLugage_boot.gain();
    hitungGini giniLugage_boot = new hitungGini();
    final double giniDLugage_bootMedHigh = giniLugage_boot.giniDelta3();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("=============== Safety ==============");
    hitungGini hitungSafetyLow = new hitungGini();
    hitungSafetyLow.Kondisidua5("Safety", "'low'", "Safety","'med'", "Lugage_boot", "'small'");
    System.out.println("====================================");
    hitungGini hitungSafetyMedHigh = new hitungGini();
    hitungSafetyMedHigh.Kondisidua6("Safety", "'med'","Safety", "'high'","Safety","'med'","Lugage_boot", "'small'");
    hitungGini gainSafety = new hitungGini();
    gainSafety.gain();
    hitungGini giniSafety = new hitungGini();
    final double giniDSafetyMedHigh = giniSafety.giniDelta3();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("Atribut Iterasi 5 yang terbesar adalah  : Person");
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
    System.out.println("    |    |     |-- Person [2]");
    System.out.println("    |    |     |-- Person [4, More]");
    System.out.println("    |    |  ");
    System.out.println("    |    |-- Luggage_Boot [Med,Big]");
    System.out.println("    |");
    System.out.println("    |");
    System.out.println("    |-- Safety [High]");
    System.out.println("\n");
    }
}
