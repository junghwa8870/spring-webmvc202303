package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.dto.ScoreRequestDTO;
import com.spring.mvc.chap04.entity.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScoreRepositoryImplTest {

    @Autowired
    ScoreRepositoryImpl repository;

    @Test
    @DisplayName("새로운 성적 정보를 save를 통해 추가한다.")
    void saveTest() {

        ScoreRequestDTO dto = new ScoreRequestDTO("박영희", 100, 97, 94);
        Score score = new Score(dto);

        boolean flag = repository.save(score);

        assertTrue(flag);
    }

    @Test
    @DisplayName("tbl_score의 모든 학생 목록을 조회했을 때 학생의 수는 4명일 것이다.")
    void findAllTest() {
        // given 테스트에 필요한 초기 설정이나 데이터를 설정합니다. 주로 조회할 데이터의 식별자를 설정합니다.
        String sort = "name"; // 예시로 이름순으로 정렬하는 것을 가정한다.

        // when 테스트할 메소드를 호출하고, 해당 메소드가 실행되는 경우의 동작을 정의합니다. 주로 데이터베이스에서 데이터를 조회하는 메소드를 호출합니다.
        List<Score> scoreList = repository.findAll(sort);
        System.out.println("scoreList = " + scoreList);

        // then 메소드 호출 결과와 예상 결과를 비교하여 테스트를 수행합니다. 메소드가 정상적으로 동작하고 예상 결과와 일치하는지 확인합니다.
        assertEquals(4, scoreList.size());
    }

    @Test
    @DisplayName("3번 학생의 이름은 김철수일 것이다.")
    void findOneTest() {
        // given
        int stuNum = 3;

        // when
        Score score = repository.findOne(stuNum);

        // then
        assertEquals("김철수", score.getName());
    }

    @Test
    @DisplayName("4번 학생을 삭제한 후 4번 학생을 조회했을 때 조회되지 않아야 한다.")
    void deleteTest() {
        // given
        int stuNum = 4;

        // when
        boolean flag = repository.delete(stuNum);
        Score deleteScore = repository.findOne(stuNum);

        // then
        assertTrue(flag);
        assertNull(deleteScore);
    }



}