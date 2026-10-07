CREATE DATABASE IF NOT EXISTS gym_management;
USE gym_management;

CREATE TABLE members (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(30) NOT NULL,
    email VARCHAR(150),
    membership_type VARCHAR(50) NOT NULL,
    join_date DATE NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE staff (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    role VARCHAR(100) NOT NULL,
    phone VARCHAR(30),
    salary DECIMAL(10,2)
);

CREATE TABLE equipment (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    quantity INT NOT NULL,
    equipment_condition VARCHAR(50)
);

CREATE TABLE attendance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id INT NOT NULL,
    check_in TIMESTAMP NOT NULL,
    FOREIGN KEY (member_id) REFERENCES members(id)
);

CREATE TABLE rates (
    id INT PRIMARY KEY AUTO_INCREMENT,
    membership_type VARCHAR(50) NOT NULL,
    amount DECIMAL(10,2) NOT NULL
);

CREATE TABLE announcements (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL
);

CREATE TABLE admins (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);
