package kr.co.eis.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.co.eis.board.domains
 * fileName   : Article
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
@Table(name = "aaa")
public class Article1 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String projects;
    private String startDate;
    private String status;
    private String team;
    private String progress;
    private String action;
}
