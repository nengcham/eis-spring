package kr.co.eis.soccer.services;

import kr.co.eis.soccer.domains.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.soccer.services
 * fileName   : PlayerService
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
public interface PlayerService {
    List<Player> findAll();

    List<Player> findAll(Sort sort);

    Page<Player> findAll(Pageable pageable);

    long count();

    String delete(Player player);

    String save(Player player);

    Optional<Player> findById(String playerid);

    boolean existsById(String playerid);
}
