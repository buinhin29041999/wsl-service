package com.weblaptop.wsl_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
//@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {
//    @Bean
//    public AuditorAware<String> auditorProvider() {
//        return new AuditorAwareImpl();
//    }
//
//    public static class AuditorAwareImpl implements AuditorAware<String> {
//        @Override
//        public Optional<String> getCurrentAuditor() {
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            if (authentication == null || authentication.isAuthenticated()) {
//                return null;
//            }
//            return Optional.of(authentication.getName());
//        }
//    }
}
