package com.example.carrot;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarrotApplicationTests {

	@Autowired
	private SaleRepository saleRepository;

	@Test
	void testJpa() {
				Sale s1 = new Sale();
        s1.setSubject("G703 무선마우스 팝니다.");
        s1.setContent("상태 SSS");
				s1.setPrice(12800);
        s1.setCreateDate(LocalDateTime.now());
        this.saleRepository.save(s1);  // 첫번째 질문 저장

        Sale s2 = new Sale();
        s2.setSubject("맥북 M1 6개월 사용 팝니다.");
        s2.setContent("상태 SSS");
        s2.setCreateDate(LocalDateTime.now());
				s2.setPrice(2000000);
        this.saleRepository.save(s2);  // 두번째 질문 저장
	}

}
