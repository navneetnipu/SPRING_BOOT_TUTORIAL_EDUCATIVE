package io.datajek.spring.basics.movierecommendersystem.lesson7;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // autowiring by constructor method

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        System.out.println("CollaborativeFilter constructor invoked..");
        this.filter = filter;

    }

    public String[] recommendMovies(String movie){
        // use ContentBased filter
        String[] recommendedMovies=filter.getRecommendations("movie name");
        return recommendedMovies;
    }
}
