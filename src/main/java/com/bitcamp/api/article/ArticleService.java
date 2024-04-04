package com.bitcamp.api.article;

import com.bitcamp.api.common.command.CommandService;
import com.bitcamp.api.common.query.QueryService;
import java.util.*;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto>{




    default Article dtoToEntity(ArticleDto dto){
       

        Article article = Article.builder()
        
        .content(dto.getContent())
        .build();

        


        return article;
    }


    default Optional<ArticleDto> entityToDto(Article ent){
        ArticleDto dto = ArticleDto.builder()
        
        .content(ent.getContent())
        .build();

        return  Optional.of(dto);

    }
    
}
