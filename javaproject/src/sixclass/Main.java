//package sixclass;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int mm = 1;  // January
//    int yyyy = 2019;
//    displayCalendar(mm, yyyy);
//}
//
//// Method to return the name of the month
//static String getMonthName(int mm) {
//    String monthNames[] = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//    return monthNames[mm];
//}
//
//// Method to check if a year is a leap year
//static boolean isLeapYear(int yyyy) {
//    if (yyyy % 400 == 0) {
//        return true;
//    }
//    if (yyyy % 100 == 0) {
//        return false;
//    }
//    if (yyyy % 4 == 0) {
//        return true;
//    }
//    return false;
//}
//
//// Method to return the number of days in a given month
//static int getNumDaysInMonth(int mm, int yyyy) {
//    int daysInMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    if (isLeapYear(yyyy)) {
//        daysInMonth[2]++;  // February has 29 days in a leap year
//    }
//    return daysInMonth[mm];
//}
//
//// Method to display the calendar for a specific month and year
//static void displayCalendar(int mm, int yyyy) {
//    System.out.println(getMonthName(mm) + " " + yyyy);
//    System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
//
//    // Create a Calendar object
//    Main calendar = Main.getInstance();
//    calendar.set(Main.YEAR, yyyy);
//    calendar.set(Main.MONTH, mm - 1);  // Calendar.MONTH is 0-based
//    calendar.set(Main.DAY_OF_MONTH, 1);  // Set to the first day of the month
//
//    int dayNumber = calendar.get(Main.DAY_OF_WEEK);  // Get the day of the week of the first day
//    int dayCount = 0;
//
//    // Print leading spaces for the first week
//    for (int i = 1; i < dayNumber; i++) {
//        System.out.printf("%5s", "");
//        dayCount++;
//    }
//
//    // Get the number of days in the month
//    int numDaysInMonth = getNumDaysInMonth(mm, yyyy);
//
//    // Print each day of the month
//    for (int i = 1; i <= numDaysInMonth; i++) {
//        System.out.printf("%-5d", i);  // Print the day of the month
//        dayCount++;
//
//        // After every Saturday, start a new line
//        if (dayCount % 7 == 0) {
//            System.out.println();
//        }
//    }
//
//    // Print a newline if the last week is not full
//    if (dayCount % 7 != 0) {
//        System.out.println();
//    }
//}
//
//    private static Main getInstance() {
//
//    }
//
//}
