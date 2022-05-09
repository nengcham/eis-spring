package kr.co.eis.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName: kr.co.eis.soccer.domains
 * fileName   : Team
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
public class Team {
    @Id long teamId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String orig;
    private String stadiumId;
    private String zipcode1;
    private String zipcode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;
}
