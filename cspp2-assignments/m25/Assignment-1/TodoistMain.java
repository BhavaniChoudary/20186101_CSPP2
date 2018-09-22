import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */

class Task {
	private String title;
	private String assignedTo;
	private int timeTocomplete;
	private boolean important;
	private boolean urgent;
	private String status;
	String ifimportant;
	String new_urgent;

	Task(String title, String assignedTo, int timeTocomplete, boolean important, boolean urgent, String status) {
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeTocomplete = timeTocomplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}

	public String toString() {
		if (important) {
			ifimportant = "importantortant";
		} else {
			ifimportant = "Not importantortant";
		}
		if (urgent) {
			new_urgent = "Urgent";
		} else {
			new_urgent = "Not Urgent";
		}
		return title + ", " + assignedTo + ", " + timeTocomplete + ", " + ifimportant + ", " + new_urgent + ", " + status;
	}
}


class Todoist {
	Todoist() {

	}
	void totalTime4Completion() {

	}
	String[] getNextTask(String task, int a) {
		String next_task[];
		next_task = new String[10];
		return next_task;
	}
	String getNextTask(String task) {
		String next_task = "";
		return next_task;
	}
}
/**
 * Class for todoist main.
 */
public class TodoistMain {

	/**
	 * Starts a test.
	 */
	public static void startTest() {
		Todoist todo = new Todoist();
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String[] tokens = s.nextLine().split(",");
			switch (tokens[0]) {
			case "task":
				testTask(tokens);
				break;
			case "add-task":
				testAddTask(todo, tokens);
				break;
			case "print-todoist":
				System.out.println(todo);
				break;
			case "get-next":
				// System.out.println(todo.getNextTask(tokens[1]));
				break;
			case "get-next-n":
				int n = Integer.parseInt(tokens[2]);
				// Task[] tasks = todo.getNextTask(tokens[1], n);
				// System.out.println(Arrays.deepToString(tasks));
				break;
			case "total-time":
				// System.out.println(todo.totalTime4Completion());
				break;
			default:
				break;
			}
		}
	}

	/**
	 * method to test add task.
	 *
	 * @param      todo    The todo
	 * @param      tokens  The tokens
	 */
	public static void testAddTask(final Todoist todo, final String[] tokens) {
		try {
			// todo.addTask(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * method to test the creation of task object.
	 *
	 * @param      tokens  The tokens
	 */
	public static void testTask(final String[] tokens) {
		try {
			System.out.println(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Creates a task object.
	 *
	 * @param      tokens     The tokens
	 *
	 * @return     Task object
	 *
	 * @throws     Exception  if task inputs are invalid
	 */
	public static Task createTask(final String[] tokens) throws Exception {
		String title = tokens[1];
		String assignedTo = tokens[2];
		int timeToComplete = Integer.parseInt(tokens[3]);
		boolean importantortant = tokens[4].equals("y");
		boolean urgent = tokens[5].equals("y");
		String status = tokens[6];
		return new Task(
				   title, assignedTo, timeToComplete, importantortant, urgent, status);
	}

	/**
	 * main method.
	 *
	 * @param      args  The command line arguments
	 */
	public static void main(final String[] args) {
		startTest();
	}
}