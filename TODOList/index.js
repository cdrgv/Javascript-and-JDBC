document.getElementById("add-task-btn").addEventListener("click", addTask);
document
  .getElementById("todo-input")
  .addEventListener("keypress", function (e) {
    if (e.key === "Enter") {
      addTask();
    }
  });

document
  .getElementById("delete-completed-btn")
  .addEventListener("click", deleteCompletedTasks);

function addTask() {
  const taskInput = document.getElementById("todo-input");
  const taskText = taskInput.value.trim();
  if (taskText === "") return;

  const todoList = document.getElementById("todo-list");
  const li = document.createElement("li");

  const checkbox = document.createElement("input");
  checkbox.type = "checkbox";
  checkbox.addEventListener("change", toggleTaskCompletion);

  const textNode = document.createTextNode(taskText);

  const deleteBtn = document.createElement("button");
  deleteBtn.textContent = "Delete";
  deleteBtn.addEventListener("click", deleteTask);

  li.appendChild(checkbox);
  li.appendChild(textNode);
  li.appendChild(deleteBtn);

  todoList.appendChild(li);

  taskInput.value = "";
}

function toggleTaskCompletion(event) {
  const li = event.target.parentElement;
  li.classList.toggle("completed");
}

function deleteTask(event) {
  const li = event.target.parentElement;
  li.remove();
}

function deleteCompletedTasks() {
  const todoList = document.getElementById("todo-list");
  const completedTasks = todoList.querySelectorAll(".completed");
  completedTasks.forEach((task) => task.remove());
}