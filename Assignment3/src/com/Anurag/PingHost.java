package com.Anurag;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PingHost {
    public static void runSystemCommand(String command) {
        int count=0,i=0;
        double[] times=new double[10];
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                int index1=s.lastIndexOf("=");
                int index2=s.lastIndexOf("ms");
                if(index1!=-1&&index2!=-1&&count<10){
                    count++;
                    double time=Double.parseDouble(s.substring(index1+1,index2-1));
                    times[i++]=time;}
            }
            Arrays.sort(times);
            System.out.println("Median Time to ping:"+(times[4]+times[5])/2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String ip = "google.com";
        runSystemCommand("ping -c 10 " + ip);
    }
}
