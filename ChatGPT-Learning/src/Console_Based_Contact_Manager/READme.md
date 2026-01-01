Project 2 — Console-Based Contact Manager

Why this project
This project is intentionally:
simpler than the Task Manager
focused on clarity over features
designed to reinforce object boundaries
very common in junior interviews
If you can do this cleanly, you are solid.

Business Problem
A user wants a simple console application to manage contacts.
Each contact represents one person in an address book.
No authentication.
No persistence.
No advanced validation.

Hard Constraints (Non-Negotiable)
Java only
Console-based
In-memory storage only
No files
No databases
No external libraries
No extra features
If you add more, I will ask you to remove them.

Data Model (Fixed)
A Contact has:
an ID
a name
a phone number
an email address
Nothing else.

Functional Requirements
Your application must allow the user to:
Add a contact
View all contacts
Update a contact
Delete a contact
Search for a contact by ID
Exit the program
That is all.

Explicitly NOT Required
No validation rules
No formatting rules
No duplicate checking (yet)
No sorting
No menus inside menus
No enums unless you justify them

What I Expect From You (As Your Senior)
I am evaluating:
clarity of class responsibilities
simplicity of logic
correctness of flow
ability to explain decisions

I am not evaluating:
cleverness
design patterns
optimizations
edge-case perfection

Senior-Level Questions (Answer These Before Coding)
Do not answer me now. Answer them for yourself.
How will you uniquely identify a contact?
Where will contacts be stored?
Which class owns the contact data?
Which class controls user interaction?
How will you handle “contact not found”?
What belongs in main() and what does not?
What will make this project “done”?
If you cannot answer one clearly, pause before writing code.

Definition of Done (This Matters)
The project is done when:
the menu loops correctly
all options work
code is readable
no unused methods exist
no unnecessary features exist
Not when it feels “impressive”.

What You Should Submit
When ready:
share all Java files
explain:
what each class does (one sentence each)
one decision you were unsure about
That’s it.

Final Senior Note
This project is about discipline, not ambition.
You already proved you can think deeply.
Now prove you can stop at the right point.
Take your time.
When you’re ready, share your code.
