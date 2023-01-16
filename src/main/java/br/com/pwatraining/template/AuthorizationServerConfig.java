package br.com.pwatraining.template;

//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter implements AuthorizationServerConfigurer {
public class AuthorizationServerConfig {
//	@Autowired 
//	DataSource dataSource;
//	
//	@Autowired
//	@Qualifier("authenticationManagerBean")
//	private AuthenticationManager authenticationManager;
//	
//	private String clientid = "pwatecnologia";
//	private String clientSecret = "123456";
//	
//	private String privateKey = 
//			"-----BEGIN RSA PRIVATE KEY-----\n"+
//			"MIIEpQIBAAKCAQEAyykiXNp5PTbRV1osqycDLL0Nu8L7coEBbmV51oTJE92nxHwy\n"+
//			"dxiC4w06SKvOKnu91LDhbUpPW75b7H4OjOs+fudZEIHjTE44GtXfsaekRw0zA25V\n"+
//			"Pn0U9q5zTpEW2iHED/uhBMtbrfwCM4WyFfVvFPLUiTor4vuPsQJbsQ3TNfPahe+2\n"+
//			"PdJV5fXFzpm+1tJJ8CQ/boXvGmLptUawLh+mETvuBEHMCliA/aIWrldVm22DGVT3\n"+
//			"SOj1C/2bQF7PIcwyegMphnqCqup6xfhPwLWSY1IZTyEO6BbGd31yduJ1T2LJ/9/m\n"+
//			"wMDmTpaVAkeB1zRWaEIYWOjLFK1haMIraxBeDQIDAQABAoIBAQDG07QQobRj52FL\n"+
//			"lzH+MwkVYNSu/K1vq7fF3kQ2YPAVpCmLz2zoR7HZGln/Qz1bMI1hOdb1SfOOuydl\n"+
//			"tRzyZ0xbkHkHAcd9J1QbV1M8n+/TpaRWaEW/CVVZ8vNgYfi2dLNYXRCCC6/m/6r7\n"+
//			"142plfEn1FuTDb5jv4UqXD92cSxTMFwQSXi6C8FrFIss8zZtgjhsY5vQActWZTj8\n"+
//			"UbshtahglzMg5G0fCZ3uIER6U/eRDpiJ8lwcKG0GV8HaQflKZM5oXu6VWJkjj5mO\n"+
//			"9wiyzqYrf1Civk5WBMGJZLDbNJQu82slUobS3EmAKwzUHfHUMmHnB2AdUThDR9cp\n"+
//			"O6nYI/Z1AoGBAPUl2tVYLuxoty3da5noD8hlav3Xpxgjgs94nDruTQqYUiymWO2y\n"+
//			"l+gsIVwPGPXR4B+PjT+1JjzN68XEZhQH4+DIT37zGdZ1UyqPRnBhnnc/9dUQPCJT\n"+
//			"xR4C46AnzO/pb82zVoPAQDxneSna0bmghBdCJDHlTp/C1uAPlQdC8oMjAoGBANQn\n"+
//			"dVlTTV58XNGgeVblsma5xv9f61z16EJeHkrpV+XBBa4ITzCzucKKcL3F14/XxM5b\n"+
//			"JVVjbGgLqfyXXWPabMvS/f45k3DEC/Wi2HZK1DEBjEQLvtzL3bAL4BqXpAevZjPy\n"+
//			"eDcm0qsK4QiirGNAmRzOS190OTm249i11vvquQUPAoGAWNTyy0Q9HKWFWzVU/Fw+\n"+
//			"+9rkPj+a6QBVMmD+G8ymViSEAnH0341LxnHXVMiTvt/iWw1lnaRCyt3DhdJ5OuDx\n"+
//			"Dk8Hn3Tv8+pnzJBGcgqtpYCj0CUl5Tp9vzZEzZAejwED5oIJ44wSutCz8xq7zIwB\n"+
//			"0XvCKeJx7ypnOqHq2srDngkCgYEAwESqYzPNkG3gqNJoZUpyLgr7wAEsCumJfmxR\n"+
//			"w85JrJ0MCrbZHegj150jo7kjLOd9Iw8TfJlIa9r2SUbcilwv8WDcc4O2jaH+vLTC\n"+
//			"vCIAwBEJD7odVXklBiEdDryTGavqUfXS4Ri8H+sSGoNi++hVWvfS80Uff6CySXoy\n"+
//			"xcfpuh0CgYEAjVuw5h+Nc2O1ifm5rxnL5+E4n4hpn7aaYSOxHcGGK0kcinoPE3Rk\n"+
//			"ntYv27sysrUeK/3l/iZoAMEstPq0FdvRYH3YNHezjB8bO9/0V/5Z2Aa8dPThtpg5\n"+
//			"RcgpT8ZXXGjU441A1gB7byYK8d4PjWwTHIc6aRicsyTV/yTOddcj1CM=\n"+
//			"-----END RSA PRIVATE KEY-----";
//		private String publicKey = 
//				"-----BEGIN PUBLIC KEY-----\n"+
//				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyykiXNp5PTbRV1osqycD\n"+
//				"LL0Nu8L7coEBbmV51oTJE92nxHwydxiC4w06SKvOKnu91LDhbUpPW75b7H4OjOs+\n"+
//				"fudZEIHjTE44GtXfsaekRw0zA25VPn0U9q5zTpEW2iHED/uhBMtbrfwCM4WyFfVv\n"+
//				"FPLUiTor4vuPsQJbsQ3TNfPahe+2PdJV5fXFzpm+1tJJ8CQ/boXvGmLptUawLh+m\n"+
//				"ETvuBEHMCliA/aIWrldVm22DGVT3SOj1C/2bQF7PIcwyegMphnqCqup6xfhPwLWS\n"+
//				"Y1IZTyEO6BbGd31yduJ1T2LJ/9/mwMDmTpaVAkeB1zRWaEIYWOjLFK1haMIraxBe\n"+
//				"DQIDAQAB\n"+
//				"-----END PUBLIC KEY-----";
//
//
//	@Bean
//	public JwtAccessTokenConverter tokenEnhancer() {
//	      JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//	      converter.setSigningKey(privateKey);
//	      converter.setVerifierKey(publicKey);
//	      return converter;
//	   }
//
//		/*
//		 * public void configure(ClientDetailsServiceConfigurer clients) throws
//		 * Exception { clients .jdbc(this.dataSource)
//		 * .passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder());
//		 * }
//		 */
//    
//    @Bean
//    public JwtTokenStore tokenStore() {
//       return new JwtTokenStore(tokenEnhancer());
//    }
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//       endpoints.authenticationManager(authenticationManager).tokenStore(tokenStore())
//       .accessTokenConverter(tokenEnhancer());
////       endpoints.authenticationManager(authenticationManager)
////       .pathMapping("/upload", authorizePath)
////       .pathMapping("/oauth/token", tokenPath)
////       .pathMapping("/oauth/check_token", checkTokenPath)
////       .pathMapping("/oauth/token_key", tokenKeyPath)
////       .pathMapping("/oauth/authorize", authorizePath);
//    }
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//       security.tokenKeyAccess("permitAll()");
//    }
//	
//	  @Override public void configure(ClientDetailsServiceConfigurer clients)
//	  throws Exception {
//	  clients.inMemory().withClient(clientid).secret(clientSecret).scopes("read",
//	  "write") .authorizedGrantTypes("password",
//	  "refresh_token").accessTokenValiditySeconds(20000)
//	  .refreshTokenValiditySeconds(20000);
//	  
//	  }
	 
    
}
