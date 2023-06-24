package com.g25oo2.dispositivo.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class SecurityConfig {

        @Bean
        public UserDetailsService users() {
                User.UserBuilder users = User.withDefaultPasswordEncoder();
                UserDetails user = users
                                .username("user")
                                .password("user123")
                                .roles("USER")
                                .build();
                UserDetails admin = users
                                .username("admin")
                                .password("admin123")
                                .roles("USER", "ADMIN")
                                .build();
                return new InMemoryUserDetailsManager(user, admin);
        }

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http.csrf().disable()
                                .authorizeRequests()
                                .antMatchers("/", "/api/dispositivos", "/api/evento", "/api/unidadesDeDispositivo")
                                .hasAnyRole("USER", "ADMIN")
                                .antMatchers("/api/unidad/Eliminar",
                                                "api/unidad/Crear", "api/evento/Crear", "api/evento/Eliminar")
                                .hasRole("ADMIN")
                                .anyRequest()
                                .authenticated()
                                .and()
                                .formLogin();
                return http.build();
        }

}