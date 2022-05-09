package kr.co.eis.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName: kr.co.eis.soccer.domains
 * fileName   : Player
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
@Data
@Component
@Entity
public class Player {
    @Id long playerId ;
    private String playerName ;
    private String teamId ;
    private String ePlayerName ;
    private String nickname ;
    private String joinYyyy ;
    private String position ;
    private String backNo ;
    private String nation ;
    private String birthDate ;
    private String solar ;
    private String height ;
    private String weight ;
}
