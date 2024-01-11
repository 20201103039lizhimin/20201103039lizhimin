package com.example.demo001.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

@ConfigurationProperties(prefix = "email")

public class EmailProperties {

    public String user;

    public String password;

    public String host;

    public String auth;
}
