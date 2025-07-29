interface TaskRepository {
    fun getTasks(): List<Task>
    fun getTaskById(id: String): Task?
    fun addTask(task: Task)
}