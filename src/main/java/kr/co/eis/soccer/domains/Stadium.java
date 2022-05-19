package kr.co.eis.soccer.domains;

import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@Eager
@Table(name = "stadiums")
public class Stadium {
    @Id
    @Column(name = "stadium_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long stadiumNo ;
    @Column(nullable = false) private String stadiumId ;
    private String stadiumName ;
    private String hometeamId ;
    private String seatCount ;
    private String address ;
    private String ddd ;
    private String tel ;

    @OneToMany(mappedBy = "s")
    List<Schedule> schedules = new ArrayList<>();
}
