package kg.megalab.demo.exceptions;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ControllerAdvice

@RequiredArgsConstructor
public class GlobalExceptionHandler {

    //private final MessageByLocaleService messageSource;

//    @ExceptionHandler
//    public ResponseEntity<String> handlerException(MethodArgumentNotValidException e){
//        List<FieldError> errors = e.getFieldErrors().stream().limit(1).toList();
//        String message = errors.stream().map(x->x.getDefaultMessage()).collect(Collectors.joining());
//        return new ResponseEntity<>(messageSource.getMessage(message), HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
//закинуть это на гит на всякий случай