package io.datajek.spring.basics.movierecommendersystem.lesson6;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        // logic of content based filter
        return new String[] {"M1","M2","M3"};
    }
}
