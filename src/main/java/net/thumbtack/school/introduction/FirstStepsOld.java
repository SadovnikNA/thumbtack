package net.thumbtack.school.introduction;

public class FirstStepsOld {
    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public int mul(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int mul = 1;
        for (int elem : array) {
            mul *= elem;
        }
        return mul;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 3);
        }
    }

    public boolean find(int[] array, int value) {
        for (int elem : array) {
            if (value == elem) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int xxx = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = xxx;
        }
    }


}

