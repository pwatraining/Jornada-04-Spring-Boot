package br.com.pwatraining.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Util {
	
	@Autowired
	private Environment env;
	
	//@Value("${spring.datasource.url}")
	private String url = env.getProperty("spring.datasource.url");
	
	//@Value("${spring.datasource.username}")
	private String username = env.getProperty("spring.datasource.username");
	
	//@Value("${spring.datasource.password}")
	private String password = env.getProperty("spring.datasource.password");
	
	
	public static String getPath(String tipo) {

		String path;
		if(tipo.equals("jasper")) {
			path = "/home/jasper/";
		} else {
			path = "/home/upload/";
		}
		return path;
		
//		try (InputStream is = IRelatorioServiceImpl.class.getResourceAsStream(resource)) {
//			String reportPath = IRelatorioServiceImpl.class.getResource(resource).toString();
//			String [] splitPath = reportPath.split("advena-despacho-backend");
//			reportPath = splitPath[0] + "relatorios/";
//			splitPath = reportPath.split("file:/");
//			reportPath = splitPath[1];
//			return reportPath;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return "ERRO: " + e.getMessage();
//		}
	}
	

	public Connection getConexao() {
		
		//final String url = url;
		//final String username = username;
		//final String password = password;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		}
	
//	public String getPath() {
//		
//		String resource = "/path.pwa";
//
//		System.out.println(RelatorioController.class.getResource(resource));
//		
//		String pathArquivo = "";
//		try (InputStream is = RelatorioController.class.getResourceAsStream(resource)) {
//			int content;
//			
//			while ((content = is.read()) != -1) {
//				pathArquivo = pathArquivo + String.valueOf((char) content);
//				//System.out.println((char) content);
//				
//			}
//			//return (pathArquivo.toString() + " (PATH)");
//			return "" + RelatorioController.class.getResource(resource);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return "ERRO: " + e.getMessage();
//		}
//        
//	}
	
}
