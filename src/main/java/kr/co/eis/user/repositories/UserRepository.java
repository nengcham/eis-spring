package kr.co.eis.user.repositories;

import kr.co.eis.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

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

interface UserCustomRepository{
    //000. 팀의 전화번호와 팩스번호를 수정하시오
    String login(User user);
    void put(User user);
}



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
