package br.unipe.cc.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {

	public static void main(String[] args) throws IOException {
		
		Properties propriedades = new Properties();
		
		FileInputStream in = new FileInputStream("database.proprieties");
		propriedades.load(in);
		in.close();
		
		System.out.println("URL......: " + propriedades.getProperty("conexao.url"));
		System.out.println("DATABASE.: " + propriedades.getProperty("conexao.database"));
		System.out.println("USUARIO..: " + propriedades.getProperty("conexao.usuario"));
		System.out.println("SENHA....: " + propriedades.getProperty("conexao.senha"));
		System.out.println("PORTA....: " + propriedades.getProperty("conexao.porta"));
	}

}
