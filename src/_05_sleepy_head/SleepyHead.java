package _05_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    int weekday=JOptionPane.showConfirmDialog(null, "IS IT A WEEKDAY?", "SLEEPY HEAD",JOptionPane.YES_NO_OPTION);
if (weekday==0) {
	isWeekday=true;
}
else {
	isWeekday=false;
}
	int vacation=JOptionPane.showConfirmDialog(null, "IS IT A VACATION MY CHILD???","IS IT VACATION", JOptionPane.YES_NO_OPTION);
if (weekday==0) {
	isVacation=true;
}else {
	isVacation=false;
}

if(isVacation==true || isWeekday==false) {
	System.out.println("SLEEEP INNN ALLL YOUUU WANTTT MYYYY CHILDDD!!!");
}else {
	System.out.println("GET UP LAZY BONES!!!");
}

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
