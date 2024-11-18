package br.com.fatecmaua.projeto_escola.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ConfigSwagger {
	@Bean
	public OpenAPI customAPI() {
		return new OpenAPI().info(
				new Info().title("Diário de Classe ")
				.description("Este é um projeto sobre um diario de classe com a função de "
						+ "gerenciar e registrar informações relacionadas à rotina escolar de professores, alunos e turmas. "
						+ "O objetivo principal é facilitar a organização, o acesso e o acompanhamento de dados escolares, substituindo os registros manuais e promovendo maior eficiência e precisão.").version("1.0.0"));
	}

}
