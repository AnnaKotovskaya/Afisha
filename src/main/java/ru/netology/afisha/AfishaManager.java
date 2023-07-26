package ru.netology.afisha;

public class AfishaManager {

    private String[] moviesTitle = new String[0];
    private int limit;

    public AfishaManager() {
        this.limit = 5;
    }

    public AfishaManager(int limit) {
        this.limit = limit;

    }

    public void addMovieTitle(String movieTitle) {
        String[] tmp = new String[moviesTitle.length + 1];
        for (int i = 0; moviesTitle.length > i; i++) {
            tmp[i] = moviesTitle[i];
        }
        tmp[tmp.length - 1] = movieTitle;
        moviesTitle = tmp;
    }

    public String[] findAll() {
        return moviesTitle;
    }

    public String[] findLast() {
        int resultLength;
        if (moviesTitle.length < limit) {
            resultLength = moviesTitle.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            ;
            tmp[i] = moviesTitle[moviesTitle.length - 1 - i];
        }
        return tmp;
    }


}
