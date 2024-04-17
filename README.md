**Virtual Library Management System (VLMS)**

_Welcome to the Virtual Library System!_

The Virtual Library Management System (VLMS) is a Java application designed to streamline library operations through a console-based interface. It prioritizes speed, accuracy, and reliability, catering to the digital transformation of library management in today's technology-driven world.

**Tech Stack:**
Core Language: Java, Gradle, Git
Data Storage: Flat file storage for storing book details and borrow logs.

**Setup**
1. Clone this project using below code in the terminal  
    git clone https://github.com/punnyajoshi/virtual-library-system.git

2. Navigate to the project directory:
   cd virtual-library-system

3. Build the project
    ./gradlew clean build

4. Run sanity test
    ./gradlew.clean.test


**Features:**

_Book Management:_

1. Add Books:
Easily add new books to the library inventory capturing essential details such as title, author, ISBN, genre, publication date, and number of copies
The system ensures the uniqueness of ISBNs, serving as the primary identifier for each book
Batch uploads from CSV or similar formats are supported

2. Search & View Books:
Search functionality allows users to find books by title, author, or ISBN
Detailed views provide comprehensive information about each book, including its attributes and current availability

**_Transaction Management:**_

1. Borrow Books:
Facilitate the borrowing process using a book's ISBN, recording transaction details like user ID and borrowing date
The inventory is updated to reflect the decreased count of available copies, with error prompts for unavailable books

2. Return Books:
Accommodate book returns using the book's ISBN and user ID, recording return transaction details and updating the inventory accordingly
The system manages and notifies overdue returns

**Insights and Analytics:**

_1. Library Statistics:_
Display a dashboard summarizing vital library statistics, including the total number of books, currently borrowed books, and popular books based on borrow count

_2. Trend Analysis:_
Provide insights into borrowing trends over time, highlighting peak borrowing periods and preferences for specific genres or authors

**Usage:**
1. Add new books to the library using the provided form.
2. Search for books by title, author, or genre. 
3. Borrow books by providing borrower information and book details. 
4. Return borrowed books and update transaction logs. 
5. Analyze library statistics and trends using the provided tools.

**Guidelines**
1. Use core Java libraries and dependencies. 
2. Organize code using Object-Oriented Principles, with classes for Book, User, and Library operations. 
3. Handle errors gracefully, ensuring a smooth user experience. 
4. Maintain data consistency when reading from or writing to files, preventing data loss or inconsistencies.

**Deliverables:**
Source Code: GitHub repository containing well-organized and commented source code.
Documentation: README.md file detailing project overview, setup instructions, features, and descriptions.
Feel free to explore the source code and documentation in the provided GitHub repository to experience the efficiency and effectiveness of the Virtual Library Management System firsthand.

**Contributing:**
_Contribution are welcomed_

1. Fork the repository
2. Create a new branch for your feature or bug fix:
   git checkout -b feature-name
3. Make changes:
    git add .
    git commit -m "First commit"
4. Push the changes to fork
   git push origin feature-name
5. Open a pull request to merge your changes into the main branch of the main repository.

**Maintainers**
Name: Punnya Joshi
Email: punnyajoshi@gmail.com
GitHub profile: https://github.com/punnyajoshi
