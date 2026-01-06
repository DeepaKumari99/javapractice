class ExceptionHandling {

        public static void main(String[] args) {
            int x = 5, result;

            try {
                result = x / 0;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Cannot divide by zero.");
            }

            System.out.println("Program continues...");
        }
    }
