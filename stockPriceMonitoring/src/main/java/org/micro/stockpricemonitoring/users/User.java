package org.micro.stockpricemonitoring.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private int id;
    private String email;
    private String name;
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private addressDetailDto address;
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Setter
    @Getter
    public static class addressDetailDto {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private geo geo;
        @AllArgsConstructor
        @NoArgsConstructor
        @Builder
        @Setter
        @Getter
        public static class geo {
            private String lat;
            private String lng;
        }
    }
}



