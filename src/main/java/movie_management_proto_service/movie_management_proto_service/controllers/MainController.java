package movie_management_proto_service.movie_management_proto_service.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movie_management_proto_service.movie_management_proto_service.constants.Constants;
import movie_management_proto_service.movie_management_proto_service.models.MovieModel;
import movie_management_proto_service.movie_management_proto_service.services.MovieManagementService;

@RestController
public class MainController implements IMovieManagementController {
    @Autowired
    MovieManagementService movieManagementService;

    @GetMapping("/movie")
    @Override
    public MovieModel read(@RequestParam(value = "movie_id") long id, @RequestParam(value = "movie_name", required = false) String name) throws Exception {
        return movieManagementService.getItem(id, name);
    }

    @PostMapping("/movie")
    @Override
    public MovieModel create(String movieName) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public MovieModel update() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public MovieModel delete() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @GetMapping("/")
    @Override
    public String landing() {
        String landingPage = "";

        try {
           landingPage = new String(Files.readAllBytes(Paths.get(Constants.getInstance().getReadMePath())));
        } catch (Exception e) {
            System.err.println("Was not able to read path");
        }

        return "<pre> " + landingPage + " </pre>";
    }

}
