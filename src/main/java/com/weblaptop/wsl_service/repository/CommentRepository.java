package com.weblaptop.wsl_service.repository;

import com.weblaptop.wsl_service.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
