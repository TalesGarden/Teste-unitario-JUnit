# Teste-unitario-JUnit

Teste de Unidade tem como objetivo garantir que uma unidade ou classe funciona, testando unidades individuais de programa de forma independente. Uma unidade é a menor parte testável de um programa de computador.

## Por que escrever testes unitários ?

### Pirâmide de testes : A base da pirâmide são os testes unitários
### Teste unitários como métrica de Qualidade(confiabilidade)
### Cobertura de testes : Medida de qualidade de software
### Automação na execução de testes
### Cultura de agilidade.



# Configurando JUnit

## Maven

Adicionar no `pom.xml` do projeto a dependência abaixo:

```xml
<dependency>  
 <groupId>org.junit.jupiter</groupId>  
 <artifactId>junit-jupiter-engine</artifactId>  
 <version>${junit.jupiter.version}</version>  
 <scope>test</scope>  
</dependency>
```
## Gradle

Adicionar ao arquivo `build.gradle`  `testImplementation` no closure `dependencies` e `useJUnitPlatform()` no closure `test`, ficando mais ou menos assim.

```groovy
dependencies {  
	//demais dependências do projeto
  testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.2'  
}  
  
test {  
  useJUnitPlatform()  
}
```

Observação: A versão escolhida acima, `5.8.2`, escolhida nos exemplos, era a mais recente até o momento deste manual. Verificar versão mais nova em [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine).
