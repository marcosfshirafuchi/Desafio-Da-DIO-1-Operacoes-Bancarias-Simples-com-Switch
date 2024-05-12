# <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> Condições, Loops e Exceções na Prática com Java
www.dio.me


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)
# Desafio 01 / 05 - Operações Bancárias Simples com Switch
## Descrição
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual
<br><br>


## Entrada


* O programa exibirá um menu com as seguintes opções:
1. Depositar
2. Sacar
3. Consultar Saldo
4. Encerrar<br>
* O usuário escolherá uma dessas opções digitando o número correspondente.

## Saída

* Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

* Se o usuário escolher:
  * 1: O programa solicitará o valor a ser depositado e atualizará o saldo.
  * 2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente.
  * 3: O programa exibirá o saldo atual da conta.
  * 0: O programa encerrará. 
## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
<table>
  <thead>
    <tr align="left">
      <th>Entrada</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>1<br>
50<br>
2<br>
100<br>
0<br>
      </td>
      <td>Saldo atual: 50.0<br>
Saldo insuficiente.<br>
Programa encerrado.<br>
      </td>
    </tr>
    <tr>
      <td>3<br>
1<br>
550 <br>
0<br>
      </td>
      <td>Saldo atual: 0.0<br>
Saldo atual: 550.0<br>
Programa encerrado.</td>
    </tr>
    <tr>
      <td>1<br>
1000<br>
2<br>
500<br>
0
</td>
      <td>Saldo atual: 1000.0<br>
Saldo atual: 500.0<br>
Programa encerrado.<br>
</td>   
    </tr>
  </tbody>
  <tfoot></tfoot>
</table>





