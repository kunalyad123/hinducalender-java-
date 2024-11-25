import java.time.LocalDate;
import java.util.Scanner;

public class HinduCalendar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simplified Hindu Calendar Application!");
        
        while (true) {
            System.out.println("Enter the Gregorian date (yyyy-mm-dd) or type 'exit' to quit:");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            // Split the input date string
            String[] dateParts = input.split("-");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            HinduDate hinduDate = new HinduDate(year, month, day);
            System.out.println("Hindu Date: " + hinduDate);
        }
        
        scanner.close();
        System.out.println("Thank you for using the Simplified Hindu Calendar Application!");
    }
}

class HinduDate {
    private int year;
    private String month;
    private int day;

    public HinduDate(int gYear, int gMonth, int gDay) {
        // Convert Gregorian date to a simplified Hindu date
        this.year = gYear + 57; // Adjusting for Vikram Samvat (just a simple example)
        this.day = gDay; // Placeholder for day
        this.month = convertMonth(gMonth);
    }

    private String convertMonth(int gMonth) {
        // Simple mapping of Gregorian months to Hindu months
        switch (gMonth) {
            case 1: return "Magha";
            case 2: return "Phalguna";
            case 3: return "Chaitra";
            case 4: return "Vaishakha";
            case 5: return "Jyeshtha";
            case 6: return "Ashadha";
            case 7: return "Shravana";
            case 8: return "Bhadrapada";
            case 9: return "Ashwin";
            case 10: return "Kartika";
            case 11: return "Margashirsha";
            case 12: return "Pushya";
            default: return "Unknown";
        }
    }

    @Override
    public String toString() {
        return day + " " + month + " " + year + " Vikram Samvat";
    }
}