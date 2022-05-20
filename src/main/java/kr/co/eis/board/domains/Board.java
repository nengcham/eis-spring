package kr.co.eis.board.domains;

import com.sun.istack.NotNull;
import kr.co.eis.board.domains.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.auth.domains
 * fileName   : Board
 * author     : ChoiGeonIl
 * date       : 2022-05-18
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-18    ChoiGeonIl     최초 생성
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Eager
@Table(name = "boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private long boardId;
    @Column private @NotNull
    String boardName;
    @Column(name = "created_date") @NotNull private String createDate;

    @OneToMany(mappedBy = "b")
    List<Article> articles = new ArrayList<>();
}
