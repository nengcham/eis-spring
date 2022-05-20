package kr.co.eis.board.repositoryies;

import kr.co.eis.board.domains.Article;
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
interface ArticleCustomRepository{
    // 000. title 과 content 를 수정하시오
}
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
