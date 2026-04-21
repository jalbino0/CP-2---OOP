# Check Point 2 — FiapDelivery

Projeto desenvolvido em **Java** com foco em **refatoração orientada a objetos**, aplicando conceitos de **encapsulamento, herança, associação, construtores, documentação e clean code**.

O objetivo deste trabalho é transformar um código legado com falhas de modelagem e organização em uma solução mais **segura, reutilizável, escalável e manutenível**.

---

# Sobre o Projeto

O **FiapDelivery** foi proposto como um sistema de logística e entregas, porém o código inicial apresentava diversos problemas estruturais.

No código legado, havia:

- nomes de classes e atributos sem padronização  
- atributos públicos, comprometendo o encapsulamento  
- duplicação de código entre tipos de veículos  
- associação limitada, deixando a rota presa apenas a caminhões  
- ausência de validações e organização arquitetural  

A proposta da atividade foi realizar a **refatoração completa do sistema**, aplicando os princípios de Orientação a Objetos para melhorar a qualidade do projeto.

---
# Repositório do Projeto

https://github.com/jalbino0/CP-2---OOP

---


# Objetivo da Refatoração

O projeto busca corrigir os problemas do sistema original por meio de uma estrutura orientada a objetos mais adequada.

Com a refatoração, o sistema passou a contar com:

- **encapsulamento** dos atributos com uso de `private`, getters e setters  
- **herança** para reaproveitamento de código entre os veículos  
- **associação** mais flexível entre rota, pacote e veículo  
- **construtores** para inicialização correta dos objetos  
- **validações** para impedir dados inconsistentes  
- **clean code**, com nomes mais claros e melhor organização  

---

# Problema Inicial do Código Legado

No enunciado da atividade, o sistema apresentava os seguintes problemas principais:

- uso de nomes ruins e sem significado claro  
- exposição direta dos dados com `public`  
- duplicação de atributos entre `caminhao` e `moto`  
- acoplamento excessivo da classe `Rota`, que aceitava apenas caminhão  

Esses pontos motivaram a refatoração do projeto para um modelo mais profissional.

---

# Estrutura Refatorada do Sistema

A solução foi reorganizada nas seguintes classes:

## Veiculo
Classe abstrata responsável por representar características comuns dos veículos.

Atributos principais:
- placa  
- capacidade de carga  

## Caminhao
Classe que herda de `Veiculo` e adiciona:
- quantidade de eixos  

## Moto
Classe que herda de `Veiculo` e adiciona:
- informação sobre presença de baú  

## Pacote
Classe responsável por representar o pacote transportado.

Atributos principais:
- código  
- peso  
- status  

## Rota
Classe que associa:
- um `Pacote`  
- um `Veiculo`  

Também contém a lógica para iniciar a entrega.

## Principal
Classe principal responsável por executar o sistema e testar o funcionamento da refatoração.

---

# Conceitos de Orientação a Objetos Aplicados

## Encapsulamento
Todos os atributos passaram a ser privados, com acesso controlado por getters e setters.

## Herança
As classes `Caminhao` e `Moto` reutilizam os atributos e métodos comuns da superclasse `Veiculo`.

## Associação
A classe `Rota` foi modelada para trabalhar com um `Veiculo`, permitindo o uso de diferentes tipos de transporte no sistema.

## Construtores
As classes passaram a receber seus dados principais no momento da criação do objeto.

## Clean Code
Os nomes das classes, métodos e atributos foram padronizados para tornar o código mais legível e fácil de manter.

---

# UML do Projeto

O diagrama UML do sistema foi construído no **Astah**, representando:

- herança entre `Veiculo`, `Caminhao` e `Moto`  
- associação entre `Rota`, `Pacote` e `Veiculo`  
- atributos e métodos das classes  

A exportação do diagrama foi realizada em **PNG**, conforme solicitado no trabalho.

---

# Imagem do Diagrama UML

O diagrama UML do projeto foi desenvolvido no **Astah** e exportado em **PNG**, conforme solicitado no trabalho.


![Diagrama UML do FiapDelivery](Class%20Diagram.png)

---


# Funcionalidades Implementadas

## Cadastro de objetos
- criação de veículos com construtores  
- criação de pacotes com código, peso e status  
- criação da rota com associação entre pacote e veículo  

## Controle de dados
- validação de placa  
- validação de capacidade de carga  
- validação de peso do pacote  
- validação de status  

## Simulação de entrega
- exibição do pacote transportado  
- identificação do veículo utilizado  
- atualização do status do pacote para **Em transporte**  

---

# Exemplo de Saída do Programa

```text
Levando pacote BR999 no veículo ABC1234 (Caminhão)
Status do pacote: Em transporte
```

Também é possível testar o sistema com `Moto`, trocando o tipo de veículo no `main`.

---

# Estrutura do Projeto

```text
src/
├── main/
│   └── Principal.java
└── model/
    ├── Veiculo.java
    ├── Caminhao.java
    ├── Moto.java
    ├── Pacote.java
    └── Rota.java
```

Descrição da estrutura:

- `Principal.java` → ponto de entrada da aplicação  
- `Veiculo.java` → superclasse abstrata dos veículos  
- `Caminhao.java` → especialização de veículo de carga  
- `Moto.java` → especialização de veículo leve  
- `Pacote.java` → entidade do pacote transportado  
- `Rota.java` → associação entre pacote e veículo  

---

# Como Rodar o Projeto

## Pré-requisitos

- JDK 17 ou superior  
- Eclipse, IntelliJ IDEA ou outra IDE Java  

---

## Executando o projeto

1. Clone o repositório:

```bash
git clone https://github.com/jalbino0/CP-2---OOP.git
```

2. Acesse a pasta do projeto:

```bash
cd CP-2---OOP
```

3. Importe o projeto na sua IDE Java.

4. Execute a classe:

```text
Principal.java
```

---

# Tecnologias Utilizadas

- Java  
- Programação Orientada a Objetos  
- Astah UML  
- GitHub  

---

# Aprendizados com o Projeto

Durante o desenvolvimento deste trabalho, foi possível praticar:

- modelagem orientada a objetos  
- refatoração de código legado  
- aplicação de herança e associação  
- melhoria de organização e legibilidade do código  
- construção de diagrama UML a partir da implementação  

---

# Integrante

- João Pedro de Moura Albino — RM: 565323

---

# Entrega

Para a entrega do trabalho, foram considerados:

- código refatorado em Java  
- diagrama UML exportado pelo Astah em PNG  
- repositório no GitHub com os arquivos do projeto  

---

# Licença

Projeto desenvolvido para fins acadêmicos na **FIAP**.
