package decisiontree;

import java.sql.SQLException;


public class proses6{

    public static void  proses6 () throws SQLException{
        System.out.println("=============== Buying ==============");
        hitungGini hitungBuyingLow = new hitungGini();
        hitungBuyingLow.Kondisidua7("Buying", "'Low'", "Safety","'med'", "Lugage_boot", "'small'", "Person", "'2'");
        System.out.println("====================================");
        hitungGini hitungBuyingMedHigh = new hitungGini();
        hitungBuyingMedHigh.Kondisidua8("Buying", "'med'","Buying", "'high'","Safety","'med'","Lugage_boot", "'small'", "Person", "'2'");
        hitungGini gainBuying = new hitungGini();
        gainBuying.gain();
        hitungGini giniBuying = new hitungGini();
        final double giniDBuyingMedHigh = giniBuying.giniDelta4();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Maintenance ==============");
        hitungGini hitungMaintenanceLow = new hitungGini();
        hitungMaintenanceLow.Kondisidua7("Maintenance", "'low'", "Safety","'med'", "Lugage_boot", "'small'","Person", "'2'");
        System.out.println("====================================");
        hitungGini hitungMaintenanceMedHigh = new hitungGini();
        hitungMaintenanceMedHigh.Kondisidua8("Maintenance", "'med'","Maintenance", "'high'","Safety","'med'","Lugage_boot", "'small'","Person", "'2'");
        hitungGini gainMaintenance = new hitungGini();
        gainMaintenance.gain();
        hitungGini giniMaintenance = new hitungGini();
        final double giniDMaintenanceMedHigh = giniMaintenance.giniDelta4();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Doors ==============");
        hitungGini hitungDoors3 = new hitungGini();
        hitungDoors3.Kondisidua7("Doors", "'3'", "Safety","'med'", "Lugage_boot", "'small'","Person", "'2'");
        System.out.println("====================================");
        hitungGini hitungDoors4more = new hitungGini();
        hitungDoors4more.Kondisidua8("Doors", "'4'","Doors", "'more'","Safety","'med'","Lugage_boot", "'small'","Person", "'2'");
        hitungGini gainDoors = new hitungGini();
        gainDoors.gain();
        hitungGini giniDoors = new hitungGini();
        final double giniDDoorsMedHigh = giniDoors.giniDelta4();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Person ==============");
        hitungGini hitungPerson2 = new hitungGini();
        hitungPerson2.Kondisidua7("Person", "'2'", "Safety","'med'", "Lugage_boot", "'small'", "Person", "'2'");
        System.out.println("====================================");
        hitungGini hitungPerson4More = new hitungGini();
        hitungPerson4More.Kondisidua8("Person", "'4'","Person", "'More'","Safety","'med'","Lugage_boot", "'small'", "Person", "'2'");
        hitungGini gainPerson = new hitungGini();
        gainPerson.gain();
        hitungGini giniPerson = new hitungGini();
        final double giniDPerson4More = giniPerson.giniDelta4();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Lugage_boot ==============");
        hitungGini hitungLugage_bootSmall = new hitungGini();
        hitungLugage_bootSmall.Kondisidua7("Lugage_boot", "'small'", "Safety","'med'", "Lugage_boot", "'small'", "Person", "'2'");
        System.out.println("====================================");
        hitungGini hitungLugage_bootMedBig = new hitungGini();
        hitungLugage_bootMedBig.Kondisidua8("Lugage_boot", "'med'","Lugage_boot", "'big'","Safety","'med'","Lugage_boot", "'small'", "Person", "'2'");
        hitungGini gainLugage_boot = new hitungGini();
        gainLugage_boot.gain();
        hitungGini giniLugage_boot = new hitungGini();
        final double giniDLugage_bootMedHigh = giniLugage_boot.giniDelta4();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("=============== Safety ==============");
        hitungGini hitungSafetyLow = new hitungGini();
        hitungSafetyLow.Kondisidua7("Safety", "'low'", "Safety","'med'", "Lugage_boot", "'small'", "Person", "'2'");
        System.out.println("====================================");
        hitungGini hitungSafetyMedHigh = new hitungGini();
        hitungSafetyMedHigh.Kondisidua8("Safety", "'med'","Safety", "'high'","Safety","'med'","Lugage_boot", "'small'", "Person", "'2'");
        hitungGini gainSafety = new hitungGini();
        gainSafety.gain();
        hitungGini giniSafety = new hitungGini();
        final double giniDSafetyMedHigh = giniSafety.giniDelta4();
        System.out.println("====================================");
        System.out.println("\n\n");
    
        System.out.println("Dikarenakan data dari cabang tersebut memiliki label homogen unacc, maka cabang kiri Person 2 akan dinyatakan sebagai leaf acc");
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
        System.out.println("    |    |     |-- Person [4, More]");
        System.out.println("    |    |  ");
        System.out.println("    |    |-- Luggage_Boot [Med,Big]");
        System.out.println("    |");
        System.out.println("    |");
        System.out.println("    |-- Safety [High]");
        System.out.println("\n");
    }
}
