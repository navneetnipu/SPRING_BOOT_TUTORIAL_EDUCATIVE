package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter=filter;
    }
    public String[] recommendMovies(String movie){
        // use collabrative filter
        String[] recommendedMovies=filter.getRecommendations("movie name");
        return recommendedMovies;
    }
}
