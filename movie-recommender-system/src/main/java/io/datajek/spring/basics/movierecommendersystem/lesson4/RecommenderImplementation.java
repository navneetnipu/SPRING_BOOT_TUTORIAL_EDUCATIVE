package io.datajek.spring.basics.movierecommendersystem.lesson4;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // autowiring by variable name

    @Autowired
    private Filter contentBasedFilter;
    public String[] recommendMovies(String movie){
        // use ContentBased filter
        String[] recommendedMovies=contentBasedFilter.getRecommendations("movie name");
        return recommendedMovies;
    }
}
