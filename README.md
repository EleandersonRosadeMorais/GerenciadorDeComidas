# 🍎 Food Manager – Sistema de Gerenciamento de Comidas
> Aplicativo Android em **Java** para cadastro e controle nutricional de alimentos.

---

## 📱 Visão Geral

O **Food Manager** é um aplicativo Android desenvolvido para facilitar o **cadastro e acompanhamento nutricional** de alimentos.  
Com uma **interface moderna e intuitiva**, o app permite registrar comidas com detalhes completos (calorias, carboidratos, proteínas e gorduras) e visualizar os dados de forma organizada.

---

## 🚀 Funcionalidades

✅ **Cadastro de Alimentos** – Nome, calorias, carboidratos, proteínas e gorduras  
✅ **Listagem Inteligente** – Exibição em cards com contador de registros  
✅ **Interface Moderna** – Material Design e suporte a tema escuro  
✅ **Validações** – Confirmações para ações de cadastro e cancelamento  
✅ **Navegação Intuitiva** – Fluxo simples entre telas principais

---

## 🛠️ Tecnologias Utilizadas

- **Java** – Linguagem principal
- **Android SDK** – Framework de desenvolvimento
- **XML** – Criação de layouts e interfaces
- **Material Design** – Componentes de UI modernos
- **ConstraintLayout** – Layouts responsivos
- **Gradle** – Gerenciamento de dependências

---

## ⚙️ Como Executar

**Pré-requisitos:**
- Android Studio (versão mais recente)
- Emulador Android ou dispositivo físico com API 21+

**Passos:**
```bash
# 1. Clone o repositório
git clone https://github.com/EleandersonRosadeMorais/GerenciadorDeComidas

# 2. Acesse a pasta
cd food-manager

# 3. Abra no Android Studio
android-studio .

# 4. Execute o app
# (Shift + F10 ou Run 'app')
```

---

## 📂 Estrutura do Projeto

```bash
📦 app
├── 📂 manifests/
│   └── AndroidManifest.xml
├── 📂 java/com/ulbra/comidas/
│   ├── MainActivity.java
│   ├── Registro.java
│   ├── TelaPrincipal.java
│   ├── TelaCadastroComida.java
│   └── TelaListagemComidas.java
├── 📂 res/
│   ├── 📂 drawable/
│   ├── 📂 layout/
│   ├── 📂 mipmap/
│   └── 📂 values/
└── 📂 Gradle Scripts/
```

---

## 💻 Exemplo de Código

```java
public class Registro {
    private String nome;
    private String kcal;
    private String carboidratos;
    private String proteinas;
    private String gorduras;

    public Registro(String nome, String kcal, String carboidratos,
                    String proteinas, String gorduras) {
        this.nome = nome;
        this.kcal = kcal;
        this.carboidratos = carboidratos;
        this.proteinas = proteinas;
        this.gorduras = gorduras;
    }
}
```

---

## 🎯 Objetivo do Projeto

Projeto desenvolvido com fins educacionais, com foco em:
- Práticas de programação **Java para Android**
- Uso de **Material Design** e boas práticas de UI/UX
- Estruturação e gerenciamento de dados no app
- Organização de código e arquitetura limpa

---

## 👤 Autor

**Eleanderson Rosa de Morais**  
📧 eleandersonmorais@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/eleanderson-rosa-de-morais-9aaab9324/)  
🔗 [GitHub](https://github.com/EleandersonRosadeMorais/)

---

## 💬 Contato

Dúvidas, sugestões ou colaborações?  
Entre em contato por email ou via redes sociais.  
Contribuições são bem-vindas! 🚀
