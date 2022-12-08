package decisiontree;
import java.sql.*;
import java.util.ArrayList;

public class hitungGini extends hitungEva {
    static double giniKondisisatu;
    static int totalKondisisatu;
    static double giniKondisidua;
    static int totalKondisidua;
    static double gain;
    static double gain1;
    static double giniD;
    static double giniD1;
    static double giniD2;
    static double giniD3;
    static double giniD4;
    

    public double Kondisisatu(String atribut, String nilai) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisisatu = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisisatu + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisisatu == 0){
            giniKondisisatu = 0;
        }else {    
        hitungGini.giniKondisisatu = 1 - (Math.pow(a/totalKondisisatu, 2)) - (Math.pow(b/totalKondisisatu, 2)) - (Math.pow(c/totalKondisisatu, 2)) - (Math.pow(d/totalKondisisatu, 2));
        System.out.println("Gini (D)        : " + giniKondisisatu);
        System.out.println("=====================================");
        }
        con.close();
        return 0;
    }

    public double Kondisisatu2(String atribut, String nilai) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisidua = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisidua + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisidua == 0){
            giniKondisidua = 0;
        }else {    
        hitungGini.giniKondisidua = 1 - (Math.pow(a/totalKondisidua, 2)) - (Math.pow(b/totalKondisidua, 2)) - (Math.pow(c/totalKondisidua, 2)) - (Math.pow(d/totalKondisidua, 2));
        System.out.println("Gini (D)        : " + giniKondisidua);
        }
        con.close();
        return 0;
    }

    public double Kondisidua(String atribut, String nilai,String atribut1, String nilai1, String atribut2, String nilai2) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+" && ("+atribut1+"="+nilai1+" || "+atribut2+"="+nilai2+");");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisisatu = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisisatu + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisisatu == 0){
            giniKondisisatu = 0;
        }else {        
        hitungGini.giniKondisisatu = 1 - (Math.pow(a/totalKondisisatu, 2)) - (Math.pow(b/totalKondisisatu, 2)) - (Math.pow(c/totalKondisisatu, 2)) - (Math.pow(d/totalKondisisatu, 2));
        System.out.println("Gini (D)        : " + giniKondisisatu);
        }
        con.close();
        return 0;
        
    }

    public double Kondisidua1(String atribut, String nilai,String atribut1, String nilai1, String atribut2, String nilai2, String atribut3, String nilai3) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE ("+atribut+"="+nilai+" || "+atribut1+"="+nilai1+") && ("+atribut2+"="+nilai2+" || "+atribut3+"="+nilai3+");");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisidua = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisidua + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisidua == 0){
            giniKondisidua = 0;
        }else {
            hitungGini.giniKondisidua = 1 - (Math.pow(a/totalKondisidua, 2)) - (Math.pow(b/totalKondisidua, 2)) - (Math.pow(c/totalKondisidua, 2)) - (Math.pow(d/totalKondisidua, 2));
            System.out.println("Gini (D)        : " + giniKondisidua);
            }

        con.close();
        return 0;
        
    }

    public double Kondisidua2(String atribut, String nilai, String atribut2, String nilai2) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+" || "+atribut2+"="+nilai2+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisidua = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisidua + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisidua == 0){
            giniKondisidua = 0;
        }else {
            hitungGini.giniKondisidua = 1 - (Math.pow(a/totalKondisidua, 2)) - (Math.pow(b/totalKondisidua, 2)) - (Math.pow(c/totalKondisidua, 2)) - (Math.pow(d/totalKondisidua, 2));
            System.out.println("Gini (D)        : " + giniKondisisatu);
            }

        con.close();
        return 0;
    }

    public double Kondisidua3(String atribut, String nilai, String atribut1, String nilai1, String atribut2, String nilai2) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE ("+atribut+"="+nilai+" || "+atribut1+"="+nilai1+") && "+atribut2+"="+nilai2+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisidua = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisidua + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisidua == 0){
            giniKondisidua = 0;
        }else {
            hitungGini.giniKondisidua = 1 - (Math.pow(a/totalKondisidua, 2)) - (Math.pow(b/totalKondisidua, 2)) - (Math.pow(c/totalKondisidua, 2)) - (Math.pow(d/totalKondisidua, 2));
            System.out.println("Gini (D)        : " + giniKondisidua);
            }

        con.close();
        return 0;
    }

    public double Kondisidua4(String atribut, String nilai, String atribut2, String nilai2) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+" && "+atribut2+"="+nilai2+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisisatu = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisisatu + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisisatu == 0){
            giniKondisisatu = 0;
        }else {
            hitungGini.giniKondisisatu = 1 - (Math.pow(a/totalKondisisatu, 2)) - (Math.pow(b/totalKondisisatu, 2)) - (Math.pow(c/totalKondisisatu, 2)) - (Math.pow(d/totalKondisisatu, 2));
            System.out.println("Gini (D)        : " + giniKondisisatu);
            }

        con.close();
        return 0;
    }

    public double Kondisidua5(String atribut, String nilai, String atribut1, String nilai1,String atribut2, String nilai2) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+" && ("+atribut1+"="+nilai1+" && "+atribut2+"="+nilai2+");");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisisatu = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisisatu + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisisatu == 0){
            giniKondisisatu = 0;
        }else {
            hitungGini.giniKondisisatu = 1 - (Math.pow(a/totalKondisisatu, 2)) - (Math.pow(b/totalKondisisatu, 2)) - (Math.pow(c/totalKondisisatu, 2)) - (Math.pow(d/totalKondisisatu, 2));
            System.out.println("Gini (D)        : " + giniKondisisatu);
            }

        con.close();
        return 0;
    }

    public double Kondisidua6(String atribut, String nilai,String atribut1, String nilai1, String atribut2, String nilai2, String atribut3, String nilai3) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE ("+atribut+"="+nilai+" || "+atribut1+"="+nilai1+") && "+atribut2+"="+nilai2+" && "+atribut3+"="+nilai3+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisidua = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisidua + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (hitungGini.totalKondisidua == 0){
            giniKondisidua = 0;
        }else {
            hitungGini.giniKondisidua = 1 - (Math.pow(a/totalKondisidua, 2)) - (Math.pow(b/totalKondisidua, 2)) - (Math.pow(c/totalKondisidua, 2)) - (Math.pow(d/totalKondisidua, 2));
            System.out.println("Gini (D)        : " + giniKondisidua);
            }

        con.close();
        return 0;
        
    }

    public double Kondisidua7(String atribut, String nilai, String atribut1, String nilai1, String atribut2, String nilai2, String atribut3, String nilai3) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE "+atribut+"="+nilai+" && ("+atribut1+"="+nilai1+" && "+atribut2+"="+nilai2+" && "+atribut3+"="+nilai3+");");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisisatu = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisisatu + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (totalKondisisatu == 0){
            giniKondisisatu = 0;
        }else {
            hitungGini.giniKondisisatu = 1 - (Math.pow(a/totalKondisisatu, 2)) - (Math.pow(b/totalKondisisatu, 2)) - (Math.pow(c/totalKondisisatu, 2)) - (Math.pow(d/totalKondisisatu, 2));
            System.out.println("Gini (D)        : " + giniKondisisatu);
            }

        con.close();
        return 0;
    }

    public double Kondisidua8(String atribut, String nilai,String atribut1, String nilai1, String atribut2, String nilai2, String atribut3, String nilai3, String atribut4, String nilai4) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataset", "root","");

        Statement st = con.createStatement();
        String sql = ("SELECT Evaluation FROM `data_sample` WHERE ("+atribut+"="+nilai+" || "+atribut1+"="+nilai1+") && "+atribut2+"="+nilai2+" && "+atribut3+"="+nilai3+" && "+atribut4+"="+nilai4+";");
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> list= new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString("Evaluation"));
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        
        int unacc = 0;
        int acc = 0;
        int good = 0;
        int vgood = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("unacc")){
                unacc++;
            }
            if(array[i].equals("acc")){
                acc++;
            }
            else if(array[i].equals("good")){
                good++;
            }
            else if(array[i].equals("vgood")){
                vgood++;
            }
        }

        hitungGini.totalKondisidua = unacc+acc+good+vgood;
        System.out.println("jumlah unacc    : " + unacc + " data");
        System.out.println("jumlah acc      : " + acc + " data");
        System.out.println("jumlah good     : " + good + " data");
        System.out.println("jumlah vgood    : " + vgood + " data");
        System.out.println("jumlah data     : " + totalKondisidua + " data");
        
        
        double a = unacc;
        double b = acc;
        double c = good;
        double d = vgood;
        
        if (hitungGini.totalKondisidua == 0){
            giniKondisidua = 0;
        }else {
            hitungGini.giniKondisidua = 1 - (Math.pow(a/totalKondisidua, 2)) - (Math.pow(b/totalKondisidua, 2)) - (Math.pow(c/totalKondisidua, 2)) - (Math.pow(d/totalKondisidua, 2));
            System.out.println("Gini (D)        : " + giniKondisidua);
            }

        con.close();
        return 0;
        
    }

    public double gain() {
        double aa = hitungGini.totalKondisisatu+hitungGini.totalKondisidua;
        hitungGini.gain = ((hitungGini.totalKondisisatu/(aa))*hitungGini.giniKondisisatu)+((hitungGini.totalKondisidua/(aa))*hitungGini.giniKondisidua);
        System.out.println("gain            : " + hitungGini.gain);
        return 0;
    }
    public double giniDelta() {
        hitungGini.giniD = hitungEva.giniEva - hitungGini.gain;
        System.out.println("Gini Delta      : " + hitungGini.giniD);
        return 0;
    }

    public double gain1() {
        double aa = hitungGini.totalKondisisatu+hitungGini.totalKondisidua;
        hitungGini.gain1 = ((hitungGini.totalKondisisatu/(aa))*hitungGini.giniKondisisatu)+((hitungGini.totalKondisidua/(aa))*hitungGini.giniKondisidua);
        System.out.println("gain            : " + hitungGini.gain1);
        return 0;
    }

    public double giniDelta1() {
        hitungGini.giniD1 = hitungEva.giniSafe - hitungGini.gain;
        System.out.println("Gini Delta      : " + hitungGini.giniD1);
        return 0;
    }

    public double giniDelta2() {
        hitungGini.giniD2 = hitungEva.giniSafeMed - hitungGini.gain;
        System.out.println("Gini Delta      : " + hitungGini.giniD2);
        return 0;
    }

    public double giniDelta3() {
        hitungGini.giniD3 = hitungEva.giniLugageSmall - hitungGini.gain;
        System.out.println("Gini Delta      : " + hitungGini.giniD3);
        return 0;
    }

    public double giniDelta4() {
        hitungGini.giniD4 = hitungEva.giniPerson2 - hitungGini.gain;
        System.out.println("Gini Delta      : " + hitungGini.giniD4);
        return 0;
    }

    public double giniDelta5() {
        hitungGini.giniD2 = hitungEva.giniSafeHigh - hitungGini.gain;
        System.out.println("Gini Delta      : " + hitungGini.giniD2);
        return 0;
    }


 
}
