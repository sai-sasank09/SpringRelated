package com.sasank.SpringBootREST.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {


    @Autowired
    private UserDetailsService userDetailsService;


    @Bean
    public AuthenticationProvider authProvider(){
        DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return provider;
    }



    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {

        http.csrf(customizer -> customizer.disable());
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
       return http.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails user= User.withDefaultPasswordEncoder()
//                .username("sasank")
//                .password("1234")
//                .roles("USER")
//                .build();
//
//        UserDetails admin= User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin@1234")
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user,admin);
//    }

}
