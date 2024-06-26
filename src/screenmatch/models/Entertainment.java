package screenmatch.models;

import screenmatch.exceptions.YearSizeException;

public class Entertainment implements Comparable<Entertainment>{

    private String title;
    protected int releaseYear;
    private boolean plainIncluded;
    private double rates;
    private int totalRating;
    private int runtimeInMinutes;


    public Entertainment(String title) {
        this.title = title;
    }

    public Entertainment(OmdbTitle omdbTitle) {
        this.title = omdbTitle.title();
        if(omdbTitle.year().length() > 4){
            throw new YearSizeException("Não consegui converter, o ano tem mais de 4 caracteres");
        }
        this.releaseYear = Integer.valueOf(omdbTitle.year());
        this.runtimeInMinutes = Integer.valueOf(omdbTitle.runtime().substring(0,3));
    }

    @Override
    public String toString() {
        return """
                Título: %s
                Duração: %d minutos
                Ano de Lançamento: %d
                """.formatted(title, runtimeInMinutes, releaseYear);
    }

    public String getTitle(){
        return title;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void rate(double rate){
        rates += rate;
        totalRating++;
    }

    public double showAverage() {
        return rates / totalRating;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public int getRunningTimeInMinutes(){
        return runtimeInMinutes;
    }
    public void setRuntimeInMinutes(int runtimeInMinutes){
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public int getTotalRating(){
        return totalRating;
    }

    @Override
    public int compareTo(Entertainment otherTitle) {
        return this.getTitle().compareTo(otherTitle.getTitle());
    }
}
