package movie_management_proto_service.movie_management_proto_service.controllers;

public interface IController {
    String landing();
    void create();
    void read();
    void update();
    void delete();
    // private void readAll(){} let this be pagination
}
