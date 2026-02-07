import java.util.*;
import java.util.stream.*;

class Movie
{
	String name;
	double rating;
	int releaseYear;
	
	Movie(String name, double rating, int releaseYear)
	{
		this.name=name;
		this.rating=rating;
		this.releaseYear=releaseYear;
	}
	public double getRating()
	{
		return rating;
	}  public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}
public class TrendingMovies
{
	public static void main(String[] args)
	{
		List<Movie> movies = Arrays.asList(
	            new Movie("Inception", 8.8, 2010),
	            new Movie("Avengers", 8.5, 2012),
	            new Movie("Interstellar", 8.6, 2014),
	            new Movie("Oppenheimer", 8.9, 2023),
	            new Movie("Joker", 8.4, 2019),
	            new Movie("Dune", 8.3, 2021),
	            new Movie("Avatar 2", 7.9, 2022)
	        );
		//Sorts by rating (high → low)
		//If ratings are same → latest release year first
		//Picks only top 5 movies
		List<Movie> top5Movies=movies.stream()
				.filter(m->m.getRating()>=8.0)
				.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear).reversed())
				.limit(5)
				.collect(Collectors.toList());
		top5Movies.forEach(System.out::println);
		
	}
}