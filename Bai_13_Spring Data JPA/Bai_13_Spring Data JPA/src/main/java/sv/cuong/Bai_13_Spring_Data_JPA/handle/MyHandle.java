package sv.cuong.Bai_13_Spring_Data_JPA.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyHandle {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> checkAll(Exception ex){
        ErrorResponse erropr = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
                return  ResponseEntity.badRequest().body(erropr);
    }
}
