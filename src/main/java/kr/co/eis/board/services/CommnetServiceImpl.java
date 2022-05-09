package kr.co.eis.board.services;

import kr.co.eis.board.repositoryies.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: kr.co.eis.board.services
 * fileName   : CommnetServiceImpl
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
public class CommnetServiceImpl {
    private final CommentRepository repository;
}
