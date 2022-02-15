package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
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
