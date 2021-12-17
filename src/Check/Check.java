/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Check;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anonymous
 */
public class Check {

    public Check() {
    }

    public static boolean checkName(String n) {

        if (n == null || n.length() == 0) {
            return false;
        } else {
            String strPattern = "[^a-z ]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }

    public static boolean checkPhone(String n) {
        if (n == null || n.length() > 13 || n.length() < 9) {
            return false;
        } else {
            String strPattern = "[^0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }

    public static boolean checkMark(String n) {
        if (n == null || n.length() > 3 || n.length() < 1||Float.parseFloat(n)>10||Float.parseFloat(n)<0) {
            return false;
        } else
            if(n.equals("10")){
                return true;
            }
        else
        if(n.length()>1&&!n.substring(1, 2).equals(".")){
            return false;
        }
        else
            return true;
    }

    public static boolean checkSpace(String n) {
        String strPattern = "[^ ]";
        Pattern p;
        Matcher m;
        int flag = Pattern.CASE_INSENSITIVE;
        p = Pattern.compile(strPattern, flag);
        m = p.matcher(n);
        return m.find();

    }

    public static boolean checkEmail(String n) {
        if (n == null) {
            return false;
        } else {
            String strPattern = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return m.find();
        }
    }

    public static boolean checkNumber(String n) {
        if (n == null || n.length() > 10 || n.length() < 1) {
            return false;
        } else {
            String strPattern = "[^0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }

    public static boolean check(String n) {
        if (n == null || n.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean checkID(String n) {
        if (n == null || n.length() > 10 || n.length() < 3) {
            return false;
        } else {
            String strPattern = "[^A-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();

        }
    }

    public static boolean checkDate(String n) {
        if (n == null || n.length() < 10||Integer.parseInt(n.substring(0,2))>31||Integer.parseInt(n.substring(3,5))>12||Integer.parseInt(n.substring(6,10))<1900||Integer.parseInt(n.substring(6,10))>3000) {
            /*||Integer.parseInt(n.substring(0,2))>31||Integer.parseInt(n.substring(3,5))>12||Integer.parseInt(n.substring(6,10))<1900||Integer.parseInt(n.substring(6,10))>3000*/
            return false;
        } else {
            String strPattern = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
                    
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }
    public static boolean checkIDGV(String n) {
        if (n == null || n.length() > 10 || n.length() < 3||!n.substring(0, 2).equals("GV")) {
            return false;
        } else {
            String strPattern = "[^A-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();

        }
    }
    public static boolean checkIDSV(String n) {
        if (n == null || n.length() > 10 || n.length() < 3||!n.substring(0, 2).equals("SV")) {
            return false;
        } else {
            String strPattern = "[^A-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();

        }
    }
    public static boolean checkIDMH(String n) {
        if (n == null || n.length() > 10 || n.length() < 2||!n.substring(0, 2).equals("MH")) {
            return false;
        } else {
            String strPattern = "[^A-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();

        }
    }
     public static boolean checkIDHP(String n) {
        if (n == null || n.length() > 10 || n.length() < 3||!n.substring(0, 2).equals("HP")) {
            return false;
        } else {
            String strPattern = "[^A-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();

        }
    }
     public static boolean checkMaLHP(String n) {
        if (n == null || n.length() > 10 || n.length() < 4||!n.substring(0, 3).equals("LHP")) {
            return false;
        } else {
            String strPattern = "[^A-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();

        }
    }
     public static boolean checkNam(String n){
         if(n==null||n.length()!=4||Integer.parseInt(n)<2000||Integer.parseInt(n)>3000){
             return false;
         }
         else
         return true;
     }
}
