package com.koscom.springboot.domain.posts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration      // Spring에서 설정 클래스임을 알려주는 어노테싱션
@EnableJpaAuditing  // JPA Auditing 활성화
public class JpaConfig {
}
