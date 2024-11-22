package com.petstagram.service;

import com.petstagram.dto.CommentResponseDto;
import com.petstagram.dto.CreateCommentRequestDto;

import java.util.List;

public interface CommentService {
    CommentResponseDto create(Long userId, Long boardId, CreateCommentRequestDto dto);

}