import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MyApp{
    public static void main(String[] args) {
        MyApp myApp = new MyApp();

    }

    public MyApp() {
        Locale locale = new Locale("th", "TH");
        Calendar calendar = Calendar.getInstance(locale);
        SimpleDateFormat sourceFormat = new SimpleDateFormat("E");
        String dateInput = userInput();
        try {
            Date date1 = new SimpleDateFormat("dd/MM/yyyy", locale).parse(dateInput);
            calendar.setTime(date1);
            String dayInWeek =  sourceFormat.format(calendar.getTime());
            System.out.println(dayInWeek);
            System.out.println("เป็นวันที่ "+calendar.get(Calendar.DAY_OF_YEAR) +" ของปี "+ calendar.get(Calendar.YEAR));
            System.out.println("ปี ค.ศ. "+ (calendar.get(Calendar.YEAR)-543) );
            System.out.println(Year.of(calendar.get(Calendar.YEAR)-543).length());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public String userInput(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter date");
        String date = myObj.nextLine();  // Read user input
        return date;
    }
}
