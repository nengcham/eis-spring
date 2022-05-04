package kr.co.eis.repositories;

import kr.co.eis.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.repositories
 * fileName   : UserRepository
 * author     : ChoiGeonIl
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03    ChoiGeonIl     최초 생성
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    String login(User user);

    void put(User user);

}
