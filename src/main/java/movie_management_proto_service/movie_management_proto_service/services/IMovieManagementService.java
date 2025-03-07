package movie_management_proto_service.movie_management_proto_service.services;

import org.springframework.web.ErrorResponseException;

import movie_management_proto_service.movie_management_proto_service.models.MovieModel;

public interface IMovieManagementService {
    MovieModel addItem(String movieName) throws ErrorResponseException;
    MovieModel getItem(long id, String name) throws ErrorResponseException;
    MovieModel udpateItem(long id) throws ErrorResponseException;
    MovieModel removeItem(long id) throws ErrorResponseException;
}
