package uas.mkepl;

public class CodeSmellsExample {
    public int longMethod() {
        int a = 42;
        int b = 58;
        int c = 17;
        int d = 24;

        int sum1 = a + b;
        int sum2 = c + d;

        int result1 = sum1;
        int result2 = sum2;

        String phoneNumber = "123-456-7890";

        String userType = "admin";
        switch (userType) {
            case "admin":
                System.out.println("Admin user");
                break;
            case "guest":
                System.out.println("Guest user");
                break;
            default:
                System.out.println("Unknown user");
        }

        Helper helper = new Helper();
        helper.field = "Changed";
        helper.doNothing();

        DataClass data = new DataClass();
        data.field1 = "Data1";
        data.field2 = "Data2";

        return result1 + result2;
    }

    public class Helper {
        public String field;

        public void doNothing() {
            int x = 10;
            int y = 20;
            int z = x + y;
            System.out.println("Sum: " + z);

            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println("Sum: " + c);

            int p = 10;
            int q = 20;
            int r = p + q;
            System.out.println("Sum: " + r);
        }

        public void doSomething() {
            int x = 10;
            int y = 20;
            int z = x + y;
            System.out.println("Sum: " + z);

            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println("Sum: " + c);

            int p = 10;
            int q = 20;
            int r = p + q;
            System.out.println("Sum: " + r);
        }
    }

    public class DataClass {
        public String field1;
        public String field2;
    }
}
