package movie_management_proto_service.movie_management_proto_service.exception_handling;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsManager {
    @ExceptionHandler(value = ErrorResponseException.class)
    public ErrorResponseException handleErrorResponseThrows(ErrorResponseException ex) {
        return ex;
    }

    @ExceptionHandler(value = Exception.class)
    public ErrorResponseException handleUnwrappedGeneralThrows(Exception ex) {
        return new CustomExceptionModel(HttpStatusCode.valueOf(500), ex.getMessage());
    }
}
