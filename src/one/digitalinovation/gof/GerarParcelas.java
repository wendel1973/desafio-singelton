import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GerarParcelas {
    public static void main(String[] args) {
        Date dataInicial = (Date) new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2025");

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(dataInicial);

        for(int parcela = 1; parcela <= 12; parcela++){
            calendar.add(Calendar.MONTH, 1);
            System.out.println("Parcela nº "+parcela+" vencimento em "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        }
    }

}
