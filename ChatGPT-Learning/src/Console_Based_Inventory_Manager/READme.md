Final CRUD Project — Console-Based Inventory Manager
Why this project (important)
This project:
reinforces CRUD one last time,
introduces quantities and numbers (without business logic),
forces careful thinking about updates,
is extremely common in junior interviews.
After this, CRUD muscle memory is done.

Business Problem
A small shop wants a simple console application to manage its inventory.
Each item represents a product in stock.
There is no persistence and no users.

Hard Constraints (Strict)
Java only
Console-based
In-memory storage only
No files
No databases
No external libraries
No extra features
If you add more, I will ask you to remove them.

Data Model (Fixed – do not add fields)
An Item has:
an item ID
a name
a quantity (integer)
a price (decimal)
Nothing else.

Functional Requirements
Your application must allow the user to:
Add a new item
View all items
Update an item
Delete an item
Search for an item by ID
Exit the application
That is all.

Explicitly NOT Required
No stock alerts
No totals or reports
No sorting
No categories
No validation rules
No enums unless you justify them
No inheritance
This is intentional.

Senior-Level Questions (Answer for yourself before coding)
Do not answer me now.
Should item IDs be mutable or immutable?
Where will inventory be stored?
How will quantity updates differ from name updates?
What happens if quantity goes negative?
What does “update item” actually mean in user terms?
How will you handle “item not found” consistently?
What makes this project done?
If any answer feels fuzzy, pause before coding.

Definition of Done (Non-Negotiable)
The project is done when:
the menu loops correctly,
all CRUD operations work,
numeric input does not crash the program,
output is readable,
no unused code exists,
no extra features exist.
Not when it feels impressive.
What to Submit
When you are finished:
All Java files
One sentence explaining each class
One decision you were unsure about
That’s it.

Final Senior Note (read carefully)
This is the last CRUD project on purpose.
You’ve already proven:
you can build systems,
you can debug,
you can refactor,
you can reason about responsibility.

Take your time.
Build it cleanly.
Stop when it meets the requirements.
