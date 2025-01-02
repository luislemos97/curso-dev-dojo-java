# Maratona Java - Estudos e Aprendizados

Este repositório contém os estudos realizados durante a **Maratona Java**, abordando conceitos fundamentais e avançados da linguagem Java. A seguir, você encontrará um resumo detalhado dos tópicos estudados e os principais aprendizados.

---

## Índice
1. [Tipos Primitivos](#1-tipos-primitivos)
2. [Estruturas Condicionais](#2-estruturas-condicionais)
3. [Estruturas de Repetição](#3-estruturas-de-repetição)
4. [Arrays](#4-arrays)
5. [Orientação a Objetos (OO)](#5-orientação-a-objetos-oo)
6. [Modificadores de Acesso e Controle](#6-modificadores-de-acesso-e-controle)
7. [Polimorfismo](#7-polimorfismo)
8. [Classes Internas](#8-classes-internas)
9. [Enumerações (Enums)](#9-enumerações-enums)
10. [Coleções](#10-coleções)
11. [Streams e Lambda](#11-streams-e-lambda)
12. [Exceções e Tratamento de Erros](#12-exceções-e-tratamento-de-erros)
13. [Pacotes Utilitários](#13-pacotes-utilitários)

---

## 1. Tipos Primitivos
- **Conceito:** Dados básicos de Java (int, double, boolean, etc.).
- **Exemplo:**
  ```java
  int idade = 25;
  double salario = 4500.50;
  boolean ativo = true;
  ```

---

## 2. Estruturas Condicionais
- **Conceito:** Controle de fluxo com `if`, `else if`, `else` e `switch`.
- **Exemplo:**
  ```java
  if (idade >= 18) {
      System.out.println("Maior de idade");
  } else {
      System.out.println("Menor de idade");
  }
  ```

---

## 3. Estruturas de Repetição
- **Conceito:** Iterações com `for`, `while` e `do-while`.
- **Exemplo:**
  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println("Iteração: " + i);
  }
  ```

---

## 4. Arrays
- **Conceito:** Estruturas para armazenar múltiplos valores de um mesmo tipo.
- **Exemplo:**
  ```java
  int[] numeros = {1, 2, 3, 4, 5};
  for (int numero : numeros) {
      System.out.println(numero);
  }
  ```

---

## 5. Orientação a Objetos (OO)
- **Conceito:** Fundamentos como classes, objetos, herança, encapsulamento e abstração.
- **Exemplo:**
  ```java
  class Pessoa {
      private String nome;

      public Pessoa(String nome) {
          this.nome = nome;
      }

      public String getNome() {
          return nome;
      }
  }
  ```

---

## 6. Modificadores de Acesso e Controle
- **Conceito:** `private`, `public`, `protected` e o modificador padrão.
- **Exemplo:**
  ```java
  public class Carro {
      private String modelo;

      public String getModelo() {
          return modelo;
      }

      public void setModelo(String modelo) {
          this.modelo = modelo;
      }
  }
  ```

---

## 7. Polimorfismo
- **Conceito:** Habilidade de um método ou objeto assumir múltiplas formas.
- **Exemplo:**
  ```java
  class Animal {
      public void emitirSom() {
          System.out.println("Som genérico");
      }
  }

  class Cachorro extends Animal {
      @Override
      public void emitirSom() {
          System.out.println("Latido");
      }
  }
  ```

---

## 8. Classes Internas
- **Conceito:** Classes definidas dentro de outra classe.
- **Exemplo:**
  ```java
  class Externa {
      class Interna {
          void metodo() {
              System.out.println("Método da classe interna");
          }
      }
  }
  ```

---

## 9. Enumerações (Enums)
- **Conceito:** Conjunto fixo de constantes.
- **Exemplo:**
  ```java
  public enum Dia {
      SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
  }
  ```

---

## 10. Coleções
- **Conceito:** Manipulação de grupos de objetos com `List`, `Set`, `Map`, etc.
- **Exemplo:**
  ```java
  List<String> nomes = new ArrayList<>();
  nomes.add("Beatriz");
  nomes.add("Luís");
  ```

---

## 11. Streams e Lambda
- **Conceito:** Operações funcionais para manipular coleções e fluxos de dados.
- **Exemplo:**
  ```java
  List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
  numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
  ```

---

## 12. Exceções e Tratamento de Erros
- **Conceito:** Gerenciamento de erros com `try-catch` e `throws`.
- **Exemplo:**
  ```java
  try {
      int resultado = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Erro: " + e.getMessage());
  }
  ```

---

## 13. Pacotes Utilitários
- **Conceito:** Classes como `java.util` para manipulação de datas, listas e outros.
- **Exemplo:**
  ```java
  LocalDate hoje = LocalDate.now();
  System.out.println("Data atual: " + hoje);
  ```

---

## Conclusão

Esses tópicos cobrem fundamentos importantes da linguagem Java, além de técnicas avançadas que são indispensáveis para o desenvolvimento moderno. Este repositório será atualizado conforme novos aprendizados forem adquiridos. Se você quiser explorar ou contribuir, fique à vontade para abrir uma *issue* ou um *pull request*!
