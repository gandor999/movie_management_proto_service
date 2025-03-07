package movie_management_proto_service.movie_management_proto_service.exception_handling;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.ErrorResponseException;

public class CustomExceptionModel extends ErrorResponseException {
    public CustomExceptionModel(HttpStatusCode status) {
        super(status);

        setType(URI.create(""));
        setInstance(URI.create(""));
    }

    public CustomExceptionModel(HttpStatusCode status, String message) {
        this(status);

        Map<String, Object> extendedProperties = new HashMap<>();
        extendedProperties.put("description", message);

        this.getBody().setProperties(extendedProperties);
    }
}
