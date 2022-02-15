package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;

public interface Filter {
    public String[] getRecommendations(String movie);
}
