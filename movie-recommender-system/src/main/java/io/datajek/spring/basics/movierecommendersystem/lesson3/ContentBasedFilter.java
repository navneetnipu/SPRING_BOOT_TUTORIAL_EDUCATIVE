package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        // loigc of content based filter
        return new String[] {"M1","M2","M3"};
    }
}
