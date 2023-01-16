package br.com.pwatraining.template;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/ {
//   @Autowired
//   private CustomDetailsService customDetailsService;
//
//   @Bean
//   public PasswordEncoder encoder() {
//      return new BCryptPasswordEncoder();
//   }
//   @Override
//   @Autowired
//   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//      auth.userDetailsService(customDetailsService).passwordEncoder(encoder());
//      
//   }
//   @Override
//   protected void configure(HttpSecurity http) throws Exception {
//	   http
//       .authorizeRequests()
//       .anyRequest()
//       .permitAll()
//       .and()
//       .httpBasic();
//	      
//	      //http.cors().and().authorizeRequests().anyRequest().authenticated().and().sessionManagement()
//      //   .sessionCreationPolicy(SessionCreationPolicy.NEVER);
////
////	    http
////	    .authorizeRequests()
////        .antMatchers(HttpMethod.GET, "/")
////            .permitAll()
////        .antMatchers(HttpMethod.POST, "/")
////            .permitAll().and().cors().and()
////	        .authorizeRequests().anyRequest()
////            .authenticated().and().sessionManagement()
////            .sessionCreationPolicy(SessionCreationPolicy.NEVER);
//   }
//   
//   @Override
//   public void configure(WebSecurity web) throws Exception {
//	   web.ignoring().antMatchers("/resources/**");
//   }
//   @Override
//   @Bean
//   public AuthenticationManager authenticationManagerBean() throws Exception {
//      return super.authenticationManagerBean();
//   }
//   
//	/*
//	 * @Bean CorsConfigurationSource corsConfigurationSource() { CorsConfiguration
//	 * configuration = new CorsConfiguration();
//	 * configuration.setAllowedOrigins(Arrays.asList("http://localhost"));
//	 * configuration.setAllowedMethods(Arrays.asList("GET","POST"));
//	 * UrlBasedCorsConfigurationSource source = new
//	 * UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
//	 * configuration); return source; }
//	 */
} 
