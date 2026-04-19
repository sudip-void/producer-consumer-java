# producer-consumer-java
Implementation of Producer Consumer Problem using Java Multi-threading.
# Producer-Consumer Problem in Java

## 📌 Overview

This project demonstrates the classic Producer-Consumer problem using Java Multithreading, synchronization, wait(), and notifyAll().

## ⚙️ Concepts Used

* Multithreading (Runnable interface)
* Synchronization
* Inter-thread communication (wait & notifyAll)
* Shared resources handling

## 🧠 How It Works

* Producer adds items to a shared list
* Consumer removes items
* If list is full → Producer waits
* If list is empty → Consumer waits

## ▶️ Output Example

New Product: 0
New Product: 1
Taken Product: 0

## 🚀 Future Improvements

* Use BlockingQueue
* Add multiple producers & consumers
* Improve logging

## 👨‍💻 Author

Sudip Mondal
