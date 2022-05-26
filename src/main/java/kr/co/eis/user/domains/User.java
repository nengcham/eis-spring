package kr.co.eis.user.domains;

import com.sun.istack.NotNull;
import kr.co.eis.board.domains.Article;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.domains
 * fileName   : User
 * author     : ChoiGeonIl
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03    ChoiGeonIl     최초 생성
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;

    @OneToMany(mappedBy = "u")
    List<Article> articles = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;
}
