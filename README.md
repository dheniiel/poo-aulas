# POO Aulas

Exercícios e exemplos em **Java** desenvolvidos nas aulas de **Programação Orientada a Objetos (POO)**. Cada pacote em `src/` trata de um conceito: encapsulamento, construtores, herança, polimorfismo, classes abstratas e interfaces.

## Tecnologias

- Java (projeto configurado para **JDK 23**)
- NetBeans IDE (projeto Ant: `build.xml` + `nbproject/`)

## Estrutura

```
poo-aulas/
├── src/
│   ├── aula1/             # Classes, métodos, getters/setters e entrada de dados
│   ├── aula2/             # Encapsulamento: conta bancária com depósito
│   ├── aula3/             # Herança e construtores (Animal → Cavalo, Leão)
│   ├── heranca/           # Herança com super() (Pessoa → Cliente, Fornecedor)
│   ├── IMC/               # Calculadora de IMC com menu
│   ├── NotaAluno/         # Vetor de objetos: maior, menor nota e média
│   ├── Teste/             # Polimorfismo: operações matemáticas
│   ├── Abstratic/         # Classes e métodos abstratos
│   ├── InterfaceTeste/    # Interface simples (Veiculo → Carro)
│   ├── InterfaceExemplo/  # Múltiplas interfaces (Smartphone implements GPS, Radio)
│   └── Escola/            # Interface implementada por Estudante e Professor
├── nbproject/             # Configuração do NetBeans
├── build.xml              # Script de build Ant
└── manifest.mf
```

## Conteúdo por pacote

| Pacote | Conceito | Classe executável | O que faz |
|---|---|---|---|
| `aula1` | Classes, métodos estáticos, getters/setters | `Teste`, `Usuario` | Compara dois números e mostra a data em ms; calcula imposto de medicamento (10% até R$ 100, 15% acima) |
| `aula2` | Encapsulamento | `App` | Menu para depositar em duas contas, aplicando um percentual sobre o valor |
| `aula3` | Herança e sobrecarga de construtores | `Main` | Cadastra um cavalo e um leão e exibe seus dados em tabela |
| `heranca` | Herança com `super()` | `PessoaPrincipal` | Cadastra cliente (salário líquido) e fornecedor (valor do produto + imposto) |
| `IMC` | Composição de classes | `App` | Lê nome, CPF, peso e altura e calcula o IMC com sua faixa de classificação |
| `NotaAluno` | Vetor de objetos | `Nota` | Cadastra N alunos e calcula maior nota, menor nota e média |
| `Teste` | Polimorfismo (sobrescrita) | `ProgramaOperacaoMatematica` | Soma, subtração, multiplicação e divisão via `OperacaoMatematica.calcular()` |
| `Abstratic` | Classe abstrata | `ProgramaAnimalAbstract` | Cota diária de leite de gato e rato via método abstrato |
| `InterfaceTeste` | Interface | `ProgramaVeiculoInterface` | `Carro` implementa `iniciar()` e `parar()` de `Veiculo` |
| `InterfaceExemplo` | Múltiplas interfaces | — | `Smartphone` implementa `GPS` e `Radio` |
| `Escola` | Interface | — | `Estudante` e `Professor` (abstrata) implementam `PessoaInterface` |

## Como executar

### NetBeans

1. **File → Open Project** e selecione a pasta do repositório.
2. Clique com o botão direito na classe desejada → **Run File** (Shift + F6).

> A classe principal padrão do projeto é `aula1.Teste`.

### Terminal

```bash
git clone https://github.com/dheniiel/poo-aulas.git
cd poo-aulas

# compilar tudo
javac -d out $(find src -name "*.java")

# executar uma classe (pacote.Classe)
java -cp out Teste.ProgramaOperacaoMatematica
java -cp out IMC.App
```

No Windows (PowerShell), compile com:

```powershell
javac -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
```

## Pontos de atenção

Problemas conhecidos no código, úteis como exercício de correção:

- **`NotaAluno.Nota`**: o vetor `alunos` é criado, mas os objetos não são instanciados (`alunos[i] = new Aluno()`), o que gera `NullPointerException`.
- **`aula2.App`**: a opção 2 deposita em `conta1` em vez de `conta2`.
- **`aula3.Main`**: o tamanho do leão recebe `tamanhoCav` em vez de `tamanhoLeao`.
- **`IMC.App`**: o retorno de `verificarIMC()` não é exibido; falta um `System.out.println(...)`.
- O diretório `build/` (arquivos `.class`) está versionado; o ideal é ignorá-lo com um `.gitignore`.

## Autor

**Dheniel** — [@dheniiel](https://github.com/dheniiel)
