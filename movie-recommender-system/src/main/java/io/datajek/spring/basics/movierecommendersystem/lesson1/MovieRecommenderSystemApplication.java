package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender=new RecommenderImplementation();
		String[] recommendedMovies=recommender.recommendMovies("movie name");
		System.out.println(Arrays.toString(recommendedMovies));
	}

}
