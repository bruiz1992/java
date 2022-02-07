package PSP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class prueba123 {

	public static void main(String[] args) {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);
        int num_dia = calendar.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año
        String d = Integer.valueOf(num_dia).toString();

        if(23 == num_dia){
           // return true;
        	System.out.println("entra");
        }
        //return false;
        System.out.println("no es el numero");
    }

}
