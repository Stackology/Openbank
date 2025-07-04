-- schema for the database
-- This file is used to create the database schema for the application.
CREATE TABLE IF NOT EXISTS Custumer (
    id SERIAL PRIMARY KEY,
    Custumername VARCHAR(50) NOT NULL UNIQUE,
    agency VARCHAR(10) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    birthDate DATE NOT NULL,
    profession VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    country VARCHAR(50) NOT NULL

);
-- Create the Account table
-- This table will store the account information for each customer.
CREATE TABLE IF NOT EXISTS Account (
    id SERIAL PRIMARY KEY,
    agency VARCHAR(10) NOT NULL,
    accountNumber VARCHAR(20) NOT NULL UNIQUE,
    balance DECIMAL(10, 2) NOT NULL DEFAULT 0.00,
    Custumer_id INTEGER NOT NULL,
    FOREIGN KEY (Custumer_id) REFERENCES Custumer(id)

);
-- Create the Transaction table
-- This table will store the transaction history for each account.
CREATE TABLE IF NOT EXISTS Transaction (
    id SERIAL PRIMARY KEY,
    originAccountNumber VARCHAR(20) NOT NULL,
    destinationAccountNumber VARCHAR(20) NOT NULL,
    value DECIMAL(10, 2) NOT NULL,
    transactionDate TIMESTAMP NOT NULL

);
-- Create the Transfer table
-- This table will store the transfer information for each transaction.
CREATE TABLE IF NOT EXISTS Transfer (
    id SERIAL PRIMARY KEY,
    originAccountNumber VARCHAR(20) NOT NULL,
    destinationAccountNumber VARCHAR(20) NOT NULL,
    value DECIMAL(10, 2) NOT NULL,
    transactionDate TIMESTAMP NOT NULL,
    FOREIGN KEY (originAccountNumber) REFERENCES Account(accountNumber),
    FOREIGN KEY (destinationAccountNumber) REFERENCES Account(accountNumber)
);
-- Create the transaction Employee table
-- This table will store the transaction information for each employee.
CREATE TABLE IF NOT EXISTS TransactionEmployee (
    id SERIAL PRIMARY KEY,
    Custumername VARCHAR(50) NOT NULL UNIQUE,
    agency VARCHAR(10) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    birthDate DATE NOT NULL,
    profession VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    address VARCHAR(100) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    country VARCHAR(50) NOT NULL,
    
);
