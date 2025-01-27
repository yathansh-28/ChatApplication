# Chat Application with GUI using Java

## 📖 Overview
This project is a simple **chat application** with a graphical user interface (GUI) built using Java. It consists of:
- A **client-side program** (`ClientSide`) 
- A **server-side program** (`ServerSide`)

The application enables multiple clients to connect to the server and exchange messages in real-time. The server manages the connections and broadcasts messages to all connected clients, except the sender.

---

## ✨ Features
- **GUI for Client**:
  - A text area to display incoming messages.
  - A text field for typing messages.
  - Buttons for sending messages and exiting the chat.
- **Multi-client Support**: Multiple clients can connect to the server and chat simultaneously.
- **Message Broadcasting**: Messages sent by one client are broadcast to all other connected clients.
- **Exit Functionality**: Clients can gracefully exit the chat by clicking the "EXIT" button.

---

## ⚙️ Requirements
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Integrated Development Environment (IDE)**: IntelliJ IDEA, Eclipse, or any Java-compatible IDE.
- **Network**: Ensure that the server and clients can communicate over the same network.

---

## 🚀 How to Run the Application

### 1️⃣ Server Side
1. **Compile the server program**:
   ```bash
   javac ServerSide.java
2. **Run the server program**:
   ```bash
   java ServerSide

### 2️⃣ Client Side
1. **Compile the Client program**:
   ```bash
   javac ClientSide.java
2. **Run the client program**:
   ```bash
   java ClientSide

### 3️⃣ Enter your username:
   When prompted, input your username in the dialog box.

### 4️⃣ Run Multiple Clients:
   Start the ClientSide program multiple times to simulate multiple users.

---


## 📌 Notes
1.For multiple clients, ensure all instances of ClientSide are running simultaneously.

2.Messages sent by one client will be displayed to all other connected clients in real-time.

---


## 🛠️ Development
This chat application was developed as an example project to demonstrate the use of Java for creating networked applications with a graphical user interface.

Feel free to fork, modify, and improve the code! 🎉
