package kr.co.eis.board.repositoryies;

import kr.co.eis.board.domains.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.board.repositoryies
 * fileName   : CommentRepository
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
