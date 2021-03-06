package kr.co.eis.auth.exception;

/**
 * packageName: kr.co.eis.auth.exception
 * fileName   : SecurityRuntimeException
 * author     : ChoiGeonIl
 * date       : 2022-05-24
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-24    ChoiGeonIl     최초 생성
 */
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class SecurityRuntimeException extends RuntimeException{
    private static final long SerializableUID = 1L;

    private final String msg;
    private final HttpStatus httpStatus;
}
