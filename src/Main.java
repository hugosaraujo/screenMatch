import screenmatch.models.Film;
import screenmatch.models.Show;
import screenmatch.runningtimecalculator.Calculator;


public class Main {
    public static void main(String[] args) {
        //criar menu para interagir com as classes
        //utilizar os métodos específicos para cada opção de menu;
        //criar um método para calcular o tempo necessário para maratonar uma série
            //mostrar por horas ou minutos

        Film aoby = new Film();

        aoby.setTitle("Anyone but you");
        aoby.setReleaseYear(2023);
        aoby.setRunningTimeinMinutes(103);

        aoby.rate(5);
        aoby.rate(10);
        aoby.rate(6);

        System.out.println(aoby.getTotalRating());
        System.out.println(aoby.showAverage());
        System.out.println(aoby.showOverview());

        Show gilmoreGirls = new Show();
        gilmoreGirls.setTitle("Gilmore Girls");
        gilmoreGirls.setReleaseYear(2000);
        gilmoreGirls.setEpisodeRunningTime(45);
        gilmoreGirls.setRunningTimeinMinutes(((45 * 21) * 7));


        System.out.println(gilmoreGirls.showOverview());

        Calculator paraMaratonar = new Calculator();
        //paraMaratonar.add(gilmoreGirls);
        //System.out.println(paraMaratonar.getTotalRunningTime());
        paraMaratonar.add(aoby);
        System.out.println(paraMaratonar.getTotalRunningTime());

    }
}