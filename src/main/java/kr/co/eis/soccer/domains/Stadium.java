package kr.co.eis.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName: kr.co.eis.soccer.domains
 * fileName   : Stadium
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
@Data
@Entity
@Component
public class Stadium {
    @Id long stadiumId ;
    private String stadiumName ;
    private String homeTeamId ;
    private String seatCount ;
    private String address ;
    private String ddd ;
    private String tel ;
}
