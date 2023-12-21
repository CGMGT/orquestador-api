package gt.com.tigo.orquestadornetwork.security;

import gt.com.tigo.orquestadornetwork.dto.TigoResponseDto;
import gt.com.tigo.orquestadornetwork.util.exception.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<TigoResponseDto> handleUnauthorizedException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new TigoResponseDto(HttpStatus.UNAUTHORIZED.value(), "Access denied"));
    }

}

