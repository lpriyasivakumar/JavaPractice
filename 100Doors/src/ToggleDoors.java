public class ToggleDoors {
	static String[] doors;

	public static String answer(int pass) {
		for (int i = 0; i <= pass; i++) {
			if (i == 0) {
				doors = makeDoorsArray();
			} else {
				toggleDoors(i, doors);
			}
		}
		String message = countDoors();
		return message;
	}

	public static String[] makeDoorsArray() {
		String[] doors = new String[100];
		for (int i = 0; i < doors.length; i++) {
			doors[i] = "closed";
		}
		return doors;
	}

	public static void toggleDoors(int pass, String[] doors) {
		if (pass == 1) {
			for (int i = 0; i < doors.length; i++) {
				doors[i] = "open";
			}
		} else {
			for (int i = pass-1; i < 100; i = i + pass) {
				if (doors[i].equals("closed"))
					doors[i] = "open";
				else
					doors[i] = "closed";
			}
		}

	}

	public static String countDoors() {
		int openDoors = 0;
		int closedDoors = 0;
		for (String status : doors) {
			if (status.equals("closed"))
				closedDoors++;
			else
				openDoors++;
		}
		String message = closedDoors + " doors closed and " + openDoors
				+ " doors open";
		return message;

	}
}
