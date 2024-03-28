package com.spring.mvc.chap05.dto.response;

import com.spring.mvc.chap05.entity.Board;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString @EqualsAndHashCode
public class BoardDetailResponseDTO {

    private final int boardNo;
    private final String title;
    private final String content;
    private final String regDate;
    private final String writer;

    public BoardDetailResponseDTO(Board board) {
      if (board != null) {
          this.boardNo = board.getBoardNo();
          this.title = board.getTitle();
          this.content = board.getContent();
          this.regDate = BoardListResponseDTO.makePrettierDateString(board.getRegDate());
          this.writer = board.getWriter();
      } else {
          // 예외 처리 또는 기본값 설정 등을 수행
          this.boardNo = -1; // 예시로 -1을 설정
          this.title = "";
          this.content = "";
          this.regDate = "";
          this.writer = "";
      }
    }
}