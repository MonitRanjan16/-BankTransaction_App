# -BankTransaction_App
Overview
The monit1 package provides a simple banking system with functionality to check balance, verify PIN, and perform deposit transactions. The system includes classes for managing account balance, PIN verification, and transactions.

Components
1. Balance Class
Manages the account balance.

Attributes:
bal: A public double representing the current balance (initialized to 2000).
Methods:
getBalance(): Returns the current balance.
2. CheckPinNo Class
Verifies if the provided PIN is correct.

Methods:
verify(int PinNo): Returns true if the provided PIN is 1111, 2222, or 3333, otherwise returns false.
3. Deposit Class
Handles deposit transactions and implements the Transaction interface.

Methods:
process(int amt): Deposits the specified amount into the account and prints the transaction details.
4. Transaction Interface
Defines the structure for transaction operations.

Attributes:
Balance b: A static final instance of the Balance class, shared across all transactions.
Methods:
process(int amt): An abstract method to process transactions.


Overview
The monit2 package extends the functionality provided by the monit1 package. It introduces a main class BankMainClass that allows users to interact with the banking system through a command-line interface for PIN verification, deposits, and withdrawals.

Components
1. BankMainClass Class
Provides a command-line interface for users to interact with the banking system.

Methods:
main(String[] args): The main method that runs the program, allowing users to enter their PIN, choose an action (withdraw or deposit), and process the transaction.
2. Dependencies
The monit2 package depends on the monit1 package, which includes:

Balance class: Manages account balance.
CheckPinNo class: Verifies PIN numbers.
Deposit class: Handles deposit transactions.
Transaction interface: Defines the structure for transactions.
Usage
