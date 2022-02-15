package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(MovieRecommenderSystemApplication.class,args);
		RecommenderImplementation recommender=applicationContext.getBean(RecommenderImplementation.class);
		String[] recommendedMovies=recommender.recommendMovies("movie_name");
		System.out.println("executed1");
		System.out.println(Arrays.toString(recommendedMovies));
		RecommenderImplementation2 recommender2=applicationContext.getBean(RecommenderImplementation2.class);
		String[] recommendedMovies2=recommender2.recommendMovies("movie name 2");
		System.out.println("executed2");
		System.out.println(Arrays.toString(recommendedMovies2));
	}

}
