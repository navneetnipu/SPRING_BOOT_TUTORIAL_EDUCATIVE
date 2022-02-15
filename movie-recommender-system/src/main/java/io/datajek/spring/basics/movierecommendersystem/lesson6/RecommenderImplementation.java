package io.datajek.spring.basics.movierecommendersystem.lesson6;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // autowiring by variable name

    @Autowired
    @Qualifier("CBF")
    private Filter filter;
    public String[] recommendMovies(String movie){
        // use ContentBased filter
        String[] recommendedMovies=filter.getRecommendations("movie name");
        return recommendedMovies;
    }
}
