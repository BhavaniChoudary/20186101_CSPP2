import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class titleException extends Exception {
	public String toString() {
		return "Title not provided";
	}
}

class Task {
	private String title;
	private String assignedTo;
	private int timeTocomplete;
	private boolean important;
	private boolean urgent;
	private String status;
	String ifimportant;
	String urgency;
	boolean isException = false;

	Task(String title, String assignedTo, int timeTocomplete, boolean important, boolean urgent, String status) {
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeTocomplete = timeTocomplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
		try {
			if (title.length() <= 0) {
				throw new Exception("Title not provided");
			}
			if (timeTocomplete <= 0) {
				throw new Exception("Invalid timeToComplete " + timeTocomplete);
			}
			if (status.equals("todo") || status.equals("done")) {
			} else {
				throw new Exception("Invalid status " + status);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	int gettimeTocomplete(){
		return timeTocomplete;
	}
	String getTaskTitle() {
		return title;
	}
	String getAssignedTo() {
		return assignedTo;
	}
	boolean getUrgent() {
		return urgent;
	}
	boolean getImp() {
		return important;
	}
	String getStatus() {
		return status;
	}


	// public String title() {
	//  return title;
	// }
	// public String assignedTo() {
	//  return assignedTo;
	// }
	// public int timeTocomplete() {
	//  return timeTocomplete;
	// }
	// public boolean important() {
	//  return important;
	// }
	// public boolean urgent() {
	//  return urgent;
	// }
	// public String status() {
	//  return status;
	// }
	public String toString() {
		if (important) {
			ifimportant = "Important";
		} else {
			ifimportant = "Not Important";
		}
		if (urgent) {
			urgency = "Urgent";
		} else {
			urgency = "Not Urgent";
		}
		return title + ", " + assignedTo + ", " + timeTocomplete + ", " + ifimportant + ", " + urgency + ", " + status;
	}
}

class Todoist{
	
	Task[] tasks;
	int taskArray;

	Todoist() {
		tasks = new Task[10];
		taskArray = 0;
	}

	public void addTask(Task t) {
		tasks[taskArray++] = t;
	}

	public String toString() {
		for(int i = 0; i < taskArray; i++) {
			String ret = tasks[i].toString();
			System.out.println(ret);
		}
		return "";
	}
}

// class Todoist {
//  Todoist() {

//  }
//  void totalTime4Completion() {

//  }
//  String[] getNextTask(String task, int a) {
//      String next_task[];
//      next_task = new String[10];
//      return next_task;
//  }
//  String getNextTask(String task) {
//      String next_task = "";
//      return next_task;
//  }
// }
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
				//System.out.println(todo.getNextTask(tokens[1]));
				break;
			// case "get-next-n":
			//  int n = Integer.parseInt(tokens[2]);
			//  Task[] tasks = todo.getNextTask(tokens[1], n);
			//  System.out.println(Arrays.deepToString(tasks));
			//  break;
			// case "total-time":
			//  System.out.println(todo.totalTime4Completion());
			//  break;
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
			//todo.addTask(createTask(tokens));
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
		boolean important = tokens[4].equals("y");
		boolean urgent = tokens[5].equals("y");
		String status = tokens[6];
		return new Task(
				   title, assignedTo, timeToComplete, important, urgent, status);
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