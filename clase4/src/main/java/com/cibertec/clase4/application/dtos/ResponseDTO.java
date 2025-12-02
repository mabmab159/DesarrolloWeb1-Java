package com.cibertec.clase4.application.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    @JsonProperty("id")
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private Location location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Origin {
        private String name;
        private String url;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Location {
        private String name;
        private String url;
    }
}
