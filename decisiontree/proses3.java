package decisiontree;

import java.sql.SQLException;

public class proses3 {

    public static void proses3() throws SQLException{
    System.out.println("=============== Buying ==============");
    hitungGini hitungBuyingLow = new hitungGini();
    hitungBuyingLow.Kondisidua("Buying", "'Low'", "Safety", "'med'", "Safety", "'high'");
    System.out.println("====================================");
    hitungGini hitungBuyingMedHigh = new hitungGini();
    hitungBuyingMedHigh.Kondisidua1("Buying", "'med'","Buying", "'high'","Safety", "'med'","Safety", "'high'");
    hitungGini hitungDoors4More = new hitungGini();
    hitungDoors4More.gain();
    hitungGini giniBuying = new hitungGini();
    final double giniDBuyingMedHigh = giniBuying.giniDelta1();
    System.out.println("====================================");
    System.out.println("\n\n");


    System.out.println("============= Maintenance ===========");
    hitungGini hitungMaintenanceMed = new hitungGini();
    hitungMaintenanceMed.Kondisidua("Maintenance", "'med'", "Safety", "'med'", "Safety", "'high'");
    System.out.println("====================================");
    hitungGini hitungMaintenanceLowHitungGini = new hitungGini();
    hitungMaintenanceLowHitungGini.Kondisidua1("Maintenance", "'low'","Maintenance", "'high'","Safety", "'med'","Safety", "'high'");
    hitungGini gainMaintenance = new hitungGini();
    gainMaintenance.gain();
    hitungGini giniMaintenance = new hitungGini();
    final double giniDMaintenance = giniMaintenance.giniDelta1();
    System.out.println("====================================");
    System.out.println("\n\n");



    System.out.println("=============== Doors ==============");
    hitungGini hitungDoors3= new hitungGini();
    hitungDoors3.Kondisidua("Doors", "'3'", "Safety", "'med'", "Safety", "'high'");
    System.out.println("====================================");
    hitungGini hitungDoors4MoreGini = new hitungGini();
    hitungDoors4MoreGini.Kondisidua1("Doors", "'4'","Doors", "'more'","Safety", "'med'","Safety", "'high'");
    hitungGini hitungDoors4MoreGain = new hitungGini();
    hitungDoors4MoreGain.gain();
    hitungGini giniDoors = new hitungGini();
    final double giniDDoors = giniDoors.giniDelta1();
    System.out.println("====================================");
    System.out.println("\n\n");


    System.out.println("=============== Person ==============");
    hitungGini hitungPerson2= new hitungGini();
    hitungPerson2.Kondisidua("Person", "'2'", "Safety", "'med'", "Safety", "'high'");
    System.out.println("====================================");
    hitungGini hitungPerson4MoreGini = new hitungGini();
    hitungPerson4MoreGini.Kondisidua1("Person", "'4'","Person", "'More'","Safety", "'med'","Safety", "'high'");
    hitungGini hitungPersonGain = new hitungGini();
    hitungPersonGain.gain();
    hitungGini giniPerson = new hitungGini();
    final double giniDPerson = giniPerson.giniDelta1();
    System.out.println("====================================");
    System.out.println("\n\n");


    System.out.println("=============== Lugage_Boot ==============");
    hitungGini hitungLugage_BootSmall= new hitungGini();
    hitungLugage_BootSmall.Kondisidua("Lugage_Boot", "'small'", "Safety", "'med'", "Safety", "'high'");
    System.out.println("====================================");
    hitungGini hitungLugage_BootMedBigGini = new hitungGini();
    hitungLugage_BootMedBigGini.Kondisidua1("Lugage_Boot", "'med'","Lugage_Boot", "'big'","Safety", "'med'","Safety", "'high'");
    hitungGini hitungLugage_BootGain = new hitungGini();
    hitungLugage_BootGain.gain();
    hitungGini giniLugage_Boot = new hitungGini();
    final double giniDLugage_Boot = giniLugage_Boot.giniDelta1();
    System.out.println("====================================");
    System.out.println("\n\n");


    System.out.println("=============== Safety ==============");
    hitungGini hitungSafetyLow= new hitungGini();
    hitungSafetyLow.Kondisidua("Safety", "'med'", "Safety", "'med'", "Safety", "'high'");
    System.out.println("====================================");
    hitungGini hitungSafetyMedHighGini = new hitungGini();
    hitungSafetyMedHighGini.Kondisidua1("Safety", "'low'","Safety", "'high'","Safety", "'med'","Safety", "'high'");
    hitungGini hitungSafetyGain = new hitungGini();
    hitungSafetyGain.gain();
    hitungGini giniSafety = new hitungGini();
    final double giniDSafety = giniSafety.giniDelta1();
    System.out.println("====================================");
    System.out.println("\n\n");

    System.out.println("Atribut Iterasi 3 yang terbesar adalah  : Safety");
        System.out.println("\n");
        System.out.println("root");
        System.out.println("|");
        System.out.println("|-- Safety Low [unacc]");
        System.out.println("|-- Safety Med||High");
        System.out.println("    |");
        System.out.println("    |-- Safety Med");
        System.out.println("    |-- Safety High");
        System.out.println("\n");
    }
}
