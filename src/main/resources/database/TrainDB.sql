-- Create the TrainDB database
CREATE DATABASE TrainDB;

-- Use the TrainDB database
USE TrainDB;

-- Create the User table
CREATE TABLE User (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(50) NOT NULL,
  phoneNumber VARCHAR(20) NOT NULL,
  email VARCHAR(100) NOT NULL,
  isAdmin BIT NOT NULL
);

-- Create the Admin table (extends User)
CREATE TABLE Admin (
  id BIGINT PRIMARY KEY,
  FOREIGN KEY (id) REFERENCES User(id)
);

-- Create the Customer table (extends User)
CREATE TABLE Customer (
  id BIGINT PRIMARY KEY,
  fullname VARCHAR(100) NOT NULL,
  passportId VARCHAR(20) NOT NULL,
  dateOfBirth DATE NOT NULL,
  FOREIGN KEY (id) REFERENCES User(id)
);

-- Create the Cargo table
CREATE TABLE Cargo (
  cargo_id VARCHAR(50) PRIMARY KEY,
  cargo_name VARCHAR(100) NOT NULL,
  available_state BIT NOT NULL
);

-- Create the Schedule table
CREATE TABLE Schedule (
  schedule_id VARCHAR(50) PRIMARY KEY,
  startPoint VARCHAR(100) NOT NULL,
  destination VARCHAR(100) NOT NULL,
  start_date DATE NOT NULL,
  arrive_date DATE NOT NULL,
  start_time TIME NOT NULL,
  train_id VARCHAR(50) NOT NULL,
  FOREIGN KEY (train_id) REFERENCES Train(train_id)
);

-- Create the Seat table
CREATE TABLE Seat (
  seat_number VARCHAR(10) PRIMARY KEY,
  cargo_id VARCHAR(50) NOT NULL,
  FOREIGN KEY (cargo_id) REFERENCES Cargo(cargo_id)
);

-- Create the Ticket table
CREATE TABLE Ticket (
  ticket_id VARCHAR(50) PRIMARY KEY,
  train_id VARCHAR(50) NOT NULL,
  cargo_id VARCHAR(50) NOT NULL,
  seat_number VARCHAR(10) NOT NULL,
  schedule_id VARCHAR(50) NOT NULL,
  passport_id VARCHAR(20) NOT NULL,
  customer_name VARCHAR(100) NOT NULL,
  fare BIGINT NOT NULL,
  is_available BIT NOT NULL,
  FOREIGN KEY (train_id) REFERENCES Train(train_id),
  FOREIGN KEY (cargo_id) REFERENCES Cargo(cargo_id),
  FOREIGN KEY (schedule_id) REFERENCES Schedule(schedule_id)
);

-- Create the Train table
CREATE TABLE Train (
  train_id VARCHAR(50) PRIMARY KEY,
  train_name VARCHAR(100) NOT NULL,
  available_state BIT NOT NULL,
  startPoint VARCHAR(100) NOT NULL
);

-- Insert into User table
INSERT INTO User (id, username, password, phoneNumber, email, isAdmin)
VALUES (1, 'admin', 'admin123', '0123456789', 'admin@example.com',  true);

-- Insert into Admin table
INSERT INTO Admin (id)
VALUES (1);

-- Insert into User table
INSERT INTO User (id, username, password, phoneNumber, email, isAdmin)
VALUES (2, 'johndoe', 'customer123', '0987654321', 'customer@example.com', false);

-- Insert into Customer table
INSERT INTO Customer (id, fullname, passportId, dateOfBirth)
VALUES (2, 'John Doe', '666345678', '1990-01-01');
