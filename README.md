# ✊ Rock Paper Scissors

> Challenge the computer in the classic Rock, Paper, Scissors game, built with Java and simple command-line interaction.

![Java](https://img.shields.io/badge/Java-Programming-orange?logo=openjdk&logoColor=white)
![Interface](https://img.shields.io/badge/Interface-CLI-blue)
![Dependencies](https://img.shields.io/badge/Dependencies-Standard%20Library-green)
![Build](https://img.shields.io/badge/Build-Java%20Compiler-lightgrey)
![License](https://img.shields.io/badge/License-Not%20Specified-lightgrey)

## 📑 Table of Contents

- [Overview](#-overview)
- [Why, What, and How](#-why-what-and-how)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Game Rules](#-game-rules)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Installation and Setup](#-installation-and-setup)
- [How to Play](#-how-to-play)
- [Limitations and Future Enhancements](#-limitations-and-future-enhancements)
- [Contributing](#-contributing)
- [License](#-license)
- [Author](#-author)

## 🚀 Overview

Rock Paper Scissors is a classic hand game in which two players simultaneously choose Rock, Paper, or Scissors. The winner is determined by the relationship between their choices.

This project implements the game in Java, allowing a user to play against a computer opponent through a command-line interface. The computer generates its choice randomly, and the program determines and displays the outcome.

## 💡 Why, What, and How

### Why — The Problem

Beginners learning programming need practical exercises that demonstrate input handling, conditional logic, random number generation, and program flow. A familiar game provides a simple and engaging way to practice these concepts.

### What — The Solution

Rock Paper Scissors is a lightweight Java application that lets a player compete against the computer in a single round.

The program displays both choices and determines whether the player wins, the computer wins, or the game ends in a draw.

### How — The Implementation

1. **Input:** The player enters `0` for Rock, `1` for Paper, or `2` for Scissors.
2. **Random selection:** Java's `Random` class generates the computer's choice.
3. **Choice display:** The application translates the numeric choices into readable names.
4. **Winner determination:** Conditional statements compare the two choices using the standard game rules.
5. **Result:** The program prints the winner or announces a draw.

The application runs entirely in the terminal and requires no external libraries.

## ✨ Features

- **Player Input:** Select Rock, Paper, or Scissors using numeric choices.
- **Random Computer Opponent:** The computer selects a move randomly.
- **Winner Detection:** Determines the outcome using the game's rules.
- **Clear Results:** Displays both player choices and the final result.
- **Lightweight Execution:** Runs locally using the Java compiler and runtime.
- **No External Dependencies:** Uses classes available in the Java standard library.

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

| Technology | Purpose |
|---|---|
| Java | Implements the game logic |
| `Scanner` | Reads player input from the terminal |
| `Random` | Generates the computer's move |
| Conditional statements | Determines the winner |
| `javac` | Compiles the Java source file |
| `java` | Executes the compiled program |

## 🎮 Game Rules

The game follows the standard rules:

| Player Choice | Beats |
|---|---|
| ✊ Rock | Scissors |
| ✋ Paper | Rock |
| ✌️ Scissors | Paper |

If both players choose the same move, the result is a draw.

## 📂 Project Structure

```text
ROCK-PAPER-SCISSOR/
├── RockPaperScissor.java
└── .gitattributes
```

### File Description

- `RockPaperScissor.java` — Contains the main method, input handling, computer move generation, and winner determination.
- `.gitattributes` — Configures Git handling for repository files.

## 💻 Prerequisites

- Java Development Kit (JDK).
- A terminal or command prompt.
- Git, if you want to clone the repository.

Verify your Java installation:

```bash
java -version
javac -version
```

## ⚙️ Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/pratikabhang/ROCK-PAPER-SCISSOR.git
```

### 2. Navigate to the Project Directory

```bash
cd ROCK-PAPER-SCISSOR
```

### 3. Compile the Java Program

```bash
javac RockPaperScissor.java
```

### 4. Run the Game

```bash
java RockPaperScissor
```

No database, environment variables, package manager, or external dependencies are required.

## ▶️ How to Play

### Step 1: Start the Game

Run the compiled Java program. The terminal displays:

```text
Enter 0 for Rock, 1 for Paper, and 2 for Scissors:
```

### Step 2: Choose Your Move

Enter one of the supported numeric options:

- `0` — Rock
- `1` — Paper
- `2` — Scissors

### Step 3: View the Result

The application displays your choice, the computer's choice, and the outcome.

Example:

```text
Enter 0 for Rock, 1 for Paper, and 2 for Scissors: 0
User choice: Rock
Computer choice: Scissors
User wins!
```

The computer's move is random, so the output will vary between runs.

## 🔮 Limitations and Future Enhancements

The current implementation is a single-round game. Potential improvements include:

- Validate input so values outside `0`, `1`, and `2` are rejected.
- Handle non-numeric input without terminating unexpectedly.
- Add a replay option for multiple rounds.
- Track player wins, computer wins, and draws.
- Introduce a best-of-three or best-of-five mode.
- Improve the interface with clearer prompts and formatted output.
- Separate game logic into reusable methods.
- Add automated tests for every possible combination of moves.

These are proposed enhancements, not features of the current implementation.

## 🤝 Contributing

Contributions and suggestions are welcome.

1. Fork the repository.
2. Clone your fork:

   ```bash
   git clone https://github.com/<your-username>/ROCK-PAPER-SCISSOR.git
   cd ROCK-PAPER-SCISSOR
   ```

3. Create a feature branch:

   ```bash
   git checkout -b feature/your-feature-name
   ```

4. Implement and test your changes.
5. Commit your work:

   ```bash
   git add RockPaperScissor.java
   git commit -m "Improve game input validation"
   ```

6. Push your branch:

   ```bash
   git push origin feature/your-feature-name
   ```

7. Open a pull request with a description of your changes.

## 📄 License

No `LICENSE` file is listed in the current repository. The project's license is therefore **not specified**.

Add an appropriate license file if you intend to distribute the project under specific license terms.

## 👨‍💻 Author

**Pratik Abhang**

- GitHub: [@pratikabhang](https://github.com/pratikabhang)
- Repository: [ROCK-PAPER-SCISSOR](https://github.com/pratikabhang/ROCK-PAPER-SCISSOR)

---

⭐ If you enjoy this project, consider starring the repository.

*Built with Java. Made for learning and fun.*

