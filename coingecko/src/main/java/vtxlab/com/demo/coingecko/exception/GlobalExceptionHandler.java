package vtxlab.com.demo.coingecko.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import vtxlab.com.demo.coingecko.model.CoinsMarkets;

@ControllerAdvice // Spring bean
public class GlobalExceptionHandler<T> {

  @ExceptionHandler({ ApiException.class, NullPointerException.class, ArithmeticException.class })
  @ResponseStatus(code = HttpStatus.BAD_REQUEST)
  public List<CoinsMarkets> handleApiException(ApiException e) {
    return new ArrayList<>();
  }

  /*
   * @ExceptionHandler({ NullPointerException.class })
   * public ResponseEntity<ApiResponse<T>> handleNpeException() {
   * return ResponseEntity.badRequest().body(new ApiResponse<>(13002,
   * "NPE, sorry", null));
   * }
   * 
   * @ExceptionHandler({ KeyNotFoundException.class })
   * public ResponseEntity<ApiResponse<T>> handleKeyNotFoundException() {
   * return ResponseEntity.badRequest().body(new ApiResponse<>(13003,
   * "Key Not Found Exception, please check", null));
   * }
   * 
   * @ExceptionHandler({ IllegalArgumentException.class })
   * public ResponseEntity<ApiResponse<T>> handleIaeException() {
   * return ResponseEntity.badRequest().body(new ApiResponse<>(13004,
   * "IA Exception, sorry", null));
   * }
   */

}