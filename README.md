# 🚀 Packer Unpacker - Java File Archiving Utility (CUI Based)

**Packer Unpacker** is a Java-based Command Line Interface (CUI) application that simulates a basic file archiving system. It allows users to **pack multiple files** into a single custom archive file and later **unpack** them back to their original state.

This project demonstrates **manual byte-level file handling**, **header-based metadata management**, and **Java I/O** operations — mimicking core features of real-world tools like ZIP or TAR with a custom implementation.

---

## ✨ Features

- 🔄 Pack multiple `.txt` or other files into a single archive
- 📤 Unpack and recover original files from the archive
- 🔐 Fixed 100-byte headers store file name and size metadata
- 🧠 Memory-efficient: uses buffered streams for processing
- 📦 No external libraries or frameworks used
- 🧩 Modular, object-oriented design
- 💬 Interactive CLI with help section and input prompts

---

## 🎥 Demo

```
+----------------------------------------------------------+
|---- Dnyanesh Packer Unpacker Complete CUI Module -----------|
+----------------------------------------------------------+
Welcome to the Packer Unpacker Application!

Please choose an option from the menu below:
1. Packing
2. Unpacking
3. Help
4. Exit
```

---

## ⚙️ Getting Started

### ✅ Requirements:
- Java 21 or later
- Terminal/Command Prompt

### 🧪 To Run:
```bash
javac Packing_Unpacking_Final.java
java Packer_Unpacker.Packing_Unpacking_Final
```

---

## 🧠 How It Works

### 🔹 Packing
- User enters a directory path.
- Application filters and reads all `.txt` files.
- Adds a 100-byte header for each file containing its name and size.
- Writes each file's content after its respective header.
- Final packed file is created.

### 🔹 Unpacking
- User enters the packed file name.
- Application reads headers and retrieves original filenames and sizes.
- Extracts and recreates original files.

---

## 📁 Project Structure

```
Packer_Unpacker/
├── Packing_Unpacking_Final.java     # Main application entry
├── PackingFunctionality             # Handles packing logic
└── UnpackingFunctionality           # Handles unpacking logic
```

---

## 🛠 Technologies Used

- Java (JDK 21+)
- File, FileInputStream, FileOutputStream
- Scanner for user input
- CLI (Command Line Interface)

---

## 🚧 Future Enhancements

- Add support for all file types (.jpg, .pdf, etc.)
- Implement actual compression algorithms (e.g., Huffman, LZW)
- GUI version using JavaFX or Swing
- Recursive folder traversal
- Add integrity checks and file validations

---

## 👨‍💻 Author

[**Dnyanesh More**](https://github.com/dnyanesh21Sep)  
✨ Crafting code, solving problems, and building impactful solutions.

---

## 📦 About

🚀 A comprehensive command-line Java application to simulate real-world file archiving and extraction. This project merges the power of low-level byte stream operations with object-oriented design to demonstrate how `.txt` files can be packed into a single archive and later unpacked back into their original state.

---

## 🏷️ Topics

- java

---

## 📊 Stats

- ⭐ 1 star
- 👀 0 watching
- 🍴 0 forks

---

## 📦 Releases

- No releases published

## 📦 Packages

- No packages published

## 💻 Languages

- Java 100%

---

© 2025 GitHub, Inc.
