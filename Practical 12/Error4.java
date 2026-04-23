class AgeNotValidException extends Exception {
    AgeNotValidException(String message) {
        super(message);
    }
}

class TestCustomException {
    static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}