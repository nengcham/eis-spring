package kr.co.eis.soccer.repositories;

import kr.co.eis.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.soccer.repositories
 * fileName   : TeamRepository
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
