package com.madscicreative.bapi.repository;

import com.madscicreative.bapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}