package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie){
        // use content based filter
        ContentBasedFilter filter=new ContentBasedFilter();
        String[] recommendedMovies=filter.getrecommendations("movie name");
        return recommendedMovies;
    }
}
