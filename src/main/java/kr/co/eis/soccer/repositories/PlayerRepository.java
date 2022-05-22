package kr.co.eis.soccer.repositories;

import kr.co.eis.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.soccer.repositories
 * fileName   : PlayerRepository
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */

interface PlayerCustomRepository{
    // 000. 선수들의 키와 몸무게를 변경하시오


}

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>, PlayerCustomRepository {
}
