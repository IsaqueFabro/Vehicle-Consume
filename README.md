# Vehicle Fuel Consumption

Este é um projeto acadêmico desenvolvido em Java para calcular o consumo de combustível de um veículo em Km/L. O projeto foi criado por mim, como parte dos meus estudos de programação em Java, na materia Problemas e solucoes Computacionais com o objetivo de aplicar e consolidar conhecimentos sobre orientação a objetos, entrada de dados, e operações matemáticas básicas.

### Descrição

O programa solicita ao usuário duas entradas:

A distância percorrida pelo veículo (em quilômetros).
A quantidade de combustível consumida (em litros).
Com esses valores, o programa calcula e exibe o consumo de combustível em Km/L, permitindo avaliar a eficiência do veículo.

### Estrutura do Projeto

O projeto é dividido em duas classes:

Vehicle.java: Define a classe Vehicle com os atributos distance e fuel e métodos para manipular esses dados e calcular o consumo.

Main.java: Contém o método principal que interage com o usuário, coleta as entradas e exibe o resultado do cálculo.

### Desafios e Soluções

1. Leitura de Números Decimais
2. 
Um dos principais desafios foi fazer com que o programa aceitasse números com pontos decimais (exemplo: 12.5 para a quantidade de combustível). Em algumas configurações de localidade (locale), o Java espera números com vírgulas (ex.: 12,5). Esse problema causava erros na entrada de dados do usuário.

Solução: Para resolver essa questão, defini o Locale como US na classe Main, utilizando o método scanner.useLocale(Locale.US);. Isso permite que o programa aceite números com pontos como separador decimal, garantindo uma entrada de dados mais consistente.

### 2. Organização em Módulos

Outro desafio foi estruturar o projeto em pacotes (model e main), separando a lógica de negócios (classe Vehicle) do código de interação com o usuário (classe Main). Isso reforça o conceito de modularidade e organização do código, facilitando a manutenção e a leitura.

Solução: Utilizei pacotes para organizar as classes, colocando Vehicle no pacote model e Main no pacote main. Essa estrutura respeita boas práticas de organização em projetos Java.

### Como Executar
Certifique-se de ter o Java JDK instalado em sua máquina. 

Compile as classes Vehicle.java e Main.java.

Execute o programa a partir da classe Main e siga as instruções na tela para inserir a distância e o combustível consumido.

### Aprendizados

Este projeto reforçou conhecimentos sobre:

Entrada de dados com Scanner: incluindo o uso de Locale para garantir compatibilidade de entrada decimal.

Orientação a objetos: aplicando encapsulamento e métodos em uma classe para manipulação de dados.

Estrutura de pacotes: organizando o código de forma modular e seguindo boas práticas de organização.
