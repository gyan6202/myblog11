package com.myblog.myblog11.Service;

import com.myblog.myblog11.payload.PostDto;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;

public interface PostService {
    PostDto createPost(PostDto postDto);


  PostDto  getPostById(long id);
}


