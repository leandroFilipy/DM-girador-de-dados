# 🎲 DM - Girador de Dados

Uma ferramenta simples e prática para rolar dados para jogos de mesa (RPG), ideal para Mestres (DMs) e jogadores — rápida, confiável e cheia de personalidade. Use para rolar d20, d6, fazer testes de habilidade, dano com múltiplos dados e mais! ✨

## 🔍 Sobre
DM - Girador de Dados é um projeto para facilitar rolagens de dados em partidas de RPG. Suporta notação padrão (ex.: `1d20+5`, `3d6`, `2d10-1`) e pode ser usada tanto como utilitário de linha de comando quanto como componente em projetos web/bots (dependendo da implementação).

## ✅ Funcionalidades
- 🎯 Suporta notação de dados clássica (NdM + modificador)
- 🔁 Rolagens múltiplas e somatório automático
- 🧾 Exibe resultado detalhado (cada dado + total)
- 🎛️ Suporte fácil para extensões (vantagem/desvantagem, rolagens com reroll, etc.)

## 🛠️ Instalação
(Instruções genéricas — adapte conforme a stack do repositório)

1. Clone o repositório:
```bash
git clone https://github.com/leandroFilipy/DM-girador-de-dados.git
cd DM-girador-de-dados
```

2. Instale dependências (exemplo Node.js):
```bash
# se o projeto for Node.js
npm install
```

Ou (exemplo Python):
```bash
# se o projeto for Python
pip install -r requirements.txt
```

> Nota: ajuste os comandos acima conforme a tecnologia usada no repositório.

## ▶️ Como usar

Exemplos de notação de dados:
- `1d20` → um d20
- `1d20+5` → um d20 com +5
- `3d6` → três d6, some os resultados
- `2d10-1` → dois d10 com -1

Exemplo de uso em linha de comando (se aplicável):
```bash
# substituir pelo comando real do projeto
./girador "1d20+5"
# saída exemplo:
# 🎲 Rolagem: 1d20+5
# 🔢 Valores: [12] + 5
# ✅ Total: 17
```

Exemplo de uso em código (pseudocódigo):
```python
from dm_girador import rolar
resultado = rolar("3d6")
# resultado.explicacao -> [2, 5, 4]
# resultado.total -> 11
```

## 📋 Exemplos de rolagens
- `1d20` → Resultado: 14
- `1d20+2` → Resultado: 16 (14 + 2)
- `4d6` → Valores: [6, 3, 5, 2] → Total: 16

## 🤝 Como contribuir
Contribuições são bem-vindas! Se quiser ajudar:
1. Fork este repositório
2. Crie uma branch: `git checkout -b feat/nova-funcionalidade`
3. Commit suas mudanças: `git commit -m "Adiciona X"`
4. Push para a branch: `git push origin feat/nova-funcionalidade`
5. Abra um Pull Request descrevendo suas alterações ✨

Sugestões de melhorias:
- Suporte nativo a vantagem/desvantagem (roll 2d20 keep highest/lowest)
- Interface web responsiva
- Integração com bots (Discord/Telegram)

## 📜 Licença
Escolha uma licença adequada (ex.: MIT). Coloque o arquivo LICENSE na raiz do repositório.

## 📬 Contato
Desenvolvedor: leandroFilipy  
GitHub: [leandroFilipy](https://github.com/leandroFilipy)  
Se quiser, abra uma issue para reportar bugs ou sugerir funcionalidades! 🐞💡

---

Divirta-se rolando dados e que os números estejam a seu favor! 🍀✨
