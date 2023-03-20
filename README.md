# Validador de Conta Bancária (Gradle)

    Este projeto foi realizado com o objetivo de aprimorar o conhecimento na linguagem Java.

## :zap: Descrição

**Pequeno sistema de apoio à validação de contas bancárias.**

O desenvolvimento deste sistema tem como objetivo garantir que o formato das contas informadas pela pessoa usuária esteja de acordo com as diretrizes da  instituição (contas com 6 dígitos).

:pushpin: Defini o projeto como `gradle` para manter a gestão de dependências automatizada, escalável e distribuída;

:pushpin: Utilizei a biblioteca `Apache Commons Lang` na versão `3.11` para garantir a aderência entre todos os outros projetos da "empresa";

:pushpin: Empacotei a aplicação no formato `jar`.

### 🟡 A pessoa usuária informará o número da conta bancária no console do sistema. 

Coube ao sistema validar se o valor informado é maior, menor ou igual a 6 dígitos    

> - ❌ Valores não númericos não serão aceitos;
> - ❌ `conta < 6 dígitos`: adicionará zeros à esquerda até atender ao tamanho de 6 números;
> - ❌ `conta > 6 dígitos`: será removidos todos os números antes dos 6 últimos;
> - ✅ `conta = 6 dígitos`: já está aderente, o valor permanecerá inalterado.

### 🔸 Exemplos de entradas e saídas

- Se a pessoa usuária informar a conta `123` no input do console, irá obter como resultado um feedback ok:
```
    Informe o número da conta:
    123
    Número da conta: 000123
```

- No entanto, se a pessoa usuária informar a conta `1234567890` no input do console, irá obter como resultado a mensagem de aviso:
```
    Informe o número da conta:
    1234567890
    Número da conta: 567890
```

- Caso seja informado um valor não numérico (por exemplo `12345-X`), uma mensagem validando aparecerá:
```
    Informe o número da conta: 
    12345-X
    Número da conta inválido!
```


## Instalação do projeto em sua máquina
  1. Clone o repositório
   
     `git@github.com:analuisams99/bank-account.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd bank-account`
     
  

## Para testar o projeto
  1. digite o comando no seu terminal
      
      `gradle build`
      
    Os códigos de testes, da pasta src/test/java/com/trybe/acc/java/bankaccount, 
    foram desenvolvidos pela Trybe.
    
---

-- Projeto desenvolvido por Ana Luisa Marques Simões, para fins didáticos. 2023
