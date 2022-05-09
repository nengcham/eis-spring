package kr.co.eis.soccer.controllers;

import kr.co.eis.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.co.eis.soccer.controllers
 * fileName   : TeamController
 * author     : ChoiGeonIl
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09    ChoiGeonIl     최초 생성
 */
@RestController
@RequiredArgsConstructor
public class TeamController {
    private final TeamService service;
}
