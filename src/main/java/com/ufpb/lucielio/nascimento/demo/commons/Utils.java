package com.ufpb.lucielio.nascimento.demo.commons;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {
    public static String getStackTrace(Exception e){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace();
        return sw.toString();
    }
}
