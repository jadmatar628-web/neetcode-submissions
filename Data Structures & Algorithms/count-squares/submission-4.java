class CountSquares {

    private Map<Integer, Map<Integer, Integer>> points;

    public CountSquares() {
        points = new HashMap<>();
    }

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];

        points.putIfAbsent(x, new HashMap<>());

        Map<Integer, Integer> column = points.get(x);
        column.put(y, column.getOrDefault(y, 0) + 1);
    }

    private int getCount(int x, int y) {
        if (!points.containsKey(x)) {
            return 0;
        }

        return points.get(x).getOrDefault(y, 0);
    }

    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int result = 0;

        for (int x2 : points.keySet()) {
            if (x2 == x) continue;

            int side = Math.abs(x2 - x);

            for (int y2 : new int[]{y + side, y - side}) {
                result += getCount(x2, y2)
                        * getCount(x2, y)
                        * getCount(x, y2);
            }
        }

        return result;
    }
}
