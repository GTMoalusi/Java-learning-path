The Project (Junior-Level, Clearly Scoped)

Project Title
Console-Based Task Manager
This project is deliberately chosen because:
it is common in interviews,
it exercises core skills,
it exposes thinking gaps without overwhelming scope.

Business Problem (Read Carefully)
A small team wants a simple console application to manage tasks.
There is no database and no UI beyond the console.
The application must allow a user to:
create tasks,
view tasks,
update tasks,
delete tasks,
exit the application safely.
Nothing more.

Your Role
You are a Junior Software Engineer tasked with delivering a working first version.
The goal is correctness, clarity, and reasoning, not cleverness.

Hard Constraints (Non-Negotiable)
Java only
Console-based
In-memory storage only
No external libraries
No file storage
No advanced features (priorities, due dates, users, authentication, etc.)
If you add extra features, I will ask you to remove them.

Data Model (Minimal Expectations)
A Task has:
an ID
a title
a description
a status (e.g. TODO / DONE)
Nothing else.

Functional Requirements (What the system must do)
Display a menu repeatedly until the user exits
Create a task
View all tasks
Update an existing task
Delete a task
Exit cleanly

What I Expect From You (Very Important)
I am not evaluating:
how many features you add
how “advanced” your code is

I am evaluating:
how you structure your code
how you name things
how you handle user input
how you prevent obvious bugs
whether you can explain why your code exists

Questions You Must Answer Before Writing Code
Do not answer me now. Answer them for yourself, then code.
How will you uniquely identify a task?
Where will tasks be stored?
How will the menu loop work?
How will you handle invalid user input?
What happens if a user tries to update or delete a non-existent task?
What classes do you actually need?
What logic belongs in main, and what does not?
If you cannot answer one of these clearly, stop and think before coding.

Definition of “Done” (This Is Critical)
The project is considered complete when:
The program runs without crashing
All menu options work as described
Code is readable and consistent
No unused code exists
No unnecessary features exist
Not when it is “perfect”.
What You Should Submit

When you are done:
Share all Java files
Briefly explain:
what each class does
one design decision you are unsure about
That is all.

What I Will Do When You Submit
I will:
review your code as a senior engineer,
point out strengths,
point out issues,
ask follow-up questions,
help you improve thinking, not just syntax.
I will not rewrite your code for you unless absolutely necessary.

Final Note (Read This Twice)
You are not being tested on brilliance.
You are being tested on discipline and clarity.
This project is intentionally small so you can finish it and feel grounded.
Take your time.
When you are ready, share your code.
