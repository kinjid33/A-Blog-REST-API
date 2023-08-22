package com.madscicreative.bapi.service;

import com.madscicreative.bapi.payload.PostDto;
import com.madscicreative.bapi.payload.PostResponse;


public interface PostService {
    PostDto createPost (PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto, Long id);
    void deletePostById(Long id);
}
