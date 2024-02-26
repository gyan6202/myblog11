package com.myblog.myblog11.Service.impl;

import com.myblog.myblog11.Entity.Post;
import com.myblog.myblog11.Service.PostService;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }



    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost=postRepository.save(post);
        PostDto dto=new PostDto();
        dto.setTitle(dto.getTitle());
        dto.setDescription(dto.getDescription());
        dto.setContent(dto.getContent());
        return dto;
    }
}
