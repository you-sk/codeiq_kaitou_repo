package codeiq.premium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){

//        System.out.println(preminu("2017,3,5"));

    	Scanner cin=new Scanner(System.in);
//        String line;
        for(;cin.hasNext();){
//            line=cin.nextLine();
//            System.out.println(preminu(line));
//            continue;

           	String[] input = cin.nextLine().split(",", 0);

        	if(input.length == 3){
//        	System.out.println(input[0]);
//        	System.out.println(input[1]);
//        	System.out.println(input[2]);

        	Calendar cal = Calendar.getInstance();
        	cal.set(Calendar.YEAR, Integer.parseInt( input[0]));
        	cal.set(Calendar.MONTH,Integer.parseInt(input[1]) -1);
        	cal.set(Calendar.DATE,cal.getActualMaximum(Calendar.DATE) );

//        	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        	do {
            	if(cal.get(Calendar.DAY_OF_WEEK)==Integer.parseInt(input[2])+1){
            		System.out.println(new SimpleDateFormat("yyyyMMdd").format(cal.getTime()));
            		break;
            	}
    			cal.add(Calendar.DATE, -1);
//    			System.out.println(new SimpleDateFormat("yyyyMMdd").format(cal.getTime()));
    		} while (true);


        }
        }

    }

//    private static String preminu(String args){
////    	TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
//    	String[] input = args.split(",", 0);
//
//    	if(input.length == 3){
////    	System.out.println(input[0]);
////    	System.out.println(input[1]);
////    	System.out.println(input[2]);
//
//    	Calendar cal = Calendar.getInstance();
//    	cal.set(Calendar.YEAR, Integer.parseInt( input[0]));
//    	cal.set(Calendar.MONTH,Integer.parseInt(input[1]) -1);
//    	cal.set(Calendar.DATE,cal.getActualMaximum(Calendar.DATE) );
//
////    	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//    	do {
//        	if(cal.get(Calendar.DAY_OF_WEEK)==Integer.parseInt(input[2])+1){
//        		return new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
//        	}
//			cal.add(Calendar.DATE, -1);
////			System.out.println(new SimpleDateFormat("yyyyMMdd").format(cal.getTime()));
//		} while (true);
//
//    	}
//
//    	return null;
//    }

}
