<div align="center">
  
# Jokenpo

## Aplicativo Android com três telas.

### Tela 01: Tela Inicial
Texto de boas vindas;
Botão para iniciar que leva à Tela 02.

<img src="https://user-images.githubusercontent.com/69218564/230243045-6986df19-40de-4158-854a-dd1380942965.png" alt="tela_01" width="200">

### Tela 02: Seleção de Jogada
Texto com nome do jogador ("Jogador 1");
Texto "Selecionar Jogada";
Spinner provisório para selecionar a jogada (Pedra, Papel ou Tesoura).

<img src="https://user-images.githubusercontent.com/69218564/230243073-acbe73b2-18a6-4d0c-9549-e1a1d4a1a326.png" alt="tela_02" width="200">

### Tela 03: Resultado
Texto "Resultado";
Texto provisório "Jogador XXX ganhou!".

<img src="https://user-images.githubusercontent.com/69218564/230243096-88592053-25b0-4682-80a6-a5bfd4c8fd46.png" alt="tela_03" width="200">

## Componentes

### App Bar (Action Bar):
Nas Telas 02 e 03;
Navigation Drawer na esquerda (Com botões "Jogador 1" e "Resultado");
Menu na direita (Com botão "Home").

### Bottom Navigation:
Nas Telas 02 e 03;
Botões "Jogador" (Tela 02) e "Resultado" (Tela 03).

<img src="https://user-images.githubusercontent.com/69218564/230243128-694e78d1-4df6-4f9e-9a72-9b3b08571702.png" alt="NavDraw" width="200">

</div>

# JokenpoApp

JokenpoApp é um aplicativo simples e divertido que permite jogar Pedra, Papel e Tesoura contra a máquina.

## Funcionalidades

- **Jogo Rápido**: Jogue uma partida rápida de Pedra, Papel e Tesoura.
- **Histórico de Partidas**: Veja o histórico das partidas jogadas.
- **Modo Aleatório**: A máquina escolhe aleatoriamente entre Pedra, Papel e Tesoura.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal utilizada no desenvolvimento do aplicativo.
- **MVVM**: Arquitetura utilizada para separar as responsabilidades do código.
- **LiveData**: Componente do Android Jetpack para observar mudanças de dados.
- **ViewModel**: Componente do Android Jetpack para gerenciar dados relacionados à interface de forma eficiente.

## Instalação

Para instalar e executar o projeto localmente, siga estas etapas:

1. Clone o repositório:
    ```bash
    git clone https://github.com/devgalassini/JokenpoApp.git
    ```

2. Abra o projeto no Android Studio.

3. Compile e execute o aplicativo no emulador ou dispositivo físico.

## Uso

1. Na tela inicial, escolha entre Pedra, Papel ou Tesoura.
2. A máquina fará sua escolha e o resultado da partida será exibido.
3. Veja o histórico das partidas jogadas para acompanhar seu desempenho.

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir, por favor, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-feature`).
3. Faça suas alterações e commit (`git commit -m 'Adiciona nova feature'`).
4. Faça um push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Desenvolvido por [Priscila Galassini](https://www.linkedin.com/in/priscilagalassini/). Entre em contato!

---

Divirta-se usando o JokenpoApp! Se você gostou, por favor, deixe uma estrela no repositório.

