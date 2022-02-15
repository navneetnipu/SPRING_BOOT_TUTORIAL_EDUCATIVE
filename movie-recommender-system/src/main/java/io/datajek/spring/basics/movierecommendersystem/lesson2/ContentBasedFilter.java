package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        // loigc of content based filter
        return new String[] {"M1","M2","M3"};
    }
}
