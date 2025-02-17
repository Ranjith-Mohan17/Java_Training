package com.celcom.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Task {
	String taskName;
	String completed;

	Task(String name, String status) {
		this.taskName = name;
		this.completed = status;
	}
}

class OperationFunctions {
	Scanner sc = new Scanner(System.in);
	Map<Integer, Task> map = new HashMap<>();

	public void addTask(int id) {
		if (map.containsKey(id)) {
			System.out.println("Enter the Unique Id : ");
		} else {
			System.out.println("Enter the Task Name :");
			String name = sc.nextLine();
			Task t = new Task(name, "Pending");
			map.put(id, t);
		}
	}

	public void viewAllTask() {
		if (map.isEmpty()) {
			System.out.println("Task is Empty!!");
		} else {
			for (Map.Entry<Integer, Task> e : map.entrySet()) {
				Task t = e.getValue();
				System.out.println(
						"TASK ID : " + e.getKey() + " TASK NAME : " + t.taskName + " TASK STATUS : " + t.completed);
			}
		}
	}

	public void markTask(int id) {
		Task t = map.get(id);
		t.completed = "Completed";
	}

	public void deleteTask(int id) {
		if (map.containsKey(id)) {
			map.remove(id);
			System.out.println("Task Deleted");
		} else {
			System.out.println("Id Not Found!!");
		}
	}

	public void searchTask(int id) {
		if (map.containsKey(id)) {
			Task t = map.get(id);
			System.out.println("Task Found : ");
			System.out.println("TASK ID : " + id + " TASK NAME : " + t.taskName + " TASK STATUS : " + t.completed);

		} else {
			System.out.println("Id Not Found!!");
		}
	}

	public void checkStatus(int id) {
		if (map.containsKey(id)) {
			Task t = map.get(id);
			if (t.completed == "Completed")
				System.out.println("Completed");
			else
				System.out.println("In Progress");
		} else {
			System.out.println("Id Not Found!!");
		}
	}
}

public class TaskManagement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		OperationFunctions obj = new OperationFunctions();
		int choice, flag = 0, id;
		do {
			System.out.println("1 ----> Add Task");
			System.out.println("2 ----> View All Task");
			System.out.println("3 ----> Mark a Completed Task");
			System.out.println("4 ----> Delete a Task");
			System.out.println("5 ----> Search for a Task");
			System.out.println("6 ----> Check Status for a Task");
			System.out.println("7 ----> Exit");
			System.out.println("Enter the Choice to perform the Task Operation : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter ID");
				id = sc.nextInt();
				obj.addTask(id);
				System.out.println("Task Added");
				break;
			case 2:
				obj.viewAllTask();
				System.out.println("All Task Shown");
				break;
			case 3:
				System.out.println("Enter ID");
				id = sc.nextInt();
				obj.markTask(id);
				System.out.println("Task Marked");
				break;
			case 4:
				System.out.println("Enter ID");
				id = sc.nextInt();
				obj.deleteTask(id);
				break;
			case 5:
				System.out.println("Enter ID");
				id = sc.nextInt();
				obj.searchTask(id);
				break;
			case 6:
				System.out.println("Enter ID");
				id = sc.nextInt();
				obj.checkStatus(id);
				break;
			case 7:
				flag = 1;
				System.out.println("Terminated!!");
				break;
			default:
				System.out.println("Enter the Valid Choice");
				break;
			}
		} while (flag == 0);
		sc.close();
	}
}
