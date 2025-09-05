# 📚 Resolução de Exercícios - FJ-11: Java e Orientação a Objetos

Este repositório registra minha jornada de estudos da apostila **"Java e Orientação a Objetos" (FJ-11) da Caelum**, com implementações práticas e anotações teóricas.

---

## 🎯 Objetivo

Consolidar e aplicar conceitos de **Java** e **Orientação a Objetos** por meio de exercícios, seguindo boas práticas de programação e design.

---

## 🛠 Tecnologias e Ferramentas

- **Linguagem:** Java 20  
- **Build Tool:** Maven  
- **IDE:** IntelliJ IDEA  
- **Conceitos aplicados:** OOP, Collections, Threads, Exceptions, IO, Design Patterns básicos  

---

## 🚀 Como Executar

### Usando Maven
```bash
# Compilar todos os arquivos
mvn clean compile

# Executar exemplo de Threads
mvn exec:java -Dexec.mainClass="org.ericfr1tzenvale.threads.TesteThreads"
```

### Usando javac/java
```bash
# Compilar
javac src/main/java/org/ericfr1tzenvale.threads/Programa.java

# Executar
java org.ericfr1tzenvale.threads.TesteThreads
```

---

## 📖 Principais Conceitos Aplicados

```text
Java                    : Portável, seguro, modular e fortemente tipado.
Boas práticas           : camelCase para métodos/variáveis, PascalCase para classes, UPPER_CASE para constantes.
Herança vs Composição   : Herança = "é um", Composição = "tem um".
Interfaces vs Classes   : Interface = contrato de comportamento; Classe abstrata = código + estado compartilhado.
Exceções                : Evitar catch(Exception e); prefira tratamento específico.
Threads                 : Concorrência gera resultados não determinísticos; cada execução pode variar.
Collections             : ArrayList O(n) e HashSet O(1) em média; escolha a estrutura adequada.
String vs StringBuilder : String é imutável; StringBuilder eficiente para concatenações múltiplas.
```

---

## 📌 Observações

```text
- Todos os exercícios estão organizados em pacotes por tema (banco, empresa, IO, threads, etc.).
- Resumos teóricos e anotações estão em exerciciosTeoricos.txt.
- Foco na prática aplicada, reforçando conceitos de OOP e desenvolvimento Java profissional.
```
