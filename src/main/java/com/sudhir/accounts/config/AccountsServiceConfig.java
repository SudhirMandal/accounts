package com.sudhir.accounts.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Getter
@Setter
@ToString
public class AccountsServiceConfig {
    private String myname;
}
