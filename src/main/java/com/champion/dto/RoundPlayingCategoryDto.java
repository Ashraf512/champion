package com.champion.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;


@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RoundPlayingCategoryDto {
    private Integer id;
    private RoundDto Round;
    private PlayingCategoryDto playingCategory;
}
