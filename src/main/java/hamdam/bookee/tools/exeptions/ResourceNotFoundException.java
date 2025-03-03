package hamdam.bookee.tools.exeptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class ResourceNotFoundException extends RuntimeException {

    private final String resourceName;
    private final String fieldName;
    private final long fieldValue;
//    private final long fieldStringValue;

    public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
        super(String.format("😔 %s not found with %s : [%s]💩", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

//    public StringResourceNotFoundException(String resourceName, String fieldName, String fieldStringValue) {
//        super(String.format("😔 %s not found with %s : [%s]💩", resourceName, fieldName, fieldStringValue));
//        this.resourceName = resourceName;
//        this.fieldName = fieldName;
//        this.fieldStringValue = fieldStringValue;
//    }
}
