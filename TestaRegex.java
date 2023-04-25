import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestaRegex {
    public static void main(String[] args) {

        String regex;
        String alvo;


        regex = "(\\d{2})(-)(\\d{2})(-)(\\d{2,4})";
        alvo = "31-12-2007";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(alvo);

        if (matcher.matches()) {

        String separador = "\\";

        String dia = matcher.group(1);
        String mes = matcher.group(3);
        String ano = matcher.group(5);
       
        String separador1 = matcher.group(2);
        String separador2= matcher.group(4);

        String novaString = dia + separador + mes + separador + ano;

        System.out.println(novaString);

        }
        





    }
    
}
