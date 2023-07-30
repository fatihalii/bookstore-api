
# Bookstore API

The Bookstore API is a RESTful API that allows users to interact with a virtual bookstore. Users can retrieve a list of books, search for books by title or author, get details of a specific book, and perform other CRUD (Create, Read, Update, Delete) operations on the book collection.




## Table Of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Api Endpoints](#api-endpoints)
- [Usage](#usage)
- [Contributing](#contributing)



## Features

- Retrieve a list of all books in the bookstore.
- Search for books by title or author.
- Get detailed information about a specific book using its unique identifier.
- Add a new book to the bookstore.
- Update book information.
- Delete a book from the bookstore.


## Technologies Used

- Spring Boot: A powerful Java framework for building web applications and RESTful APIs.
- Spring Data JPA: Simplifies database access and management using Java Persistence API (JPA).
- MySQL: Stores the book data.
- Maven: Manages project dependencies and build process.
- Java 17: The programming language used for the project.
- Postman (optional): For testing API endpoints.


## Installation

1.Clone the repository:

```bash
  git clone https://github.com/fatihalii/bookstore-api.git
  cd bookstore-api
```
1.Set up the database:
- Install MySQL (if not already installed).
- Create a new database for the bookstore API.
- Update the database connection properties in `application.properties`.
  2.Build and run the application
```bash
 mvn spring-boot:run
```
1.The API will be available at: `http://localhost:8080/api/books`


## Api Endpoints

The API supports the following endpoints:

- GET /api/books: Get a list of all books.
- GET /api/books/{id}: Get details of a specific book by its ID.
- GET /api/books/author: Get details of a specific book by its Author.
- GET /api/books/title: Get details of a specific book by its Title.
- POST /api/books: a new book to the bookstore.
- PUT /api/books/update: Update book information by its ID.
- DELETE /api/books/{id}: Delete a book from the bookstore by its ID.
## Usage

Here are some examples of how to use the API endpoints:

- Retrieve all books:
```bash
GET /api/books
```

- Get details of a specific book:
```bash
GET /api/books{id}
```

- Get details of a specific book by its author:
```bash
GET /api/books/author/?author=Author+Name
```

- Get details of a specific book by its title:
```bash
GET /api/books/author/?author=Title
```

- Add a new book:
```bash
POST /api/books
{"title" : "Book Title","author" : "Author Name","isbn" : 000000}
```

- Update book information:
```bash
PUT /api/books/{id}
{"title" : "Updated Title","author" : "Updated Author","isbn" : 999999}
```

- Delete a book:
```bash
DELETE /api/books/{id}
```





## Contributing

Contributions are always welcome!
If you find any issues or want to add new features,
please feel free to open an issue or submit a pull request.

