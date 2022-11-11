import java.util.Scanner;

public class ShowDaysofMonths {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        int x =0;
        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input  month : ");
        String month = input.nextLine();
        
        if(month.equals("Jan") || month.equals("1") || month.equals("Jan.") || month.equals("January")) {
        	x=1;
        }
        else if (month.equals("Feb") || month.equals("2") || month.equals("Feb.") || month.equals("Febuary")) {
        	x=2;
        }
        else if (month.equals("Mar") || month.equals("3") || month.equals("Mar.") || month.equals("March")) {
        	x=3;
        }
        else if (month.equals("Apr") || month.equals("4") || month.equals("Apr.") || month.equals("April")) {
        	x=4;
        }
        else if (month.equals("May") || month.equals("5") || month.equals("May.") || month.equals("May")) {
        	x=5;
        }
        else if (month.equals("Jun") || month.equals("6") || month.equals("Jun.") || month.equals("June")) {
        	x=6;
        }
        else if (month.equals("Jul") || month.equals("7") || month.equals("Jul.") || month.equals("July")) {
        	x=7;
        }
        else if (month.equals("Aug") || month.equals("8") || month.equals("Aug.") || month.equals("August")) {
        	x=8;
        }
        else if (month.equals("Sep") || month.equals("9") || month.equals("Sep.") || month.equals("September")) {
        	x=9;
        }
        else if (month.equals("Oct") || month.equals("10") || month.equals("Oct.") || month.equals("October")) {
        	x=10;
        }
        else if (month.equals("Nov") || month.equals("11") || month.equals("Nov.") || month.equals("November")) {
        	x=11;
        }
        else if (month.equals("Dec") || month.equals("12") || month.equals("Dec.") || month.equals("December")) {
        	x=12;
        }
        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (x) {
            case 1 :
                MonthOfName = "January" ;
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}
