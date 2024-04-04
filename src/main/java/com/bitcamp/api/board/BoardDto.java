package com.bitcamp.api.board;
import lombok.*;
import org.springframework.stereotype.Component;
import java.util.*;

import com.bitcamp.api.article.Article;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

    private Long id;
    private String title;
    private String content;
    private String registerDate;
    private List<Article> articles;
    
}
