import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Date dataInicial = (Date) new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2025");

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(dataInicial);

        for(int parcela = 1; parcela <= 12; parcela++){
            calendar.add(Calendar.MONTH, 1);
            System.out.println("Parcela nº "+parcela+" vencimento em "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        }

        System.out.println("-------------------------------------");

     
        Calendar calendar2 = Calendar.getInstance();
        Date data =  calendar2.getTime();
        System.out.println(data);
        calendar2.setTime(data);

        for(int parcela = 1; parcela <= 12; parcela++){
            calendar2.add(Calendar.MONTH, 1);
            System.out.println("Parcela nº "+parcela+" vencimento em "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar2.getTime()));

        }
    }
}
