package runtrail.dev.backend.dto.response;

import lombok.Data;

@Data
public class Response<T>{
    private T metadata;
    private int statusCode;
    private String message;

    public Response(T metadata, int statusCode, String message) {
        this.metadata = metadata;
        this.statusCode = statusCode;
        this.message = message;
    }
}
