package movie_management_proto_service.movie_management_proto_service.controllers;

import movie_management_proto_service.movie_management_proto_service.models.MovieModel;

public interface IMovieManagementController {
    String landing();
    MovieModel create(String movieName) throws Exception;
    MovieModel read(long id, String name) throws Exception;
    MovieModel update() throws Exception;
    MovieModel delete() throws Exception;
    // private void readAll(){} let this be pagination
}
