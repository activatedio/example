

CREATE TABLE book (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  isbn VARCHAR(64) NOT NULL UNIQUE,
  title VARCHAR(200) NOT NULL,
  created_at TIMESTAMP,
  updated_at TIMESTAMP
);
