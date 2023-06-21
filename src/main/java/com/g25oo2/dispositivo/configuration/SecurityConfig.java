package com.g25oo2.dispositivo.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // @Override
    // @Bean
    // public UserDetailsService userDetailsService() {
    // UserDetails user = User.builder()
    // .username("user")
    // .password("{noop}123")
    // .roles("USER")
    // .build();
    // UserDetails admin = User.builder()
    // .username("admin")
    // .password("{noop}123")
    // .roles("USER", "ADMIN")
    // .build();

    // return new InMemoryUserDetailsManager(user, admin);
    // }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()// con esto agregamos usarios en memoria,
                // agregando sus credenciales
                .withUser("admin")// asignamos el usario
                .password("{noop}123")// contraseña
                .roles("ADMIN", "USER")// y roles
                .and()// clasula para agregar otro usuario
                .withUser("user")
                .password("{noop}123")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .formLogin()
                .and()
                .exceptionHandling();
        // http
        // .cors()
        // .and()
        // .authorizeRequests()
        // .antMatchers("/api/*").permitAll()
        // .anyRequest().authenticated()
        // .and()
        // .formLogin()
        // .and()
        // .exceptionHandling()
        // .accessDeniedPage("/access-denied")
        // .and()
        // .cors() // Agrega la configuración de CORS
        // .configurationSource(request -> {
        // CorsConfiguration cors = new CorsConfiguration();
        // cors.setAllowedOriginPatterns(Arrays.asList("*"));
        // cors.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
        // cors.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization"));
        // cors.setAllowCredentials(true);
        // return cors;
        // });
    }
}