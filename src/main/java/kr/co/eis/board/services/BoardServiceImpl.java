package kr.co.eis.board.services;

import kr.co.eis.board.repositoryies.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: kr.co.eis.board.services
 * fileName   : BoardServiceImpl
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
@Service
@RequiredArgsConstructor
public class BoardServiceImpl {
    private final BoardRepository repository;
}
