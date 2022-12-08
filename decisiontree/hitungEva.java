package decisiontree;
import java.sql.*;
import java.util.ArrayList;


public class hitungEva {
    static double giniEva;
    static double giniSafe;
    static double giniSafeMed;
    static double giniLugageMedBig;
    static double giniLugageMedBig1;
    static double giniLugageSmall;
    static double giniLugageSmall1;
    static double giniPerson2;
    static double giniPerson4More;
    static double giniSafeHigh;

    public static void hitung() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample`;");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] eva = new String[list.size()];
        list.toArray(eva);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < eva.length; i++) {
            if(eva[i].equals("unacc")){
                unacc++;
            }
            if(eva[i].equals("acc")){
                acc++;
            }
            else if(eva[i].equals("good")){
                good++;
            }
            else if(eva[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Evaluation =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniEva = 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent    : " + giniEva);
        System.out.println("==========================================");
    }

    public static void hitung1() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'med' || Safety = 'high';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safe = new String[list.size()];
        list.toArray(safe);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safe.length; i++) {
            if(safe[i].equals("unacc")){
                unacc++;
            }
            if(safe[i].equals("acc")){
                acc++;
            }
            else if(safe[i].equals("good")){
                good++;
            }
            else if(safe[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniSafe= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
     
    }

    public static void hitung2() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'med';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safeMed = new String[list.size()];
        list.toArray(safeMed);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safeMed.length; i++) {
            if(safeMed[i].equals("unacc")){
                unacc++;
            }
            if(safeMed[i].equals("acc")){
                acc++;
            }
            else if(safeMed[i].equals("good")){
                good++;
            }
            else if(safeMed[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= SafetyMed =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniSafeMed= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent    : " + giniSafeMed);
        System.out.println("==========================================");
    }

    public static void hitung3() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'med' && Lugage_boot = 'small';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safeMedLugageSmall = new String[list.size()];
        list.toArray(safeMedLugageSmall);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safeMedLugageSmall.length; i++) {
            if(safeMedLugageSmall[i].equals("unacc")){
                unacc++;
            }
            if(safeMedLugageSmall[i].equals("acc")){
                acc++;
            }
            else if(safeMedLugageSmall[i].equals("good")){
                good++;
            }
            else if(safeMedLugageSmall[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Lugage_bootSmall =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniLugageSmall= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent     : " + giniLugageSmall);
        System.out.println("==========================================");
    }
    
    public static void hitung4() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'med' && Lugage_boot = 'small' && Person = '2';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safeMedLugageSmall = new String[list.size()];
        list.toArray(safeMedLugageSmall);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safeMedLugageSmall.length; i++) {
            if(safeMedLugageSmall[i].equals("unacc")){
                unacc++;
            }
            if(safeMedLugageSmall[i].equals("acc")){
                acc++;
            }
            else if(safeMedLugageSmall[i].equals("good")){
                good++;
            }
            else if(safeMedLugageSmall[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Person2 =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniPerson2= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent     : " + giniPerson2);
        System.out.println("==========================================");
    }

    public static void hitung5() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'med' && Lugage_boot = 'small' && Person = '4' && Person = 'More';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safeMedLugageSmall = new String[list.size()];
        list.toArray(safeMedLugageSmall);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safeMedLugageSmall.length; i++) {
            if(safeMedLugageSmall[i].equals("unacc")){
                unacc++;
            }
            if(safeMedLugageSmall[i].equals("acc")){
                acc++;
            }
            else if(safeMedLugageSmall[i].equals("good")){
                good++;
            }
            else if(safeMedLugageSmall[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Person4More =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniPerson4More= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent     : " + giniPerson4More);
        System.out.println("==========================================");
    }

    public static void hitung6() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'med' && (Lugage_boot = 'med' || Lugage_boot = 'high');");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safeMedLugage = new String[list.size()];
        list.toArray(safeMedLugage);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safeMedLugage.length; i++) {
            if(safeMedLugage[i].equals("unacc")){
                unacc++;
            }
            if(safeMedLugage[i].equals("acc")){
                acc++;
            }
            else if(safeMedLugage[i].equals("good")){
                good++;
            }
            else if(safeMedLugage[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Person4More =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniLugageMedBig= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent     : " + giniLugageMedBig);
        System.out.println("==========================================");
    }

    public static void hitung7() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'high';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] safeHigh = new String[list.size()];
        list.toArray(safeHigh);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < safeHigh.length; i++) {
            if(safeHigh[i].equals("unacc")){
                unacc++;
            }
            if(safeHigh[i].equals("acc")){
                acc++;
            }
            else if(safeHigh[i].equals("good")){
                good++;
            }
            else if(safeHigh[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= SafetyMed =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniSafeHigh= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent    : " + giniSafeMed);
        System.out.println("==========================================");
    }

    public static void hitung8() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'high' && Lugage_boot = 'small';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] Lugage = new String[list.size()];
        list.toArray(Lugage);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < Lugage.length; i++) {
            if(Lugage[i].equals("unacc")){
                unacc++;
            }
            if(Lugage[i].equals("acc")){
                acc++;
            }
            else if(Lugage[i].equals("good")){
                good++;
            }
            else if(Lugage[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Lugage_bootSmall =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniLugageSmall1= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent     : " + giniLugageSmall1);
        System.out.println("==========================================");
    }

    public static void hitung9() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE Safety = 'high' && Lugage_boot = 'small';");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] Lugage = new String[list.size()];
        list.toArray(Lugage);

        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < Lugage.length; i++) {
            if(Lugage[i].equals("unacc")){
                unacc++;
            }
            if(Lugage[i].equals("acc")){
                acc++;
            }
            else if(Lugage[i].equals("good")){
                good++;
            }
            else if(Lugage[i].equals("vgood")){
                vgood++;
            }
        }

        int total = unacc+acc+good+vgood;
        System.out.println("============= Lugage_bootSmall =================");
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + total + " data");
 
      
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        hitungEva.giniLugageMedBig1= 1 - (Math.pow(a/total, 2)) - (Math.pow(b/total, 2)) - (Math.pow(c/total, 2)) - (Math.pow(d/total, 2));
        System.out.println("Gini Parent     : " + giniLugageMedBig1);
        System.out.println("==========================================");
    }
}
