// Login Function
function login(event) {
    event.preventDefault();

    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if (username === "admin" && password === "admin123") {
        alert("Login Successful!");
        window.location.href = "dashboard.html";
    } else {
        alert("Invalid Username or Password!");
    }
}

// Save Student
function saveStudent(event) {
    event.preventDefault();

    const student = {
        id: document.getElementById("studentId").value,
        name: document.getElementById("studentName").value,
        email: document.getElementById("studentEmail").value,
        course: document.getElementById("studentCourse").value
    };

    let students = JSON.parse(localStorage.getItem("students")) || [];

    students.push(student);

    localStorage.setItem("students", JSON.stringify(students));

    alert("Student Added Successfully!");

    document.getElementById("studentForm").reset();
}

// Display Students
function displayStudents() {

    let students = JSON.parse(localStorage.getItem("students")) || [];

    let table = document.getElementById("studentTable");

    if (!table) return;

    table.innerHTML = "";

    students.forEach((student, index) => {

        table.innerHTML += `
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.course}</td>
            <td>
                <button onclick="deleteStudent(${index})">Delete</button>
            </td>
        </tr>`;
    });
}

// Delete Student
function deleteStudent(index) {

    let students = JSON.parse(localStorage.getItem("students")) || [];

    students.splice(index, 1);

    localStorage.setItem("students", JSON.stringify(students));

    displayStudents();
}

// Search Student
function searchStudent() {

    let keyword = document.getElementById("search").value.toLowerCase();

    let students = JSON.parse(localStorage.getItem("students")) || [];

    let table = document.getElementById("studentTable");

    table.innerHTML = "";

    students
        .filter(student =>
            student.name.toLowerCase().includes(keyword)
        )
        .forEach((student, index) => {

            table.innerHTML += `
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.email}</td>
                <td>${student.course}</td>
                <td>
                    <button onclick="deleteStudent(${index})">
                        Delete
                    </button>
                </td>
            </tr>`;
        });
}

// Logout
function logout() {
    alert("Logged Out Successfully!");
    window.location.href = "index.html";
}

// Automatically display students on students.html
window.onload = function () {
    displayStudents();
};
