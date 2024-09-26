class Marathon {
    public static int fastest(int[] times) {
        int lowestTimeIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[lowestTimeIndex]) {
                lowestTimeIndex = i;
            }
        }
        return lowestTimeIndex;
    }
    public static int second_fastest(int[] times) {
        int lowestTimeIndex = fastest(times);
        int secondLowestTimeIndex = 0;
        if (lowestTimeIndex == 0) {
            secondLowestTimeIndex = 1;
        }
        for (int i = 0; i < times.length; i++) {
            if (i != lowestTimeIndex && times[i] < times[secondLowestTimeIndex]) {
                secondLowestTimeIndex = i;
            }
        }
        return secondLowestTimeIndex;
    }
    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int fastestIndex = fastest(times);
        System.out.println("The fastest runner is " + names[fastestIndex] + " with " +
                times[fastestIndex] + " minutes");
        int secondIndex = second_fastest(times);
        System.out.println("The second fastest runner is " + names[secondIndex] +
                " with " + times[secondIndex] + " minutes");
    }
}
