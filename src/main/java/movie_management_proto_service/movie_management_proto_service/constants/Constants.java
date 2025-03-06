package movie_management_proto_service.movie_management_proto_service.constants;

import io.github.cdimascio.dotenv.Dotenv;

public class Constants {
    private static Constants instance = null;
    private Dotenv dotenv = null;

    Constants() {
        if (dotenv == null) {
            dotenv = Dotenv.load();
        }
    }

    public static Constants getInstance() {
        synchronized(Constants.class) {
            if (instance == null) {
                return new Constants();
            }

            return instance;
        }
    }

    public String getReadMePath() {
        return dotenv.get("READ_ME_ABSOLUTE_PATH");
    }
}
