package kr.co.eis.board.repositoryies;

import kr.co.eis.board.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.board.repositoryies
 * fileName   : BoardRepository
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
interface BoardCustomRepository{
    // 000. 게시판 이름 boardName 을 변경하시오
}
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
