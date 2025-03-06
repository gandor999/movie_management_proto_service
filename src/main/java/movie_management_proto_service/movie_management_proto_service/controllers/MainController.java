package movie_management_proto_service.movie_management_proto_service.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import movie_management_proto_service.movie_management_proto_service.constants.Constants;

@RestController
public class MainController implements IController {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete() {
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
