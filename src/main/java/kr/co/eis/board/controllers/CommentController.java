package kr.co.eis.board.controllers;

import kr.co.eis.board.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.co.eis.board.controllers
 * fileName   : CommentController
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
public class CommentController {
    private final CommentService service;
}
