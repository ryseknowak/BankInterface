package EnumsExercises;

public enum Computations {
    ADD {
        @Override
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT {
        @Override
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DEVIDE {
        @Override
        public double perform(double x, double y) {
            return x / y;
        }
    };

    public abstract double perform(double x, double y);
}
