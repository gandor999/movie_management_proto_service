package movie_management_proto_service.movie_management_proto_service.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponseException;

import movie_management_proto_service.movie_management_proto_service.exception_handling.CustomExceptionModel;
import movie_management_proto_service.movie_management_proto_service.models.MovieModel;

@Service
public class MovieManagementService implements IMovieManagementService {
    List<MovieModel> tempDatabase = Arrays.asList(new MovieModel[] {
        new MovieModel(1, "Chupacabra"),
        new MovieModel(2, "The Snowman"),
        new MovieModel(3, "The Manananggal"),
        new MovieModel(4, "Crazy Rich Badjaos")
    });

    @Override
    public MovieModel addItem(String movieName) throws ErrorResponseException {
        if (
            tempDatabase.stream().map(movie -> movie.name()).collect(Collectors.toList()).contains(movieName)
        ) {
            throw new CustomExceptionModel(HttpStatusCode.valueOf(409), "Movie already exists");
        }

        MovieModel newMovie = new MovieModel(tempDatabase.size() + 1, movieName); tempDatabase.add(newMovie);
        
        return newMovie;
    }

    @Override
    public MovieModel getItem(long id, String name) throws ErrorResponseException {
        for (int i = 0; i < tempDatabase.size(); i++) {
            if (tempDatabase.get(i).id() == id) {
                // do not or on this with name, should follow strictly to prio id first before name
                return tempDatabase.get(i);
            }
        }

        for (int i = 0; i < tempDatabase.size(); i++) {
            if (tempDatabase.get(i).name() == name) {
                return tempDatabase.get(i);
            }
        }

        throw new CustomExceptionModel(HttpStatusCode.valueOf(404), "Movie does not exist");
    }

    @Override
    public MovieModel udpateItem(long id) throws ErrorResponseException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'udpateItem'");
    }

    @Override
    public MovieModel removeItem(long id) throws ErrorResponseException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeItem'");
    }
}
